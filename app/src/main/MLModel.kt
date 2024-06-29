package com.example.healthmonitor

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.tensorflow.lite.Interpreter
import java.nio.ByteBuffer

class MLModel(private val interpreter: Interpreter) {
    suspend fun predictHealthTrend(data: HealthData): HealthTrend {
        return withContext(Dispatchers.Default) {
            val inputBuffer = ByteBuffer.allocateDirect(12).apply {
                putFloat(data.heartRate.toFloat())
                putFloat(data.sleepHours)
                putFloat(data.steps.toFloat())
            }

            val outputBuffer = ByteBuffer.allocateDirect(12)
            interpreter.run(inputBuffer, outputBuffer)

            outputBuffer.rewind()
            HealthTrend(
                predictedHeartRate = outputBuffer.float,
                recommendedSleepHours = outputBuffer.float,
                suggestedSteps = outputBuffer.float.toInt()
            )
        }
    }
}

data class HealthTrend(
    val predictedHeartRate: Float,
    val recommendedSleepHours: Float,
    val suggestedSteps: Int
)
