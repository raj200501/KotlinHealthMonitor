package com.example.healthmonitor.model
import java.time.Instant
import java.time.LocalDate
import java.util.UUID

data class UserProfile(
    val id: String,
    val displayName: String,
    val age: Int,
    val heightCm: Double,
    val weightKg: Double,
    val targetSteps: Int,
    val targetSleepHours: Double,
    val restingHeartRate: Int
)

data class MetricSample(
    val timestamp: String,
    val heartRate: Int,
    val steps: Int,
    val sleepHours: Double,
    val caloriesBurned: Double,
    val stressLevel: Int,
    val bodyTemperatureC: Double
)

data class DailySummary(
    val date: String,
    val averageHeartRate: Double,
    val totalSteps: Int,
    val sleepHours: Double,
    val caloriesBurned: Double,
    val stressIndex: Double,
    val temperatureAvg: Double
)

data class HealthTrend(
    val trendLabel: String,
    val heartRateChange: Double,
    val stepsChange: Double,
    val sleepChange: Double,
    val stressChange: Double
)

data class Recommendation(
    val id: String,
    val title: String,
    val message: String,
    val priority: Priority,
    val actionable: Boolean
)

data class HealthSnapshot(
    val user: UserProfile,
    val latestSample: MetricSample,
    val dailySummary: DailySummary,
    val trend: HealthTrend,
    val recommendations: List<Recommendation>
)

data class HealthMetricRequest(
    val userId: String,
    val timestamp: String,
    val heartRate: Int,
    val steps: Int,
    val sleepHours: Double,
    val caloriesBurned: Double,
    val stressLevel: Int,
    val bodyTemperatureC: Double
) {
    fun toMetricSample(): MetricSample = MetricSample(
        timestamp = timestamp,
        heartRate = heartRate,
        steps = steps,
        sleepHours = sleepHours,
        caloriesBurned = caloriesBurned,
        stressLevel = stressLevel,
        bodyTemperatureC = bodyTemperatureC
    )
}

data class ErrorResponse(
    val error: String,
    val details: String? = null
)

data class HealthStatusResponse(
    val status: String,
    val uptimeSeconds: Long,
    val version: String
)

data class UserSummaryResponse(
    val user: UserProfile,
    val summary: DailySummary,
    val trend: HealthTrend,
    val recommendations: List<Recommendation>
)

data class MetricIngestResponse(
    val requestId: String,
    val stored: Boolean,
    val storedAt: String
)

data class ValidationResult(
    val valid: Boolean,
    val issues: List<String>
)

data class ReportFilter(
    val userId: String,
    val startDate: String,
    val endDate: String
)

data class MetricReport(
    val userId: String,
    val startDate: String,
    val endDate: String,
    val summaries: List<DailySummary>
)

data class SystemReport(
    val generatedAt: String,
    val totalUsers: Int,
    val totalSamples: Int,
    val averageSteps: Double,
    val averageSleepHours: Double
)

enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}

object ModelDefaults {
    fun requestId(): String = UUID.randomUUID().toString()
    fun now(): String = Instant.now().toString()
    fun today(): String = LocalDate.now().toString()
}
