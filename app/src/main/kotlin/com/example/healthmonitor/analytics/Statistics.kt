package com.example.healthmonitor.analytics

import com.example.healthmonitor.model.DailySummary
import com.example.healthmonitor.model.HealthTrend
import com.example.healthmonitor.model.MetricSample
import kotlin.math.abs
import kotlin.math.roundToInt

class StatisticsCalculator {
    fun summarize(date: String, samples: List<MetricSample>): DailySummary {
        if (samples.isEmpty()) {
            return DailySummary(
                date = date,
                averageHeartRate = 0.0,
                totalSteps = 0,
                sleepHours = 0.0,
                caloriesBurned = 0.0,
                stressIndex = 0.0,
                temperatureAvg = 0.0
            )
        }
        val averageHeartRate = samples.map { it.heartRate }.average()
        val totalSteps = samples.sumOf { it.steps }
        val sleepHours = samples.sumOf { it.sleepHours }
        val caloriesBurned = samples.sumOf { it.caloriesBurned }
        val stressIndex = samples.map { it.stressLevel }.average()
        val temperatureAvg = samples.map { it.bodyTemperatureC }.average()
        return DailySummary(
            date = date,
            averageHeartRate = averageHeartRate,
            totalSteps = totalSteps,
            sleepHours = sleepHours,
            caloriesBurned = caloriesBurned,
            stressIndex = stressIndex,
            temperatureAvg = temperatureAvg
        )
    }

    fun trend(current: DailySummary, baseline: DailySummary): HealthTrend {
        return HealthTrend(
            trendLabel = labelTrend(current, baseline),
            heartRateChange = deltaPercent(current.averageHeartRate, baseline.averageHeartRate),
            stepsChange = deltaPercent(current.totalSteps.toDouble(), baseline.totalSteps.toDouble()),
            sleepChange = deltaPercent(current.sleepHours, baseline.sleepHours),
            stressChange = deltaPercent(current.stressIndex, baseline.stressIndex)
        )
    }

    fun rollingAverage(values: List<Double>, window: Int): List<Double> {
        if (values.isEmpty() || window <= 0) return emptyList()
        val averages = mutableListOf<Double>()
        for (index in values.indices) {
            val start = (index - window + 1).coerceAtLeast(0)
            val slice = values.subList(start, index + 1)
            averages += slice.average()
        }
        return averages
    }

    fun variability(values: List<Double>): Double {
        if (values.isEmpty()) return 0.0
        val avg = values.average()
        val variance = values.map { (it - avg) * (it - avg) }.average()
        return kotlin.math.sqrt(variance)
    }

    fun trendLabelFromChanges(changes: Map<String, Double>): String {
        if (changes.isEmpty()) return "stable"
        val positives = changes.values.count { it > 0 }
        val negatives = changes.values.count { it < 0 }
        return when {
            positives > negatives -> "improving"
            negatives > positives -> "declining"
            else -> "stable"
        }
    }

    private fun labelTrend(current: DailySummary, baseline: DailySummary): String {
        val changes = mapOf(
            "hr" to deltaPercent(current.averageHeartRate, baseline.averageHeartRate),
            "steps" to deltaPercent(current.totalSteps.toDouble(), baseline.totalSteps.toDouble()),
            "sleep" to deltaPercent(current.sleepHours, baseline.sleepHours),
            "stress" to deltaPercent(current.stressIndex, baseline.stressIndex)
        )
        return trendLabelFromChanges(changes)
    }

    private fun deltaPercent(current: Double, baseline: Double): Double {
        if (baseline == 0.0) return 0.0
        return ((current - baseline) / baseline) * 100
    }
}

class SignalNormalizer {
    fun normalizeHeartRate(value: Int, restingRate: Int): Double =
        clamp((value - restingRate) / restingRate.toDouble())

    fun normalizeSteps(steps: Int, targetSteps: Int): Double =
        clamp(steps / targetSteps.toDouble())

    fun normalizeSleep(hours: Double, targetSleep: Double): Double =
        clamp(hours / targetSleep)

    fun normalizeStress(stress: Int): Double =
        clamp(stress / 10.0)

    fun normalizeTemperature(tempC: Double): Double =
        clamp((tempC - 35.0) / 5.0)

    private fun clamp(value: Double): Double = value.coerceIn(0.0, 1.0)
}

class ScorecardBuilder {
    fun buildScorecard(summary: DailySummary, baseline: DailySummary): Scorecard {
        val score = score(summary, baseline)
        val category = when {
            score >= 0.85 -> "excellent"
            score >= 0.7 -> "good"
            score >= 0.5 -> "moderate"
            else -> "needs_attention"
        }
        return Scorecard(score = score, category = category)
    }

    fun score(summary: DailySummary, baseline: DailySummary): Double {
        val deltas = listOf(
            delta(summary.averageHeartRate, baseline.averageHeartRate),
            delta(summary.sleepHours, baseline.sleepHours),
            delta(summary.stressIndex, baseline.stressIndex),
            delta(summary.temperatureAvg, baseline.temperatureAvg)
        )
        val adjusted = deltas.map { 1 - abs(it) }
        return adjusted.average().coerceIn(0.0, 1.0)
    }

    private fun delta(current: Double, baseline: Double): Double {
        if (baseline == 0.0) return 0.0
        return (current - baseline) / baseline
    }
}

data class Scorecard(
    val score: Double,
    val category: String
) {
    fun asPercent(): Int = (score * 100).roundToInt()
}
