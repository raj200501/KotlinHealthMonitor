package com.example.healthmonitor.util

import com.example.healthmonitor.model.*

object JsonCodec {
    fun encodeError(response: ErrorResponse): String =
        "{" + field("error", response.error) + optionalField("details", response.details) + "}"

    fun encodeHealthStatus(response: HealthStatusResponse): String =
        "{" +
            field("status", response.status) +
            field("uptimeSeconds", response.uptimeSeconds, leadingComma = true) +
            field("version", response.version, leadingComma = true) +
            "}"

    fun encodeUserSummary(response: UserSummaryResponse): String =
        "{" +
            field("user", encodeUserProfile(response.user), raw = true) +
            field("summary", encodeDailySummary(response.summary), raw = true, leadingComma = true) +
            field("trend", encodeHealthTrend(response.trend), raw = true, leadingComma = true) +
            field("recommendations", encodeRecommendations(response.recommendations), raw = true, leadingComma = true) +
            "}"

    fun encodeMetricIngestResponse(response: MetricIngestResponse): String =
        "{" +
            field("requestId", response.requestId) +
            field("stored", response.stored, leadingComma = true) +
            field("storedAt", response.storedAt, leadingComma = true) +
            "}"

    fun encodeHealthSnapshot(snapshot: HealthSnapshot): String =
        "{" +
            field("user", encodeUserProfile(snapshot.user), raw = true) +
            field("latestSample", encodeMetricSample(snapshot.latestSample), raw = true, leadingComma = true) +
            field("dailySummary", encodeDailySummary(snapshot.dailySummary), raw = true, leadingComma = true) +
            field("trend", encodeHealthTrend(snapshot.trend), raw = true, leadingComma = true) +
            field("recommendations", encodeRecommendations(snapshot.recommendations), raw = true, leadingComma = true) +
            "}"

    fun encodeScorecard(scorecard: com.example.healthmonitor.analytics.Scorecard): String =
        "{" +
            field("score", scorecard.score) +
            field("category", scorecard.category, leadingComma = true) +
            field("percent", scorecard.asPercent(), leadingComma = true) +
            "}"

    fun encodeMetricReport(report: MetricReport): String =
        "{" +
            field("userId", report.userId) +
            field("startDate", report.startDate, leadingComma = true) +
            field("endDate", report.endDate, leadingComma = true) +
            field("summaries", encodeDailySummaries(report.summaries), raw = true, leadingComma = true) +
            "}"

    fun encodeSystemReport(report: SystemReport): String =
        "{" +
            field("generatedAt", report.generatedAt) +
            field("totalUsers", report.totalUsers, leadingComma = true) +
            field("totalSamples", report.totalSamples, leadingComma = true) +
            field("averageSteps", report.averageSteps, leadingComma = true) +
            field("averageSleepHours", report.averageSleepHours, leadingComma = true) +
            "}"

    fun encodeDailySummary(summary: DailySummary): String =
        "{" +
            field("date", summary.date) +
            field("averageHeartRate", summary.averageHeartRate, leadingComma = true) +
            field("totalSteps", summary.totalSteps, leadingComma = true) +
            field("sleepHours", summary.sleepHours, leadingComma = true) +
            field("caloriesBurned", summary.caloriesBurned, leadingComma = true) +
            field("stressIndex", summary.stressIndex, leadingComma = true) +
            field("temperatureAvg", summary.temperatureAvg, leadingComma = true) +
            "}"

    fun encodeMetricSample(sample: MetricSample): String =
        "{" +
            field("timestamp", sample.timestamp) +
            field("heartRate", sample.heartRate, leadingComma = true) +
            field("steps", sample.steps, leadingComma = true) +
            field("sleepHours", sample.sleepHours, leadingComma = true) +
            field("caloriesBurned", sample.caloriesBurned, leadingComma = true) +
            field("stressLevel", sample.stressLevel, leadingComma = true) +
            field("bodyTemperatureC", sample.bodyTemperatureC, leadingComma = true) +
            "}"

    fun encodeHealthMetricRequest(request: HealthMetricRequest): String =
        "{" +
            field("userId", request.userId) +
            field("timestamp", request.timestamp, leadingComma = true) +
            field("heartRate", request.heartRate, leadingComma = true) +
            field("steps", request.steps, leadingComma = true) +
            field("sleepHours", request.sleepHours, leadingComma = true) +
            field("caloriesBurned", request.caloriesBurned, leadingComma = true) +
            field("stressLevel", request.stressLevel, leadingComma = true) +
            field("bodyTemperatureC", request.bodyTemperatureC, leadingComma = true) +
            "}"

    fun encodeUserProfile(profile: UserProfile): String =
        "{" +
            field("id", profile.id) +
            field("displayName", profile.displayName, leadingComma = true) +
            field("age", profile.age, leadingComma = true) +
            field("heightCm", profile.heightCm, leadingComma = true) +
            field("weightKg", profile.weightKg, leadingComma = true) +
            field("targetSteps", profile.targetSteps, leadingComma = true) +
            field("targetSleepHours", profile.targetSleepHours, leadingComma = true) +
            field("restingHeartRate", profile.restingHeartRate, leadingComma = true) +
            "}"

