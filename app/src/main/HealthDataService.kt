package com.example.healthmonitor

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HealthDataService(private val context: Context) {
    suspend fun fetchHealthData(): HealthData {
        return withContext(Dispatchers.IO) {
            // Logic to fetch health data from wearable devices
            HealthData(
                heartRate = 75,
                sleepHours = 7.5f,
                steps = 10000
            )
        }
    }
}

data class HealthData(
    val heartRate: Int,
    val sleepHours: Float,
    val steps: Int
)
