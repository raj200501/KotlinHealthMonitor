package com.example.healthmonitor.recommendation

import com.example.healthmonitor.model.DailySummary
import com.example.healthmonitor.model.Priority
import com.example.healthmonitor.model.Recommendation
import com.example.healthmonitor.model.UserProfile
import kotlin.math.roundToInt

class RecommendationEngine {
    fun generate(user: UserProfile, summary: DailySummary): List<Recommendation> {
        val recommendations = mutableListOf<Recommendation>()

        if (summary.totalSteps < user.targetSteps) {
            val gap = user.targetSteps - summary.totalSteps
            recommendations += Recommendation(
                id = "steps_gap",
                title = "Boost your activity",
                message = "You are ${gap} steps short of your daily goal. Try a 20-minute walk to close the gap.",
                priority = Priority.HIGH,
                actionable = true
            )
        }

        if (summary.sleepHours < user.targetSleepHours) {
            val delta = (user.targetSleepHours - summary.sleepHours).coerceAtLeast(0.1)
            recommendations += Recommendation(
                id = "sleep_recovery",
                title = "Prioritize sleep",
                message = "Aim for ${delta.roundToInt()} extra hours of sleep tonight to meet your recovery target.",
                priority = Priority.MEDIUM,
                actionable = true
            )
        }

        if (summary.averageHeartRate > user.restingHeartRate + 15) {
            recommendations += Recommendation(
                id = "heart_rate",
                title = "Recovery day suggested",
                message = "Your average heart rate is elevated. Consider a lighter training day.",
                priority = Priority.MEDIUM,
                actionable = true
            )
        }

        if (summary.stressIndex > 6.5) {
            recommendations += Recommendation(
                id = "stress_down",
                title = "Stress reset",
                message = "Stress levels were high today. Try 10 minutes of breathwork before bed.",
                priority = Priority.HIGH,
                actionable = true
            )
        }

        if (summary.temperatureAvg > 37.5) {
            recommendations += Recommendation(
                id = "temperature_alert",
                title = "Elevated temperature",
                message = "Average body temperature is elevated. Monitor hydration and rest if needed.",
                priority = Priority.MEDIUM,
                actionable = true
            )
        }

        if (recommendations.isEmpty()) {
            recommendations += Recommendation(
                id = "keep_it_up",
                title = "Consistency achieved",
                message = "Great job maintaining balanced metrics today. Keep your routine steady.",
                priority = Priority.LOW,
                actionable = false
            )
        }

        return recommendations
    }
}