    fun encodeHealthTrend(trend: HealthTrend): String =
        "{" +
            field("trendLabel", trend.trendLabel) +
            field("heartRateChange", trend.heartRateChange, leadingComma = true) +
            field("stepsChange", trend.stepsChange, leadingComma = true) +
            field("sleepChange", trend.sleepChange, leadingComma = true) +
            field("stressChange", trend.stressChange, leadingComma = true) +
            "}"

    fun encodeRecommendations(recommendations: List<Recommendation>): String =
        recommendations.joinToString(prefix = "[", postfix = "]") { encodeRecommendation(it) }

    fun encodeRecommendation(recommendation: Recommendation): String =
        "{" +
            field("id", recommendation.id) +
            field("title", recommendation.title, leadingComma = true) +
            field("message", recommendation.message, leadingComma = true) +
            field("priority", recommendation.priority.name, leadingComma = true) +
            field("actionable", recommendation.actionable, leadingComma = true) +
            "}"

    fun encodeDailySummaries(summaries: List<DailySummary>): String =
        summaries.joinToString(prefix = "[", postfix = "]") { encodeDailySummary(it) }

    fun decodeHealthMetricRequest(json: String): HealthMetricRequest {
        val obj = SimpleJsonParser(json).parseObject()
        return HealthMetricRequest(
            userId = obj.requireString("userId"),
            timestamp = obj.requireString("timestamp"),
            heartRate = obj.requireInt("heartRate"),
            steps = obj.requireInt("steps"),
            sleepHours = obj.requireDouble("sleepHours"),
            caloriesBurned = obj.requireDouble("caloriesBurned"),
            stressLevel = obj.requireInt("stressLevel"),
            bodyTemperatureC = obj.requireDouble("bodyTemperatureC")
        )
    }

    fun decodeSeedRequest(json: String): String =
        SimpleJsonParser(json).parseObject().requireString("userId")

    fun decodeSummaryRequest(json: String): Pair<String, String> {
        val obj = SimpleJsonParser(json).parseObject()
        return obj.requireString("userId") to obj.requireString("date")
    }

    fun decodeReportFilter(json: String): ReportFilter {
        val obj = SimpleJsonParser(json).parseObject()
        return ReportFilter(
            userId = obj.requireString("userId"),
            startDate = obj.requireString("startDate"),
            endDate = obj.requireString("endDate")
        )
    }

    fun decodeUserProfile(json: String): UserProfile {
        val obj = SimpleJsonParser(json).parseObject()
        return UserProfile(
            id = obj.requireString("id"),
            displayName = obj.requireString("displayName"),
            age = obj.requireInt("age"),
            heightCm = obj.requireDouble("heightCm"),
            weightKg = obj.requireDouble("weightKg"),
            targetSteps = obj.requireInt("targetSteps"),
            targetSleepHours = obj.requireDouble("targetSleepHours"),
            restingHeartRate = obj.requireInt("restingHeartRate")
        )
    }

    fun decodeMetricSample(json: String): MetricSample {
        val obj = SimpleJsonParser(json).parseObject()
        return MetricSample(
            timestamp = obj.requireString("timestamp"),
            heartRate = obj.requireInt("heartRate"),
            steps = obj.requireInt("steps"),
            sleepHours = obj.requireDouble("sleepHours"),
            caloriesBurned = obj.requireDouble("caloriesBurned"),
            stressLevel = obj.requireInt("stressLevel"),
            bodyTemperatureC = obj.requireDouble("bodyTemperatureC")
        )
    }

    fun decodeDailySummary(json: String): DailySummary {
        val obj = SimpleJsonParser(json).parseObject()
        return DailySummary(
            date = obj.requireString("date"),
            averageHeartRate = obj.requireDouble("averageHeartRate"),
            totalSteps = obj.requireInt("totalSteps"),
            sleepHours = obj.requireDouble("sleepHours"),
            caloriesBurned = obj.requireDouble("caloriesBurned"),
            stressIndex = obj.requireDouble("stressIndex"),
            temperatureAvg = obj.requireDouble("temperatureAvg")
        )
    }

    private fun field(
        name: String,
        value: Any,
        raw: Boolean = false,
        leadingComma: Boolean = false
    ): String {
        val prefix = if (leadingComma) "," else ""
        val rendered = if (raw) value.toString() else renderValue(value)
        return "$prefix${SimpleJsonWriter.quote(name)}:$rendered"
    }

    private fun optionalField(name: String, value: String?): String {
        return if (value == null) "" else ",${SimpleJsonWriter.quote(name)}:${SimpleJsonWriter.quote(value)}"
    }

    private fun renderValue(value: Any): String = when (value) {
        is String -> SimpleJsonWriter.quote(value)
        is Number -> value.toString()
        is Boolean -> value.toString()
        else -> SimpleJsonWriter.quote(value.toString())
    }
}

private fun Map<String, Any?>.requireString(key: String): String =
    (this[key] as? String) ?: error("Missing or invalid $key")

private fun Map<String, Any?>.requireInt(key: String): Int = when (val value = this[key]) {
    is Number -> value.toInt()
    is String -> value.toInt()
    else -> error("Missing or invalid $key")
}

private fun Map<String, Any?>.requireDouble(key: String): Double = when (val value = this[key]) {
    is Number -> value.toDouble()
    is String -> value.toDouble()
    else -> error("Missing or invalid $key")
}
