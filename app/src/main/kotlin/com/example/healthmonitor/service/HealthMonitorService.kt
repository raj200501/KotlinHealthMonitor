package com.example.healthmonitor.service

import com.example.healthmonitor.analytics.Scorecard
import com.example.healthmonitor.analytics.ScorecardBuilder
import com.example.healthmonitor.analytics.StatisticsCalculator
import com.example.healthmonitor.model.*
import com.example.healthmonitor.recommendation.RecommendationEngine
import com.example.healthmonitor.storage.LocalHealthStore
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

class HealthMonitorService(
    private val store: LocalHealthStore,
    private val statistics: StatisticsCalculator = StatisticsCalculator(),
    private val recommendationEngine: RecommendationEngine = RecommendationEngine(),
    private val scorecardBuilder: ScorecardBuilder = ScorecardBuilder()
) {
    fun ingest(request: HealthMetricRequest): MetricIngestResponse {
        val sample = request.toMetricSample()
        store.appendSample(request.userId, sample)
        return MetricIngestResponse(
            requestId = ModelDefaults.requestId(),
            stored = true,
            storedAt = ModelDefaults.now()
        )
    }

    fun ensureProfile(profile: UserProfile) {
        store.saveProfile(profile)
    }

    fun buildSnapshot(userId: String): HealthSnapshot {
        val profile = requireNotNull(store.loadProfile(userId)) {
            "Unknown user: $userId"
        }
        val samples = store.loadSamples(userId)
        val latest = samples.lastOrNull() ?: fallbackSample(profile)
        val today = LocalDate.now(ZoneOffset.UTC)
        val summary = store.loadSummary(userId, today) ?: statistics.summarize(today.toString(), samples)
        val baseline = baselineSummary(samples, today)
        val trend = statistics.trend(summary, baseline)
        val recommendations = recommendationEngine.generate(profile, summary)
        return HealthSnapshot(
            user = profile,
            latestSample = latest,
            dailySummary = summary,
            trend = trend,
            recommendations = recommendations
        )
    }

    fun summary(userId: String): UserSummaryResponse {
        val profile = requireNotNull(store.loadProfile(userId)) {
            "Unknown user: $userId"
        }
        val samples = store.loadSamples(userId)
        val today = LocalDate.now(ZoneOffset.UTC)
        val summary = store.loadSummary(userId, today) ?: statistics.summarize(today.toString(), samples)
        val baseline = baselineSummary(samples, today)
        val trend = statistics.trend(summary, baseline)
        val recommendations = recommendationEngine.generate(profile, summary)
        return UserSummaryResponse(profile, summary, trend, recommendations)
    }

    fun updateDailySummary(userId: String, date: LocalDate): DailySummary {
        val samples = store.loadSamples(userId)
            .filter { LocalDate.parse(it.timestamp.substring(0, 10)) == date }
        val summary = statistics.summarize(date.toString(), samples)
        store.saveSummary(userId, date, summary)
        return summary
    }

    fun validate(request: HealthMetricRequest): ValidationResult {
        val issues = mutableListOf<String>()
        if (request.userId.isBlank()) issues += "userId is required"
        if (request.heartRate !in 30..220) issues += "heartRate out of range"
        if (request.steps < 0) issues += "steps cannot be negative"
        if (request.sleepHours !in 0.0..24.0) issues += "sleepHours out of range"
        if (request.caloriesBurned < 0) issues += "caloriesBurned cannot be negative"
        if (request.stressLevel !in 0..10) issues += "stressLevel out of range"
        if (request.bodyTemperatureC !in 34.0..42.0) issues += "bodyTemperatureC out of range"
        return ValidationResult(issues.isEmpty(), issues)
    }

    fun scorecard(userId: String): Scorecard {
        val summaries = store.loadSummaries(userId)
        if (summaries.isEmpty()) {
            return Scorecard(score = 0.0, category = "insufficient_data")
        }
        val latest = summaries.maxBy { it.date }
        val baseline = summaries.minBy { it.date }
        return scorecardBuilder.buildScorecard(latest, baseline)
    }

    fun systemReport(): SystemReport {
        val profiles = store.loadProfiles()
        val samples = profiles.flatMap { store.loadSamples(it.id) }
        val summaries = profiles.flatMap { store.loadSummaries(it.id) }
        return SystemReport(
            generatedAt = ModelDefaults.now(),
            totalUsers = profiles.size,
            totalSamples = samples.size,
            averageSteps = if (summaries.isNotEmpty()) summaries.map { it.totalSteps }.average() else 0.0,
            averageSleepHours = if (summaries.isNotEmpty()) summaries.map { it.sleepHours }.average() else 0.0
        )
    }

    private fun fallbackSample(profile: UserProfile): MetricSample = MetricSample(
        timestamp = Instant.now().toString(),
        heartRate = profile.restingHeartRate,
        steps = 0,
        sleepHours = 0.0,
        caloriesBurned = 0.0,
        stressLevel = 3,
        bodyTemperatureC = 36.5
    )

    private fun baselineSummary(samples: List<MetricSample>, today: LocalDate): DailySummary {
        val baselineDate = today.minusDays(7)
        val baselineSamples = samples.filter { LocalDate.parse(it.timestamp.substring(0, 10)) == baselineDate }
        return statistics.summarize(baselineDate.toString(), baselineSamples)
    }
}
