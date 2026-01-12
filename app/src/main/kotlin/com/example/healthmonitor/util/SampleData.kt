package com.example.healthmonitor.util
import com.example.healthmonitor.model.HealthMetricRequest

object SampleData {
    fun samplesFor(userId: String): List<HealthMetricRequest> = listOf(
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-01T06:00:00Z",
            heartRate = 75,
            steps = 2956,
            sleepHours = 6.55,
            caloriesBurned = 235.01,
            stressLevel = 3,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-01T12:00:00Z",
            heartRate = 58,
            steps = 5271,
            sleepHours = 7.98,
            caloriesBurned = 289.07,
            stressLevel = 6,
            bodyTemperatureC = 36.61
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-01T18:00:00Z",
            heartRate = 55,
            steps = 2883,
            sleepHours = 6.94,
            caloriesBurned = 281.07,
            stressLevel = 2,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-02T06:00:00Z",
            heartRate = 77,
            steps = 5161,
            sleepHours = 7.9,
            caloriesBurned = 263.9,
            stressLevel = 5,
            bodyTemperatureC = 36.81
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-02T12:00:00Z",
            heartRate = 80,
            steps = 6060,
            sleepHours = 6.51,
            caloriesBurned = 341.16,
            stressLevel = 7,
            bodyTemperatureC = 36.61
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-02T18:00:00Z",
            heartRate = 63,
            steps = 3136,
            sleepHours = 6.93,
            caloriesBurned = 332.7,
            stressLevel = 2,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-03T06:00:00Z",
            heartRate = 58,
            steps = 3970,
            sleepHours = 8.19,
            caloriesBurned = 300.75,
            stressLevel = 8,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-03T12:00:00Z",
            heartRate = 69,
            steps = 4696,
            sleepHours = 6.75,
            caloriesBurned = 364.46,
            stressLevel = 2,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-03T18:00:00Z",
            heartRate = 81,
            steps = 5074,
            sleepHours = 7.74,
            caloriesBurned = 352.34,
            stressLevel = 6,
            bodyTemperatureC = 36.33
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-04T06:00:00Z",
            heartRate = 57,
            steps = 2687,
            sleepHours = 7.82,
            caloriesBurned = 334.61,
            stressLevel = 2,
            bodyTemperatureC = 37.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-04T12:00:00Z",
            heartRate = 82,
            steps = 2913,
            sleepHours = 7.26,
            caloriesBurned = 270.68,
            stressLevel = 8,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-04T18:00:00Z",
            heartRate = 66,
            steps = 3955,
            sleepHours = 6.92,
            caloriesBurned = 233.4,
            stressLevel = 7,
            bodyTemperatureC = 36.88
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-05T06:00:00Z",
            heartRate = 74,
            steps = 5100,
            sleepHours = 6.84,
            caloriesBurned = 325.83,
            stressLevel = 3,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-05T12:00:00Z",
            heartRate = 63,
            steps = 6290,
            sleepHours = 7.78,
            caloriesBurned = 291.39,
            stressLevel = 7,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-05T18:00:00Z",
            heartRate = 79,
            steps = 5678,
            sleepHours = 6.61,
            caloriesBurned = 344.36,
            stressLevel = 8,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-06T06:00:00Z",
            heartRate = 63,
            steps = 2771,
            sleepHours = 6.92,
            caloriesBurned = 368.58,
            stressLevel = 7,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-06T12:00:00Z",
            heartRate = 75,
            steps = 4544,
            sleepHours = 7.29,
            caloriesBurned = 362.91,
            stressLevel = 5,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-06T18:00:00Z",
            heartRate = 59,
            steps = 3510,
            sleepHours = 7.99,
            caloriesBurned = 287.8,
            stressLevel = 7,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-07T06:00:00Z",
            heartRate = 83,
            steps = 4890,
            sleepHours = 7.3,
            caloriesBurned = 223.86,
            stressLevel = 3,
            bodyTemperatureC = 36.71
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-07T12:00:00Z",
            heartRate = 57,
            steps = 5595,
            sleepHours = 6.59,
            caloriesBurned = 201.93,
            stressLevel = 7,
            bodyTemperatureC = 36.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-07T18:00:00Z",
            heartRate = 76,
            steps = 4229,
            sleepHours = 7.69,
            caloriesBurned = 256.95,
            stressLevel = 6,
            bodyTemperatureC = 37.3
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-08T06:00:00Z",
            heartRate = 71,
            steps = 3529,
            sleepHours = 8.44,
            caloriesBurned = 352.16,
            stressLevel = 2,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-08T12:00:00Z",
            heartRate = 58,
            steps = 5292,
            sleepHours = 8.27,
            caloriesBurned = 330.18,
            stressLevel = 8,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-08T18:00:00Z",
            heartRate = 58,
            steps = 3702,
            sleepHours = 7.37,
            caloriesBurned = 270.74,
            stressLevel = 7,
            bodyTemperatureC = 37.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-09T06:00:00Z",
            heartRate = 63,
            steps = 6480,
            sleepHours = 7.5,
            caloriesBurned = 215.73,
            stressLevel = 2,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-09T12:00:00Z",
            heartRate = 64,
            steps = 5947,
            sleepHours = 7.78,
            caloriesBurned = 301.79,
            stressLevel = 3,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-09T18:00:00Z",
            heartRate = 60,
            steps = 4709,
            sleepHours = 8.41,
            caloriesBurned = 364.49,
            stressLevel = 2,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-10T06:00:00Z",
            heartRate = 70,
            steps = 2579,
            sleepHours = 6.72,
            caloriesBurned = 252.6,
            stressLevel = 8,
            bodyTemperatureC = 37.07
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-10T12:00:00Z",
            heartRate = 62,
            steps = 2737,
            sleepHours = 6.98,
            caloriesBurned = 293.47,
            stressLevel = 2,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-10T18:00:00Z",
            heartRate = 70,
            steps = 5842,
            sleepHours = 6.64,
            caloriesBurned = 332.12,
            stressLevel = 8,
            bodyTemperatureC = 36.25
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-11T06:00:00Z",
            heartRate = 76,
            steps = 4446,
            sleepHours = 8.39,
            caloriesBurned = 213.03,
            stressLevel = 6,
            bodyTemperatureC = 37.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-11T12:00:00Z",
            heartRate = 68,
            steps = 6450,
            sleepHours = 6.92,
            caloriesBurned = 287.86,
            stressLevel = 7,
            bodyTemperatureC = 36.93
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-11T18:00:00Z",
            heartRate = 77,
            steps = 3776,
            sleepHours = 7.3,
            caloriesBurned = 314.34,
            stressLevel = 4,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-12T06:00:00Z",
            heartRate = 71,
            steps = 4349,
            sleepHours = 6.74,
            caloriesBurned = 224.94,
            stressLevel = 4,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-12T12:00:00Z",
            heartRate = 72,
            steps = 3442,
            sleepHours = 7.68,
            caloriesBurned = 181.44,
            stressLevel = 7,
            bodyTemperatureC = 36.86
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-12T18:00:00Z",
            heartRate = 62,
            steps = 2776,
            sleepHours = 8.31,
            caloriesBurned = 351.93,
            stressLevel = 2,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-13T06:00:00Z",
            heartRate = 63,
            steps = 5240,
            sleepHours = 7.47,
            caloriesBurned = 287.85,
            stressLevel = 7,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-13T12:00:00Z",
            heartRate = 73,
            steps = 4860,
            sleepHours = 7.45,
            caloriesBurned = 336.92,
            stressLevel = 8,
            bodyTemperatureC = 36.59
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-13T18:00:00Z",
            heartRate = 58,
            steps = 2897,
            sleepHours = 7.82,
            caloriesBurned = 250.86,
            stressLevel = 5,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-14T06:00:00Z",
            heartRate = 78,
            steps = 2721,
            sleepHours = 7.85,
            caloriesBurned = 376.83,
            stressLevel = 2,
            bodyTemperatureC = 36.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-14T12:00:00Z",
            heartRate = 78,
            steps = 3889,
            sleepHours = 8.1,
            caloriesBurned = 201.85,
            stressLevel = 3,
            bodyTemperatureC = 36.33
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-14T18:00:00Z",
            heartRate = 69,
            steps = 3074,
            sleepHours = 7.34,
            caloriesBurned = 235.71,
            stressLevel = 3,
            bodyTemperatureC = 37.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-15T06:00:00Z",
            heartRate = 57,
            steps = 4315,
            sleepHours = 8.12,
            caloriesBurned = 351.19,
            stressLevel = 2,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-15T12:00:00Z",
            heartRate = 72,
            steps = 5924,
            sleepHours = 6.53,
            caloriesBurned = 198.65,
            stressLevel = 8,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-15T18:00:00Z",
            heartRate = 60,
            steps = 4164,
            sleepHours = 7.47,
            caloriesBurned = 222.75,
            stressLevel = 5,
            bodyTemperatureC = 37.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-16T06:00:00Z",
            heartRate = 60,
            steps = 4052,
            sleepHours = 6.5,
            caloriesBurned = 258.08,
            stressLevel = 8,
            bodyTemperatureC = 37.04
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-16T12:00:00Z",
            heartRate = 64,
            steps = 4232,
            sleepHours = 7.89,
            caloriesBurned = 326.1,
            stressLevel = 8,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-16T18:00:00Z",
            heartRate = 77,
            steps = 4493,
            sleepHours = 6.81,
            caloriesBurned = 239.34,
            stressLevel = 2,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-17T06:00:00Z",
            heartRate = 72,
            steps = 2749,
            sleepHours = 8.0,
            caloriesBurned = 191.43,
            stressLevel = 6,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-17T12:00:00Z",
            heartRate = 84,
            steps = 5992,
            sleepHours = 7.56,
            caloriesBurned = 191.38,
            stressLevel = 6,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-17T18:00:00Z",
            heartRate = 60,
            steps = 2780,
            sleepHours = 7.69,
            caloriesBurned = 315.04,
            stressLevel = 3,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-18T06:00:00Z",
            heartRate = 85,
            steps = 6146,
            sleepHours = 7.64,
            caloriesBurned = 295.78,
            stressLevel = 2,
            bodyTemperatureC = 36.84
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-18T12:00:00Z",
            heartRate = 68,
            steps = 5192,
            sleepHours = 7.67,
            caloriesBurned = 284.56,
            stressLevel = 4,
            bodyTemperatureC = 36.35
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-18T18:00:00Z",
            heartRate = 77,
            steps = 3786,
            sleepHours = 6.98,
            caloriesBurned = 259.16,
            stressLevel = 7,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-19T06:00:00Z",
            heartRate = 69,
            steps = 3795,
            sleepHours = 8.36,
            caloriesBurned = 367.15,
            stressLevel = 2,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-19T12:00:00Z",
            heartRate = 73,
            steps = 2909,
            sleepHours = 6.65,
            caloriesBurned = 222.63,
            stressLevel = 4,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-19T18:00:00Z",
            heartRate = 66,
            steps = 6108,
            sleepHours = 6.64,
            caloriesBurned = 228.86,
            stressLevel = 4,
            bodyTemperatureC = 36.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-20T06:00:00Z",
            heartRate = 81,
            steps = 4725,
            sleepHours = 7.91,
            caloriesBurned = 302.34,
            stressLevel = 8,
            bodyTemperatureC = 36.88
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-20T12:00:00Z",
            heartRate = 55,
            steps = 5235,
            sleepHours = 8.13,
            caloriesBurned = 239.88,
            stressLevel = 7,
            bodyTemperatureC = 36.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-20T18:00:00Z",
            heartRate = 83,
            steps = 3050,
            sleepHours = 7.03,
            caloriesBurned = 357.94,
            stressLevel = 7,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-21T06:00:00Z",
            heartRate = 63,
            steps = 3654,
            sleepHours = 7.71,
            caloriesBurned = 323.52,
            stressLevel = 3,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-21T12:00:00Z",
            heartRate = 82,
            steps = 3581,
            sleepHours = 7.51,
            caloriesBurned = 230.22,
            stressLevel = 8,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-21T18:00:00Z",
            heartRate = 75,
            steps = 4234,
            sleepHours = 8.16,
            caloriesBurned = 188.82,
            stressLevel = 4,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-22T06:00:00Z",
            heartRate = 75,
            steps = 3572,
            sleepHours = 6.82,
            caloriesBurned = 268.37,
            stressLevel = 7,
            bodyTemperatureC = 36.61
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-22T12:00:00Z",
            heartRate = 55,
            steps = 2958,
            sleepHours = 6.65,
            caloriesBurned = 356.62,
            stressLevel = 3,
            bodyTemperatureC = 36.75
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-22T18:00:00Z",
            heartRate = 81,
            steps = 4012,
            sleepHours = 7.67,
            caloriesBurned = 209.62,
            stressLevel = 3,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-23T06:00:00Z",
            heartRate = 66,
            steps = 6182,
            sleepHours = 8.37,
            caloriesBurned = 374.44,
            stressLevel = 2,
            bodyTemperatureC = 37.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-23T12:00:00Z",
            heartRate = 61,
            steps = 5293,
            sleepHours = 7.0,
            caloriesBurned = 200.56,
            stressLevel = 8,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-23T18:00:00Z",
            heartRate = 82,
            steps = 4164,
            sleepHours = 8.45,
            caloriesBurned = 329.9,
            stressLevel = 3,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-24T06:00:00Z",
            heartRate = 80,
            steps = 5820,
            sleepHours = 6.85,
            caloriesBurned = 262.46,
            stressLevel = 3,
            bodyTemperatureC = 36.98
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-24T12:00:00Z",
            heartRate = 65,
            steps = 5704,
            sleepHours = 8.36,
            caloriesBurned = 340.45,
            stressLevel = 8,
            bodyTemperatureC = 36.98
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-24T18:00:00Z",
            heartRate = 62,
            steps = 3592,
            sleepHours = 6.82,
            caloriesBurned = 320.26,
            stressLevel = 5,
            bodyTemperatureC = 37.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-25T06:00:00Z",
            heartRate = 82,
            steps = 4427,
            sleepHours = 6.94,
            caloriesBurned = 343.32,
            stressLevel = 5,
            bodyTemperatureC = 36.52
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-25T12:00:00Z",
            heartRate = 81,
            steps = 5757,
            sleepHours = 8.24,
            caloriesBurned = 224.58,
            stressLevel = 7,
            bodyTemperatureC = 36.33
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-25T18:00:00Z",
            heartRate = 65,
            steps = 3641,
            sleepHours = 8.23,
            caloriesBurned = 373.38,
            stressLevel = 4,
            bodyTemperatureC = 36.52
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-26T06:00:00Z",
            heartRate = 71,
            steps = 4137,
            sleepHours = 7.86,
            caloriesBurned = 348.73,
            stressLevel = 4,
            bodyTemperatureC = 37.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-26T12:00:00Z",
            heartRate = 58,
            steps = 6092,
            sleepHours = 8.44,
            caloriesBurned = 215.71,
            stressLevel = 4,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-26T18:00:00Z",
            heartRate = 74,
            steps = 4279,
            sleepHours = 7.19,
            caloriesBurned = 337.29,
            stressLevel = 5,
            bodyTemperatureC = 36.83
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-27T06:00:00Z",
            heartRate = 71,
            steps = 2973,
            sleepHours = 7.27,
            caloriesBurned = 295.32,
            stressLevel = 4,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-27T12:00:00Z",
            heartRate = 68,
            steps = 2506,
            sleepHours = 7.54,
            caloriesBurned = 341.3,
            stressLevel = 7,
            bodyTemperatureC = 36.96
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-27T18:00:00Z",
            heartRate = 78,
            steps = 5518,
            sleepHours = 7.84,
            caloriesBurned = 252.84,
            stressLevel = 2,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-28T06:00:00Z",
            heartRate = 84,
            steps = 3852,
            sleepHours = 7.75,
            caloriesBurned = 312.68,
            stressLevel = 2,
            bodyTemperatureC = 36.96
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-28T12:00:00Z",
            heartRate = 64,
            steps = 4577,
            sleepHours = 7.12,
            caloriesBurned = 261.68,
            stressLevel = 5,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-28T18:00:00Z",
            heartRate = 72,
            steps = 3021,
            sleepHours = 6.88,
            caloriesBurned = 312.99,
            stressLevel = 5,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-29T06:00:00Z",
            heartRate = 83,
            steps = 3212,
            sleepHours = 7.73,
            caloriesBurned = 240.19,
            stressLevel = 6,
            bodyTemperatureC = 37.1
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-29T12:00:00Z",
            heartRate = 64,
            steps = 3675,
            sleepHours = 6.92,
            caloriesBurned = 337.15,
            stressLevel = 6,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-29T18:00:00Z",
            heartRate = 69,
            steps = 4309,
            sleepHours = 7.38,
            caloriesBurned = 222.74,
            stressLevel = 5,
            bodyTemperatureC = 37.05
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-30T06:00:00Z",
            heartRate = 85,
            steps = 5760,
            sleepHours = 7.97,
            caloriesBurned = 311.77,
            stressLevel = 4,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-30T12:00:00Z",
            heartRate = 75,
            steps = 5036,
            sleepHours = 7.17,
            caloriesBurned = 343.68,
            stressLevel = 8,
            bodyTemperatureC = 36.38
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-30T18:00:00Z",
            heartRate = 64,
            steps = 3420,
            sleepHours = 8.11,
            caloriesBurned = 209.47,
            stressLevel = 2,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-31T06:00:00Z",
            heartRate = 70,
            steps = 5003,
            sleepHours = 8.2,
            caloriesBurned = 194.57,
            stressLevel = 5,
            bodyTemperatureC = 37.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-31T12:00:00Z",
            heartRate = 73,
            steps = 3296,
            sleepHours = 7.94,
            caloriesBurned = 256.8,
            stressLevel = 5,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-01-31T18:00:00Z",
            heartRate = 75,
            steps = 5316,
            sleepHours = 6.51,
            caloriesBurned = 330.19,
            stressLevel = 8,
            bodyTemperatureC = 37.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-01T06:00:00Z",
            heartRate = 79,
            steps = 4241,
            sleepHours = 6.94,
            caloriesBurned = 340.82,
            stressLevel = 7,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-01T12:00:00Z",
            heartRate = 56,
            steps = 4783,
            sleepHours = 7.0,
            caloriesBurned = 349.67,
            stressLevel = 5,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-01T18:00:00Z",
            heartRate = 69,
            steps = 5234,
            sleepHours = 7.56,
            caloriesBurned = 291.79,
            stressLevel = 4,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-02T06:00:00Z",
            heartRate = 83,
            steps = 4312,
            sleepHours = 7.73,
            caloriesBurned = 323.85,
            stressLevel = 6,
            bodyTemperatureC = 36.61
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-02T12:00:00Z",
            heartRate = 84,
            steps = 4744,
            sleepHours = 7.39,
            caloriesBurned = 211.83,
            stressLevel = 8,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-02T18:00:00Z",
            heartRate = 63,
            steps = 5579,
            sleepHours = 6.99,
            caloriesBurned = 307.53,
            stressLevel = 8,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-03T06:00:00Z",
            heartRate = 70,
            steps = 5067,
            sleepHours = 6.98,
            caloriesBurned = 267.97,
            stressLevel = 7,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-03T12:00:00Z",
            heartRate = 63,
            steps = 3875,
            sleepHours = 7.14,
            caloriesBurned = 288.03,
            stressLevel = 3,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-03T18:00:00Z",
            heartRate = 67,
            steps = 5342,
            sleepHours = 6.81,
            caloriesBurned = 222.79,
            stressLevel = 5,
            bodyTemperatureC = 36.59
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-04T06:00:00Z",
            heartRate = 72,
            steps = 4408,
            sleepHours = 7.33,
            caloriesBurned = 221.37,
            stressLevel = 5,
            bodyTemperatureC = 36.57
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-04T12:00:00Z",
            heartRate = 79,
            steps = 4892,
            sleepHours = 8.39,
            caloriesBurned = 183.91,
            stressLevel = 8,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-04T18:00:00Z",
            heartRate = 70,
            steps = 2524,
            sleepHours = 8.39,
            caloriesBurned = 239.72,
            stressLevel = 5,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-05T06:00:00Z",
            heartRate = 85,
            steps = 5923,
            sleepHours = 7.34,
            caloriesBurned = 329.5,
            stressLevel = 6,
            bodyTemperatureC = 37.06
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-05T12:00:00Z",
            heartRate = 83,
            steps = 3403,
            sleepHours = 7.48,
            caloriesBurned = 234.59,
            stressLevel = 5,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-05T18:00:00Z",
            heartRate = 65,
            steps = 5239,
            sleepHours = 7.86,
            caloriesBurned = 260.86,
            stressLevel = 3,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-06T06:00:00Z",
            heartRate = 84,
            steps = 3022,
            sleepHours = 8.46,
            caloriesBurned = 286.82,
            stressLevel = 5,
            bodyTemperatureC = 36.81
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-06T12:00:00Z",
            heartRate = 76,
            steps = 2611,
            sleepHours = 6.67,
            caloriesBurned = 265.72,
            stressLevel = 8,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-06T18:00:00Z",
            heartRate = 56,
            steps = 3565,
            sleepHours = 7.26,
            caloriesBurned = 222.33,
            stressLevel = 4,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-07T06:00:00Z",
            heartRate = 83,
            steps = 4052,
            sleepHours = 7.06,
            caloriesBurned = 370.24,
            stressLevel = 5,
            bodyTemperatureC = 36.4
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-07T12:00:00Z",
            heartRate = 57,
            steps = 4426,
            sleepHours = 6.54,
            caloriesBurned = 287.88,
            stressLevel = 4,
            bodyTemperatureC = 36.37
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-07T18:00:00Z",
            heartRate = 57,
            steps = 5699,
            sleepHours = 8.41,
            caloriesBurned = 188.05,
            stressLevel = 2,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-08T06:00:00Z",
            heartRate = 61,
            steps = 5937,
            sleepHours = 6.54,
            caloriesBurned = 210.48,
            stressLevel = 3,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-08T12:00:00Z",
            heartRate = 58,
            steps = 4810,
            sleepHours = 8.4,
            caloriesBurned = 273.01,
            stressLevel = 4,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-08T18:00:00Z",
            heartRate = 60,
            steps = 4981,
            sleepHours = 7.71,
            caloriesBurned = 329.59,
            stressLevel = 2,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-09T06:00:00Z",
            heartRate = 60,
            steps = 6451,
            sleepHours = 7.12,
            caloriesBurned = 295.74,
            stressLevel = 4,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-09T12:00:00Z",
            heartRate = 84,
            steps = 6424,
            sleepHours = 7.25,
            caloriesBurned = 368.29,
            stressLevel = 3,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-09T18:00:00Z",
            heartRate = 77,
            steps = 5902,
            sleepHours = 7.75,
            caloriesBurned = 200.38,
            stressLevel = 8,
            bodyTemperatureC = 36.46
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-10T06:00:00Z",
            heartRate = 76,
            steps = 4959,
            sleepHours = 8.11,
            caloriesBurned = 339.25,
            stressLevel = 6,
            bodyTemperatureC = 37.04
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-10T12:00:00Z",
            heartRate = 66,
            steps = 4682,
            sleepHours = 7.36,
            caloriesBurned = 254.11,
            stressLevel = 6,
            bodyTemperatureC = 36.88
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-10T18:00:00Z",
            heartRate = 55,
            steps = 5979,
            sleepHours = 7.34,
            caloriesBurned = 278.04,
            stressLevel = 5,
            bodyTemperatureC = 37.25
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-11T06:00:00Z",
            heartRate = 75,
            steps = 6151,
            sleepHours = 8.16,
            caloriesBurned = 321.46,
            stressLevel = 5,
            bodyTemperatureC = 36.31
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-11T12:00:00Z",
            heartRate = 71,
            steps = 6454,
            sleepHours = 7.8,
            caloriesBurned = 303.18,
            stressLevel = 6,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-11T18:00:00Z",
            heartRate = 69,
            steps = 4284,
            sleepHours = 8.15,
            caloriesBurned = 298.49,
            stressLevel = 4,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-12T06:00:00Z",
            heartRate = 81,
            steps = 6328,
            sleepHours = 6.67,
            caloriesBurned = 356.33,
            stressLevel = 3,
            bodyTemperatureC = 37.0
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-12T12:00:00Z",
            heartRate = 73,
            steps = 4999,
            sleepHours = 7.84,
            caloriesBurned = 247.28,
            stressLevel = 5,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-12T18:00:00Z",
            heartRate = 60,
            steps = 4497,
            sleepHours = 6.92,
            caloriesBurned = 339.57,
            stressLevel = 4,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-13T06:00:00Z",
            heartRate = 74,
            steps = 5372,
            sleepHours = 8.26,
            caloriesBurned = 291.16,
            stressLevel = 6,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-13T12:00:00Z",
            heartRate = 57,
            steps = 3488,
            sleepHours = 7.94,
            caloriesBurned = 277.72,
            stressLevel = 8,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-13T18:00:00Z",
            heartRate = 70,
            steps = 5145,
            sleepHours = 7.92,
            caloriesBurned = 269.63,
            stressLevel = 2,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-14T06:00:00Z",
            heartRate = 62,
            steps = 4156,
            sleepHours = 7.88,
            caloriesBurned = 241.24,
            stressLevel = 6,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-14T12:00:00Z",
            heartRate = 72,
            steps = 4674,
            sleepHours = 7.19,
            caloriesBurned = 379.33,
            stressLevel = 6,
            bodyTemperatureC = 36.5
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-14T18:00:00Z",
            heartRate = 77,
            steps = 4358,
            sleepHours = 7.04,
            caloriesBurned = 230.28,
            stressLevel = 2,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-15T06:00:00Z",
            heartRate = 65,
            steps = 2989,
            sleepHours = 7.99,
            caloriesBurned = 370.18,
            stressLevel = 7,
            bodyTemperatureC = 36.32
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-15T12:00:00Z",
            heartRate = 61,
            steps = 5525,
            sleepHours = 7.47,
            caloriesBurned = 324.92,
            stressLevel = 8,
            bodyTemperatureC = 36.73
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-15T18:00:00Z",
            heartRate = 64,
            steps = 2911,
            sleepHours = 8.17,
            caloriesBurned = 239.25,
            stressLevel = 4,
            bodyTemperatureC = 36.32
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-16T06:00:00Z",
            heartRate = 55,
            steps = 5400,
            sleepHours = 7.57,
            caloriesBurned = 234.86,
            stressLevel = 2,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-16T12:00:00Z",
            heartRate = 77,
            steps = 6366,
            sleepHours = 6.75,
            caloriesBurned = 353.69,
            stressLevel = 5,
            bodyTemperatureC = 36.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-16T18:00:00Z",
            heartRate = 55,
            steps = 4851,
            sleepHours = 7.07,
            caloriesBurned = 275.74,
            stressLevel = 4,
            bodyTemperatureC = 36.32
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-17T06:00:00Z",
            heartRate = 56,
            steps = 3534,
            sleepHours = 8.38,
            caloriesBurned = 275.55,
            stressLevel = 8,
            bodyTemperatureC = 36.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-17T12:00:00Z",
            heartRate = 70,
            steps = 2803,
            sleepHours = 7.65,
            caloriesBurned = 317.29,
            stressLevel = 3,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-17T18:00:00Z",
            heartRate = 73,
            steps = 6387,
            sleepHours = 7.11,
            caloriesBurned = 378.78,
            stressLevel = 2,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-18T06:00:00Z",
            heartRate = 68,
            steps = 4983,
            sleepHours = 7.69,
            caloriesBurned = 303.68,
            stressLevel = 8,
            bodyTemperatureC = 36.73
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-18T12:00:00Z",
            heartRate = 69,
            steps = 6221,
            sleepHours = 7.39,
            caloriesBurned = 352.03,
            stressLevel = 5,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-18T18:00:00Z",
            heartRate = 74,
            steps = 2746,
            sleepHours = 7.72,
            caloriesBurned = 328.02,
            stressLevel = 8,
            bodyTemperatureC = 36.35
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-19T06:00:00Z",
            heartRate = 61,
            steps = 3583,
            sleepHours = 7.82,
            caloriesBurned = 211.41,
            stressLevel = 3,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-19T12:00:00Z",
            heartRate = 60,
            steps = 2510,
            sleepHours = 7.32,
            caloriesBurned = 317.87,
            stressLevel = 5,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-19T18:00:00Z",
            heartRate = 62,
            steps = 3680,
            sleepHours = 7.91,
            caloriesBurned = 320.6,
            stressLevel = 5,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-20T06:00:00Z",
            heartRate = 62,
            steps = 6284,
            sleepHours = 7.03,
            caloriesBurned = 338.25,
            stressLevel = 6,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-20T12:00:00Z",
            heartRate = 84,
            steps = 3310,
            sleepHours = 7.35,
            caloriesBurned = 288.91,
            stressLevel = 7,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-20T18:00:00Z",
            heartRate = 63,
            steps = 5885,
            sleepHours = 6.78,
            caloriesBurned = 191.93,
            stressLevel = 8,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-21T06:00:00Z",
            heartRate = 78,
            steps = 5876,
            sleepHours = 7.64,
            caloriesBurned = 237.72,
            stressLevel = 2,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-21T12:00:00Z",
            heartRate = 64,
            steps = 5366,
            sleepHours = 7.31,
            caloriesBurned = 234.45,
            stressLevel = 6,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-21T18:00:00Z",
            heartRate = 57,
            steps = 4949,
            sleepHours = 6.58,
            caloriesBurned = 266.41,
            stressLevel = 4,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-22T06:00:00Z",
            heartRate = 55,
            steps = 2874,
            sleepHours = 6.96,
            caloriesBurned = 314.86,
            stressLevel = 8,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-22T12:00:00Z",
            heartRate = 85,
            steps = 2584,
            sleepHours = 8.5,
            caloriesBurned = 314.46,
            stressLevel = 4,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-22T18:00:00Z",
            heartRate = 79,
            steps = 5597,
            sleepHours = 6.85,
            caloriesBurned = 283.79,
            stressLevel = 5,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-23T06:00:00Z",
            heartRate = 60,
            steps = 4897,
            sleepHours = 7.37,
            caloriesBurned = 342.85,
            stressLevel = 2,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-23T12:00:00Z",
            heartRate = 68,
            steps = 3865,
            sleepHours = 7.14,
            caloriesBurned = 200.92,
            stressLevel = 3,
            bodyTemperatureC = 36.5
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-23T18:00:00Z",
            heartRate = 77,
            steps = 4529,
            sleepHours = 7.08,
            caloriesBurned = 369.04,
            stressLevel = 8,
            bodyTemperatureC = 37.01
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-24T06:00:00Z",
            heartRate = 56,
            steps = 4362,
            sleepHours = 6.68,
            caloriesBurned = 230.48,
            stressLevel = 2,
            bodyTemperatureC = 37.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-24T12:00:00Z",
            heartRate = 67,
            steps = 6042,
            sleepHours = 7.53,
            caloriesBurned = 377.62,
            stressLevel = 7,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-24T18:00:00Z",
            heartRate = 69,
            steps = 4192,
            sleepHours = 6.61,
            caloriesBurned = 283.69,
            stressLevel = 6,
            bodyTemperatureC = 37.01
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-25T06:00:00Z",
            heartRate = 75,
            steps = 4310,
            sleepHours = 8.02,
            caloriesBurned = 220.71,
            stressLevel = 6,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-25T12:00:00Z",
            heartRate = 64,
            steps = 4294,
            sleepHours = 8.26,
            caloriesBurned = 276.94,
            stressLevel = 2,
            bodyTemperatureC = 37.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-25T18:00:00Z",
            heartRate = 74,
            steps = 5773,
            sleepHours = 6.98,
            caloriesBurned = 211.68,
            stressLevel = 6,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-26T06:00:00Z",
            heartRate = 68,
            steps = 2881,
            sleepHours = 6.95,
            caloriesBurned = 348.28,
            stressLevel = 2,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-26T12:00:00Z",
            heartRate = 58,
            steps = 5153,
            sleepHours = 8.16,
            caloriesBurned = 279.68,
            stressLevel = 7,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-26T18:00:00Z",
            heartRate = 77,
            steps = 3619,
            sleepHours = 7.33,
            caloriesBurned = 276.5,
            stressLevel = 5,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-27T06:00:00Z",
            heartRate = 72,
            steps = 3092,
            sleepHours = 7.27,
            caloriesBurned = 364.37,
            stressLevel = 6,
            bodyTemperatureC = 37.0
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-27T12:00:00Z",
            heartRate = 59,
            steps = 6039,
            sleepHours = 6.64,
            caloriesBurned = 334.54,
            stressLevel = 8,
            bodyTemperatureC = 36.6
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-27T18:00:00Z",
            heartRate = 84,
            steps = 5726,
            sleepHours = 7.52,
            caloriesBurned = 344.11,
            stressLevel = 4,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-28T06:00:00Z",
            heartRate = 81,
            steps = 4904,
            sleepHours = 7.66,
            caloriesBurned = 311.99,
            stressLevel = 8,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-28T12:00:00Z",
            heartRate = 72,
            steps = 4483,
            sleepHours = 7.19,
            caloriesBurned = 290.38,
            stressLevel = 6,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-28T18:00:00Z",
            heartRate = 84,
            steps = 3818,
            sleepHours = 8.24,
            caloriesBurned = 376.15,
            stressLevel = 3,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-29T06:00:00Z",
            heartRate = 62,
            steps = 6006,
            sleepHours = 8.05,
            caloriesBurned = 188.73,
            stressLevel = 7,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-29T12:00:00Z",
            heartRate = 84,
            steps = 5823,
            sleepHours = 7.26,
            caloriesBurned = 377.68,
            stressLevel = 8,
            bodyTemperatureC = 37.08
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-02-29T18:00:00Z",
            heartRate = 59,
            steps = 4528,
            sleepHours = 8.43,
            caloriesBurned = 205.25,
            stressLevel = 6,
            bodyTemperatureC = 36.5
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-01T06:00:00Z",
            heartRate = 58,
            steps = 6080,
            sleepHours = 8.19,
            caloriesBurned = 199.94,
            stressLevel = 5,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-01T12:00:00Z",
            heartRate = 59,
            steps = 4179,
            sleepHours = 8.24,
            caloriesBurned = 373.99,
            stressLevel = 2,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-01T18:00:00Z",
            heartRate = 63,
            steps = 3886,
            sleepHours = 7.75,
            caloriesBurned = 259.5,
            stressLevel = 2,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-02T06:00:00Z",
            heartRate = 82,
            steps = 5262,
            sleepHours = 8.22,
            caloriesBurned = 256.0,
            stressLevel = 4,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-02T12:00:00Z",
            heartRate = 83,
            steps = 5610,
            sleepHours = 7.48,
            caloriesBurned = 288.2,
            stressLevel = 6,
            bodyTemperatureC = 36.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-02T18:00:00Z",
            heartRate = 75,
            steps = 5303,
            sleepHours = 8.34,
            caloriesBurned = 379.49,
            stressLevel = 7,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-03T06:00:00Z",
            heartRate = 58,
            steps = 5614,
            sleepHours = 7.77,
            caloriesBurned = 354.52,
            stressLevel = 5,
            bodyTemperatureC = 36.3
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-03T12:00:00Z",
            heartRate = 64,
            steps = 6200,
            sleepHours = 6.56,
            caloriesBurned = 244.87,
            stressLevel = 2,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-03T18:00:00Z",
            heartRate = 66,
            steps = 4264,
            sleepHours = 6.79,
            caloriesBurned = 286.23,
            stressLevel = 6,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-04T06:00:00Z",
            heartRate = 60,
            steps = 3196,
            sleepHours = 6.85,
            caloriesBurned = 301.9,
            stressLevel = 5,
            bodyTemperatureC = 36.84
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-04T12:00:00Z",
            heartRate = 62,
            steps = 4538,
            sleepHours = 8.33,
            caloriesBurned = 208.62,
            stressLevel = 5,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-04T18:00:00Z",
            heartRate = 69,
            steps = 3545,
            sleepHours = 7.83,
            caloriesBurned = 359.78,
            stressLevel = 5,
            bodyTemperatureC = 37.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-05T06:00:00Z",
            heartRate = 76,
            steps = 4738,
            sleepHours = 6.82,
            caloriesBurned = 268.35,
            stressLevel = 4,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-05T12:00:00Z",
            heartRate = 64,
            steps = 5117,
            sleepHours = 8.42,
            caloriesBurned = 318.06,
            stressLevel = 5,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-05T18:00:00Z",
            heartRate = 61,
            steps = 4075,
            sleepHours = 8.21,
            caloriesBurned = 201.33,
            stressLevel = 5,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-06T06:00:00Z",
            heartRate = 73,
            steps = 3711,
            sleepHours = 8.49,
            caloriesBurned = 239.05,
            stressLevel = 8,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-06T12:00:00Z",
            heartRate = 63,
            steps = 2533,
            sleepHours = 7.63,
            caloriesBurned = 317.16,
            stressLevel = 7,
            bodyTemperatureC = 37.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-06T18:00:00Z",
            heartRate = 84,
            steps = 4983,
            sleepHours = 7.99,
            caloriesBurned = 346.57,
            stressLevel = 4,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-07T06:00:00Z",
            heartRate = 62,
            steps = 4986,
            sleepHours = 8.1,
            caloriesBurned = 223.8,
            stressLevel = 3,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-07T12:00:00Z",
            heartRate = 76,
            steps = 5594,
            sleepHours = 7.94,
            caloriesBurned = 311.84,
            stressLevel = 8,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-07T18:00:00Z",
            heartRate = 58,
            steps = 6200,
            sleepHours = 7.75,
            caloriesBurned = 187.88,
            stressLevel = 8,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-08T06:00:00Z",
            heartRate = 73,
            steps = 3994,
            sleepHours = 7.96,
            caloriesBurned = 198.03,
            stressLevel = 4,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-08T12:00:00Z",
            heartRate = 68,
            steps = 3219,
            sleepHours = 6.9,
            caloriesBurned = 337.3,
            stressLevel = 4,
            bodyTemperatureC = 36.74
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-08T18:00:00Z",
            heartRate = 84,
            steps = 3616,
            sleepHours = 8.16,
            caloriesBurned = 231.39,
            stressLevel = 8,
            bodyTemperatureC = 37.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-09T06:00:00Z",
            heartRate = 85,
            steps = 5803,
            sleepHours = 7.09,
            caloriesBurned = 354.08,
            stressLevel = 8,
            bodyTemperatureC = 36.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-09T12:00:00Z",
            heartRate = 85,
            steps = 2808,
            sleepHours = 6.78,
            caloriesBurned = 373.3,
            stressLevel = 8,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-09T18:00:00Z",
            heartRate = 76,
            steps = 4127,
            sleepHours = 8.43,
            caloriesBurned = 340.92,
            stressLevel = 4,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-10T06:00:00Z",
            heartRate = 67,
            steps = 2557,
            sleepHours = 7.03,
            caloriesBurned = 204.72,
            stressLevel = 4,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-10T12:00:00Z",
            heartRate = 76,
            steps = 3573,
            sleepHours = 7.67,
            caloriesBurned = 344.48,
            stressLevel = 4,
            bodyTemperatureC = 36.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-10T18:00:00Z",
            heartRate = 62,
            steps = 4431,
            sleepHours = 6.55,
            caloriesBurned = 356.85,
            stressLevel = 6,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-11T06:00:00Z",
            heartRate = 74,
            steps = 3406,
            sleepHours = 7.8,
            caloriesBurned = 307.08,
            stressLevel = 5,
            bodyTemperatureC = 37.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-11T12:00:00Z",
            heartRate = 64,
            steps = 5159,
            sleepHours = 7.32,
            caloriesBurned = 207.96,
            stressLevel = 2,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-11T18:00:00Z",
            heartRate = 70,
            steps = 2975,
            sleepHours = 6.69,
            caloriesBurned = 357.45,
            stressLevel = 3,
            bodyTemperatureC = 36.57
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-12T06:00:00Z",
            heartRate = 66,
            steps = 5246,
            sleepHours = 8.4,
            caloriesBurned = 319.3,
            stressLevel = 6,
            bodyTemperatureC = 36.6
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-12T12:00:00Z",
            heartRate = 78,
            steps = 5476,
            sleepHours = 6.81,
            caloriesBurned = 262.98,
            stressLevel = 2,
            bodyTemperatureC = 37.1
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-12T18:00:00Z",
            heartRate = 74,
            steps = 4171,
            sleepHours = 8.38,
            caloriesBurned = 235.95,
            stressLevel = 7,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-13T06:00:00Z",
            heartRate = 69,
            steps = 4321,
            sleepHours = 8.4,
            caloriesBurned = 351.09,
            stressLevel = 2,
            bodyTemperatureC = 37.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-13T12:00:00Z",
            heartRate = 66,
            steps = 4730,
            sleepHours = 8.3,
            caloriesBurned = 308.97,
            stressLevel = 2,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-13T18:00:00Z",
            heartRate = 61,
            steps = 6465,
            sleepHours = 6.74,
            caloriesBurned = 349.61,
            stressLevel = 5,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-14T06:00:00Z",
            heartRate = 61,
            steps = 5128,
            sleepHours = 7.78,
            caloriesBurned = 374.22,
            stressLevel = 2,
            bodyTemperatureC = 37.04
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-14T12:00:00Z",
            heartRate = 62,
            steps = 3015,
            sleepHours = 8.07,
            caloriesBurned = 221.04,
            stressLevel = 8,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-14T18:00:00Z",
            heartRate = 61,
            steps = 4901,
            sleepHours = 6.93,
            caloriesBurned = 353.94,
            stressLevel = 4,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-15T06:00:00Z",
            heartRate = 80,
            steps = 6188,
            sleepHours = 7.69,
            caloriesBurned = 235.45,
            stressLevel = 3,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-15T12:00:00Z",
            heartRate = 72,
            steps = 3526,
            sleepHours = 8.1,
            caloriesBurned = 201.99,
            stressLevel = 8,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-15T18:00:00Z",
            heartRate = 55,
            steps = 3967,
            sleepHours = 8.08,
            caloriesBurned = 227.59,
            stressLevel = 4,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-16T06:00:00Z",
            heartRate = 63,
            steps = 2714,
            sleepHours = 6.75,
            caloriesBurned = 264.19,
            stressLevel = 2,
            bodyTemperatureC = 36.99
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-16T12:00:00Z",
            heartRate = 70,
            steps = 4336,
            sleepHours = 8.06,
            caloriesBurned = 282.65,
            stressLevel = 2,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-16T18:00:00Z",
            heartRate = 62,
            steps = 6372,
            sleepHours = 7.73,
            caloriesBurned = 325.45,
            stressLevel = 8,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-17T06:00:00Z",
            heartRate = 64,
            steps = 4376,
            sleepHours = 7.79,
            caloriesBurned = 186.23,
            stressLevel = 5,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-17T12:00:00Z",
            heartRate = 68,
            steps = 5310,
            sleepHours = 6.72,
            caloriesBurned = 322.48,
            stressLevel = 5,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-17T18:00:00Z",
            heartRate = 57,
            steps = 3819,
            sleepHours = 7.72,
            caloriesBurned = 193.14,
            stressLevel = 4,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-18T06:00:00Z",
            heartRate = 73,
            steps = 4746,
            sleepHours = 7.92,
            caloriesBurned = 256.18,
            stressLevel = 6,
            bodyTemperatureC = 36.74
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-18T12:00:00Z",
            heartRate = 69,
            steps = 4570,
            sleepHours = 7.71,
            caloriesBurned = 199.84,
            stressLevel = 7,
            bodyTemperatureC = 36.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-18T18:00:00Z",
            heartRate = 75,
            steps = 5166,
            sleepHours = 8.26,
            caloriesBurned = 290.27,
            stressLevel = 8,
            bodyTemperatureC = 36.36
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-19T06:00:00Z",
            heartRate = 69,
            steps = 6137,
            sleepHours = 6.96,
            caloriesBurned = 247.79,
            stressLevel = 5,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-19T12:00:00Z",
            heartRate = 78,
            steps = 2889,
            sleepHours = 7.13,
            caloriesBurned = 242.5,
            stressLevel = 4,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-19T18:00:00Z",
            heartRate = 59,
            steps = 5313,
            sleepHours = 8.35,
            caloriesBurned = 193.43,
            stressLevel = 8,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-20T06:00:00Z",
            heartRate = 68,
            steps = 2895,
            sleepHours = 7.99,
            caloriesBurned = 254.53,
            stressLevel = 3,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-20T12:00:00Z",
            heartRate = 73,
            steps = 6418,
            sleepHours = 7.62,
            caloriesBurned = 245.93,
            stressLevel = 2,
            bodyTemperatureC = 36.59
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-20T18:00:00Z",
            heartRate = 82,
            steps = 5225,
            sleepHours = 8.38,
            caloriesBurned = 264.59,
            stressLevel = 7,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-21T06:00:00Z",
            heartRate = 64,
            steps = 4959,
            sleepHours = 7.12,
            caloriesBurned = 200.72,
            stressLevel = 6,
            bodyTemperatureC = 36.36
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-21T12:00:00Z",
            heartRate = 76,
            steps = 4475,
            sleepHours = 6.95,
            caloriesBurned = 201.64,
            stressLevel = 8,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-21T18:00:00Z",
            heartRate = 58,
            steps = 5623,
            sleepHours = 7.06,
            caloriesBurned = 225.23,
            stressLevel = 5,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-22T06:00:00Z",
            heartRate = 79,
            steps = 5852,
            sleepHours = 7.74,
            caloriesBurned = 315.0,
            stressLevel = 6,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-22T12:00:00Z",
            heartRate = 84,
            steps = 5194,
            sleepHours = 8.16,
            caloriesBurned = 233.49,
            stressLevel = 3,
            bodyTemperatureC = 36.43
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-22T18:00:00Z",
            heartRate = 79,
            steps = 3765,
            sleepHours = 8.34,
            caloriesBurned = 250.2,
            stressLevel = 3,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-23T06:00:00Z",
            heartRate = 73,
            steps = 5192,
            sleepHours = 7.3,
            caloriesBurned = 208.37,
            stressLevel = 7,
            bodyTemperatureC = 37.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-23T12:00:00Z",
            heartRate = 57,
            steps = 5556,
            sleepHours = 7.56,
            caloriesBurned = 255.24,
            stressLevel = 5,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-23T18:00:00Z",
            heartRate = 66,
            steps = 3776,
            sleepHours = 7.94,
            caloriesBurned = 335.37,
            stressLevel = 6,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-24T06:00:00Z",
            heartRate = 83,
            steps = 2715,
            sleepHours = 6.81,
            caloriesBurned = 330.89,
            stressLevel = 2,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-24T12:00:00Z",
            heartRate = 63,
            steps = 4314,
            sleepHours = 7.82,
            caloriesBurned = 277.13,
            stressLevel = 5,
            bodyTemperatureC = 36.6
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-24T18:00:00Z",
            heartRate = 61,
            steps = 5592,
            sleepHours = 7.52,
            caloriesBurned = 249.03,
            stressLevel = 2,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-25T06:00:00Z",
            heartRate = 76,
            steps = 4929,
            sleepHours = 7.47,
            caloriesBurned = 313.43,
            stressLevel = 2,
            bodyTemperatureC = 36.36
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-25T12:00:00Z",
            heartRate = 74,
            steps = 2724,
            sleepHours = 6.52,
            caloriesBurned = 240.28,
            stressLevel = 3,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-25T18:00:00Z",
            heartRate = 79,
            steps = 3546,
            sleepHours = 7.08,
            caloriesBurned = 204.0,
            stressLevel = 5,
            bodyTemperatureC = 37.0
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-26T06:00:00Z",
            heartRate = 60,
            steps = 3029,
            sleepHours = 7.26,
            caloriesBurned = 320.73,
            stressLevel = 6,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-26T12:00:00Z",
            heartRate = 76,
            steps = 5802,
            sleepHours = 7.21,
            caloriesBurned = 259.41,
            stressLevel = 7,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-26T18:00:00Z",
            heartRate = 55,
            steps = 4383,
            sleepHours = 8.34,
            caloriesBurned = 352.42,
            stressLevel = 6,
            bodyTemperatureC = 36.62
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-27T06:00:00Z",
            heartRate = 67,
            steps = 5406,
            sleepHours = 7.78,
            caloriesBurned = 237.9,
            stressLevel = 5,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-27T12:00:00Z",
            heartRate = 65,
            steps = 3203,
            sleepHours = 8.1,
            caloriesBurned = 303.63,
            stressLevel = 8,
            bodyTemperatureC = 36.93
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-27T18:00:00Z",
            heartRate = 66,
            steps = 2860,
            sleepHours = 7.37,
            caloriesBurned = 201.17,
            stressLevel = 5,
            bodyTemperatureC = 36.81
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-28T06:00:00Z",
            heartRate = 71,
            steps = 2822,
            sleepHours = 7.29,
            caloriesBurned = 242.05,
            stressLevel = 4,
            bodyTemperatureC = 36.37
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-28T12:00:00Z",
            heartRate = 79,
            steps = 3188,
            sleepHours = 6.65,
            caloriesBurned = 306.64,
            stressLevel = 6,
            bodyTemperatureC = 36.71
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-28T18:00:00Z",
            heartRate = 83,
            steps = 5679,
            sleepHours = 7.2,
            caloriesBurned = 325.48,
            stressLevel = 8,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-29T06:00:00Z",
            heartRate = 59,
            steps = 3467,
            sleepHours = 6.71,
            caloriesBurned = 231.19,
            stressLevel = 3,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-29T12:00:00Z",
            heartRate = 79,
            steps = 5609,
            sleepHours = 7.81,
            caloriesBurned = 215.43,
            stressLevel = 8,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-29T18:00:00Z",
            heartRate = 69,
            steps = 5590,
            sleepHours = 7.63,
            caloriesBurned = 295.89,
            stressLevel = 7,
            bodyTemperatureC = 37.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-30T06:00:00Z",
            heartRate = 73,
            steps = 5133,
            sleepHours = 7.77,
            caloriesBurned = 304.9,
            stressLevel = 8,
            bodyTemperatureC = 37.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-30T12:00:00Z",
            heartRate = 65,
            steps = 3118,
            sleepHours = 7.38,
            caloriesBurned = 273.78,
            stressLevel = 7,
            bodyTemperatureC = 36.46
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-30T18:00:00Z",
            heartRate = 63,
            steps = 4922,
            sleepHours = 6.61,
            caloriesBurned = 281.47,
            stressLevel = 4,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-31T06:00:00Z",
            heartRate = 56,
            steps = 2733,
            sleepHours = 7.24,
            caloriesBurned = 237.42,
            stressLevel = 7,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-31T12:00:00Z",
            heartRate = 82,
            steps = 2869,
            sleepHours = 7.73,
            caloriesBurned = 281.41,
            stressLevel = 5,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-03-31T18:00:00Z",
            heartRate = 85,
            steps = 5743,
            sleepHours = 7.98,
            caloriesBurned = 188.2,
            stressLevel = 8,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-01T06:00:00Z",
            heartRate = 61,
            steps = 3816,
            sleepHours = 7.71,
            caloriesBurned = 280.27,
            stressLevel = 2,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-01T12:00:00Z",
            heartRate = 80,
            steps = 6182,
            sleepHours = 8.17,
            caloriesBurned = 376.48,
            stressLevel = 2,
            bodyTemperatureC = 36.71
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-01T18:00:00Z",
            heartRate = 60,
            steps = 2660,
            sleepHours = 7.0,
            caloriesBurned = 267.55,
            stressLevel = 5,
            bodyTemperatureC = 36.73
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-02T06:00:00Z",
            heartRate = 74,
            steps = 3150,
            sleepHours = 7.23,
            caloriesBurned = 363.59,
            stressLevel = 5,
            bodyTemperatureC = 36.59
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-02T12:00:00Z",
            heartRate = 65,
            steps = 5280,
            sleepHours = 7.7,
            caloriesBurned = 337.85,
            stressLevel = 7,
            bodyTemperatureC = 36.5
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-02T18:00:00Z",
            heartRate = 65,
            steps = 2887,
            sleepHours = 7.62,
            caloriesBurned = 257.31,
            stressLevel = 4,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-03T06:00:00Z",
            heartRate = 76,
            steps = 6450,
            sleepHours = 8.31,
            caloriesBurned = 354.66,
            stressLevel = 4,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-03T12:00:00Z",
            heartRate = 76,
            steps = 3079,
            sleepHours = 8.33,
            caloriesBurned = 242.05,
            stressLevel = 7,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-03T18:00:00Z",
            heartRate = 67,
            steps = 3028,
            sleepHours = 7.69,
            caloriesBurned = 367.6,
            stressLevel = 4,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-04T06:00:00Z",
            heartRate = 75,
            steps = 5742,
            sleepHours = 7.16,
            caloriesBurned = 205.56,
            stressLevel = 7,
            bodyTemperatureC = 37.09
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-04T12:00:00Z",
            heartRate = 78,
            steps = 5307,
            sleepHours = 8.32,
            caloriesBurned = 198.69,
            stressLevel = 7,
            bodyTemperatureC = 36.61
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-04T18:00:00Z",
            heartRate = 66,
            steps = 2574,
            sleepHours = 7.23,
            caloriesBurned = 216.05,
            stressLevel = 3,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-05T06:00:00Z",
            heartRate = 79,
            steps = 4491,
            sleepHours = 6.88,
            caloriesBurned = 380.0,
            stressLevel = 3,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-05T12:00:00Z",
            heartRate = 82,
            steps = 5728,
            sleepHours = 6.7,
            caloriesBurned = 334.17,
            stressLevel = 8,
            bodyTemperatureC = 36.99
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-05T18:00:00Z",
            heartRate = 71,
            steps = 2654,
            sleepHours = 7.82,
            caloriesBurned = 355.28,
            stressLevel = 6,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-06T06:00:00Z",
            heartRate = 67,
            steps = 3131,
            sleepHours = 6.82,
            caloriesBurned = 346.27,
            stressLevel = 8,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-06T12:00:00Z",
            heartRate = 83,
            steps = 3178,
            sleepHours = 7.94,
            caloriesBurned = 188.74,
            stressLevel = 4,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-06T18:00:00Z",
            heartRate = 62,
            steps = 6471,
            sleepHours = 7.39,
            caloriesBurned = 236.99,
            stressLevel = 7,
            bodyTemperatureC = 37.04
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-07T06:00:00Z",
            heartRate = 62,
            steps = 4687,
            sleepHours = 6.98,
            caloriesBurned = 373.12,
            stressLevel = 8,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-07T12:00:00Z",
            heartRate = 81,
            steps = 3294,
            sleepHours = 7.24,
            caloriesBurned = 369.43,
            stressLevel = 5,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-07T18:00:00Z",
            heartRate = 64,
            steps = 5687,
            sleepHours = 7.26,
            caloriesBurned = 285.49,
            stressLevel = 3,
            bodyTemperatureC = 37.08
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-08T06:00:00Z",
            heartRate = 80,
            steps = 4976,
            sleepHours = 6.78,
            caloriesBurned = 230.0,
            stressLevel = 7,
            bodyTemperatureC = 36.68
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-08T12:00:00Z",
            heartRate = 66,
            steps = 4771,
            sleepHours = 8.37,
            caloriesBurned = 322.28,
            stressLevel = 6,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-08T18:00:00Z",
            heartRate = 64,
            steps = 2843,
            sleepHours = 8.03,
            caloriesBurned = 234.56,
            stressLevel = 6,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-09T06:00:00Z",
            heartRate = 68,
            steps = 2875,
            sleepHours = 8.39,
            caloriesBurned = 224.41,
            stressLevel = 5,
            bodyTemperatureC = 37.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-09T12:00:00Z",
            heartRate = 84,
            steps = 2609,
            sleepHours = 7.33,
            caloriesBurned = 259.29,
            stressLevel = 4,
            bodyTemperatureC = 36.38
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-09T18:00:00Z",
            heartRate = 57,
            steps = 4035,
            sleepHours = 6.95,
            caloriesBurned = 243.74,
            stressLevel = 2,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-10T06:00:00Z",
            heartRate = 75,
            steps = 3873,
            sleepHours = 8.08,
            caloriesBurned = 207.52,
            stressLevel = 4,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-10T12:00:00Z",
            heartRate = 70,
            steps = 5351,
            sleepHours = 8.16,
            caloriesBurned = 331.77,
            stressLevel = 5,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-10T18:00:00Z",
            heartRate = 55,
            steps = 6210,
            sleepHours = 6.66,
            caloriesBurned = 231.18,
            stressLevel = 8,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-11T06:00:00Z",
            heartRate = 85,
            steps = 5478,
            sleepHours = 7.72,
            caloriesBurned = 264.65,
            stressLevel = 8,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-11T12:00:00Z",
            heartRate = 64,
            steps = 2999,
            sleepHours = 6.6,
            caloriesBurned = 263.97,
            stressLevel = 8,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-11T18:00:00Z",
            heartRate = 57,
            steps = 2954,
            sleepHours = 8.17,
            caloriesBurned = 279.97,
            stressLevel = 6,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-12T06:00:00Z",
            heartRate = 71,
            steps = 4855,
            sleepHours = 6.98,
            caloriesBurned = 208.72,
            stressLevel = 5,
            bodyTemperatureC = 36.1
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-12T12:00:00Z",
            heartRate = 66,
            steps = 3485,
            sleepHours = 7.64,
            caloriesBurned = 217.46,
            stressLevel = 7,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-12T18:00:00Z",
            heartRate = 66,
            steps = 2777,
            sleepHours = 8.41,
            caloriesBurned = 288.82,
            stressLevel = 8,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-13T06:00:00Z",
            heartRate = 72,
            steps = 2583,
            sleepHours = 7.28,
            caloriesBurned = 274.03,
            stressLevel = 7,
            bodyTemperatureC = 36.56
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-13T12:00:00Z",
            heartRate = 66,
            steps = 3538,
            sleepHours = 7.99,
            caloriesBurned = 251.42,
            stressLevel = 2,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-13T18:00:00Z",
            heartRate = 78,
            steps = 5191,
            sleepHours = 7.76,
            caloriesBurned = 334.3,
            stressLevel = 7,
            bodyTemperatureC = 37.01
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-14T06:00:00Z",
            heartRate = 59,
            steps = 2681,
            sleepHours = 7.2,
            caloriesBurned = 247.71,
            stressLevel = 7,
            bodyTemperatureC = 36.31
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-14T12:00:00Z",
            heartRate = 79,
            steps = 5304,
            sleepHours = 7.43,
            caloriesBurned = 319.08,
            stressLevel = 7,
            bodyTemperatureC = 36.32
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-14T18:00:00Z",
            heartRate = 59,
            steps = 2758,
            sleepHours = 7.93,
            caloriesBurned = 368.72,
            stressLevel = 2,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-15T06:00:00Z",
            heartRate = 56,
            steps = 5740,
            sleepHours = 6.9,
            caloriesBurned = 188.38,
            stressLevel = 4,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-15T12:00:00Z",
            heartRate = 81,
            steps = 4724,
            sleepHours = 7.45,
            caloriesBurned = 187.32,
            stressLevel = 7,
            bodyTemperatureC = 36.33
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-15T18:00:00Z",
            heartRate = 66,
            steps = 6031,
            sleepHours = 8.06,
            caloriesBurned = 353.16,
            stressLevel = 4,
            bodyTemperatureC = 36.43
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-16T06:00:00Z",
            heartRate = 80,
            steps = 4007,
            sleepHours = 7.37,
            caloriesBurned = 260.0,
            stressLevel = 5,
            bodyTemperatureC = 37.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-16T12:00:00Z",
            heartRate = 67,
            steps = 3888,
            sleepHours = 8.45,
            caloriesBurned = 279.24,
            stressLevel = 5,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-16T18:00:00Z",
            heartRate = 80,
            steps = 4626,
            sleepHours = 7.03,
            caloriesBurned = 196.52,
            stressLevel = 5,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-17T06:00:00Z",
            heartRate = 74,
            steps = 5868,
            sleepHours = 6.86,
            caloriesBurned = 238.75,
            stressLevel = 2,
            bodyTemperatureC = 36.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-17T12:00:00Z",
            heartRate = 76,
            steps = 3710,
            sleepHours = 7.11,
            caloriesBurned = 300.52,
            stressLevel = 5,
            bodyTemperatureC = 36.3
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-17T18:00:00Z",
            heartRate = 69,
            steps = 3939,
            sleepHours = 7.39,
            caloriesBurned = 325.36,
            stressLevel = 4,
            bodyTemperatureC = 36.84
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-18T06:00:00Z",
            heartRate = 68,
            steps = 3624,
            sleepHours = 7.78,
            caloriesBurned = 338.3,
            stressLevel = 2,
            bodyTemperatureC = 36.19
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-18T12:00:00Z",
            heartRate = 75,
            steps = 4163,
            sleepHours = 7.23,
            caloriesBurned = 340.22,
            stressLevel = 7,
            bodyTemperatureC = 36.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-18T18:00:00Z",
            heartRate = 55,
            steps = 3084,
            sleepHours = 8.2,
            caloriesBurned = 315.62,
            stressLevel = 5,
            bodyTemperatureC = 36.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-19T06:00:00Z",
            heartRate = 57,
            steps = 3466,
            sleepHours = 8.06,
            caloriesBurned = 253.27,
            stressLevel = 5,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-19T12:00:00Z",
            heartRate = 56,
            steps = 4978,
            sleepHours = 6.81,
            caloriesBurned = 269.98,
            stressLevel = 4,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-19T18:00:00Z",
            heartRate = 79,
            steps = 2814,
            sleepHours = 7.65,
            caloriesBurned = 285.89,
            stressLevel = 5,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-20T06:00:00Z",
            heartRate = 63,
            steps = 3522,
            sleepHours = 8.42,
            caloriesBurned = 185.18,
            stressLevel = 3,
            bodyTemperatureC = 36.7
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-20T12:00:00Z",
            heartRate = 67,
            steps = 6241,
            sleepHours = 7.62,
            caloriesBurned = 232.36,
            stressLevel = 4,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-20T18:00:00Z",
            heartRate = 61,
            steps = 5006,
            sleepHours = 7.07,
            caloriesBurned = 363.3,
            stressLevel = 5,
            bodyTemperatureC = 36.34
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-21T06:00:00Z",
            heartRate = 59,
            steps = 5993,
            sleepHours = 6.65,
            caloriesBurned = 214.53,
            stressLevel = 7,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-21T12:00:00Z",
            heartRate = 57,
            steps = 5819,
            sleepHours = 7.86,
            caloriesBurned = 349.1,
            stressLevel = 4,
            bodyTemperatureC = 36.9
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-21T18:00:00Z",
            heartRate = 77,
            steps = 2765,
            sleepHours = 7.6,
            caloriesBurned = 238.07,
            stressLevel = 4,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-22T06:00:00Z",
            heartRate = 77,
            steps = 5406,
            sleepHours = 8.35,
            caloriesBurned = 307.54,
            stressLevel = 8,
            bodyTemperatureC = 36.53
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-22T12:00:00Z",
            heartRate = 62,
            steps = 2997,
            sleepHours = 8.47,
            caloriesBurned = 338.41,
            stressLevel = 3,
            bodyTemperatureC = 37.05
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-22T18:00:00Z",
            heartRate = 55,
            steps = 3978,
            sleepHours = 7.61,
            caloriesBurned = 253.78,
            stressLevel = 8,
            bodyTemperatureC = 37.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-23T06:00:00Z",
            heartRate = 59,
            steps = 5006,
            sleepHours = 8.27,
            caloriesBurned = 193.15,
            stressLevel = 5,
            bodyTemperatureC = 37.3
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-23T12:00:00Z",
            heartRate = 78,
            steps = 4460,
            sleepHours = 7.55,
            caloriesBurned = 333.83,
            stressLevel = 8,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-23T18:00:00Z",
            heartRate = 59,
            steps = 6482,
            sleepHours = 7.13,
            caloriesBurned = 194.83,
            stressLevel = 5,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-24T06:00:00Z",
            heartRate = 66,
            steps = 3025,
            sleepHours = 8.26,
            caloriesBurned = 336.05,
            stressLevel = 7,
            bodyTemperatureC = 36.81
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-24T12:00:00Z",
            heartRate = 79,
            steps = 6457,
            sleepHours = 6.76,
            caloriesBurned = 280.57,
            stressLevel = 8,
            bodyTemperatureC = 36.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-24T18:00:00Z",
            heartRate = 58,
            steps = 4622,
            sleepHours = 6.81,
            caloriesBurned = 212.93,
            stressLevel = 4,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-25T06:00:00Z",
            heartRate = 62,
            steps = 3917,
            sleepHours = 8.39,
            caloriesBurned = 283.78,
            stressLevel = 4,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-25T12:00:00Z",
            heartRate = 63,
            steps = 3304,
            sleepHours = 7.77,
            caloriesBurned = 290.17,
            stressLevel = 3,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-25T18:00:00Z",
            heartRate = 74,
            steps = 4685,
            sleepHours = 6.69,
            caloriesBurned = 308.2,
            stressLevel = 6,
            bodyTemperatureC = 37.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-26T06:00:00Z",
            heartRate = 59,
            steps = 3201,
            sleepHours = 7.82,
            caloriesBurned = 324.13,
            stressLevel = 6,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-26T12:00:00Z",
            heartRate = 84,
            steps = 4808,
            sleepHours = 6.58,
            caloriesBurned = 352.76,
            stressLevel = 2,
            bodyTemperatureC = 36.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-26T18:00:00Z",
            heartRate = 75,
            steps = 5658,
            sleepHours = 7.65,
            caloriesBurned = 310.23,
            stressLevel = 8,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-27T06:00:00Z",
            heartRate = 74,
            steps = 5117,
            sleepHours = 6.56,
            caloriesBurned = 357.8,
            stressLevel = 6,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-27T12:00:00Z",
            heartRate = 85,
            steps = 3737,
            sleepHours = 7.47,
            caloriesBurned = 340.94,
            stressLevel = 7,
            bodyTemperatureC = 36.59
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-27T18:00:00Z",
            heartRate = 69,
            steps = 2798,
            sleepHours = 7.88,
            caloriesBurned = 211.62,
            stressLevel = 5,
            bodyTemperatureC = 36.68
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-28T06:00:00Z",
            heartRate = 61,
            steps = 3893,
            sleepHours = 7.71,
            caloriesBurned = 242.52,
            stressLevel = 7,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-28T12:00:00Z",
            heartRate = 82,
            steps = 3914,
            sleepHours = 8.45,
            caloriesBurned = 206.15,
            stressLevel = 4,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-28T18:00:00Z",
            heartRate = 58,
            steps = 3807,
            sleepHours = 6.98,
            caloriesBurned = 204.5,
            stressLevel = 5,
            bodyTemperatureC = 36.4
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-29T06:00:00Z",
            heartRate = 58,
            steps = 2707,
            sleepHours = 7.08,
            caloriesBurned = 256.83,
            stressLevel = 6,
            bodyTemperatureC = 36.6
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-29T12:00:00Z",
            heartRate = 85,
            steps = 6044,
            sleepHours = 8.3,
            caloriesBurned = 342.7,
            stressLevel = 6,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-29T18:00:00Z",
            heartRate = 61,
            steps = 5625,
            sleepHours = 6.82,
            caloriesBurned = 379.19,
            stressLevel = 5,
            bodyTemperatureC = 36.7
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-30T06:00:00Z",
            heartRate = 64,
            steps = 4537,
            sleepHours = 6.55,
            caloriesBurned = 369.05,
            stressLevel = 6,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-30T12:00:00Z",
            heartRate = 62,
            steps = 3381,
            sleepHours = 7.67,
            caloriesBurned = 189.73,
            stressLevel = 4,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-04-30T18:00:00Z",
            heartRate = 83,
            steps = 5952,
            sleepHours = 7.81,
            caloriesBurned = 274.12,
            stressLevel = 6,
            bodyTemperatureC = 36.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-01T06:00:00Z",
            heartRate = 58,
            steps = 4265,
            sleepHours = 6.77,
            caloriesBurned = 232.89,
            stressLevel = 4,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-01T12:00:00Z",
            heartRate = 66,
            steps = 2685,
            sleepHours = 7.3,
            caloriesBurned = 294.06,
            stressLevel = 3,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-01T18:00:00Z",
            heartRate = 64,
            steps = 2801,
            sleepHours = 7.27,
            caloriesBurned = 270.07,
            stressLevel = 6,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-02T06:00:00Z",
            heartRate = 74,
            steps = 5286,
            sleepHours = 7.72,
            caloriesBurned = 205.73,
            stressLevel = 2,
            bodyTemperatureC = 36.57
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-02T12:00:00Z",
            heartRate = 80,
            steps = 3888,
            sleepHours = 7.62,
            caloriesBurned = 253.12,
            stressLevel = 3,
            bodyTemperatureC = 36.34
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-02T18:00:00Z",
            heartRate = 71,
            steps = 4144,
            sleepHours = 7.5,
            caloriesBurned = 189.06,
            stressLevel = 3,
            bodyTemperatureC = 36.96
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-03T06:00:00Z",
            heartRate = 80,
            steps = 4440,
            sleepHours = 7.54,
            caloriesBurned = 209.79,
            stressLevel = 6,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-03T12:00:00Z",
            heartRate = 84,
            steps = 5011,
            sleepHours = 7.14,
            caloriesBurned = 258.59,
            stressLevel = 6,
            bodyTemperatureC = 36.99
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-03T18:00:00Z",
            heartRate = 64,
            steps = 4931,
            sleepHours = 7.17,
            caloriesBurned = 345.66,
            stressLevel = 6,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-04T06:00:00Z",
            heartRate = 73,
            steps = 3727,
            sleepHours = 7.45,
            caloriesBurned = 183.33,
            stressLevel = 4,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-04T12:00:00Z",
            heartRate = 68,
            steps = 4890,
            sleepHours = 7.12,
            caloriesBurned = 359.75,
            stressLevel = 8,
            bodyTemperatureC = 36.93
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-04T18:00:00Z",
            heartRate = 55,
            steps = 4944,
            sleepHours = 7.45,
            caloriesBurned = 373.41,
            stressLevel = 8,
            bodyTemperatureC = 37.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-05T06:00:00Z",
            heartRate = 73,
            steps = 4865,
            sleepHours = 6.96,
            caloriesBurned = 190.27,
            stressLevel = 5,
            bodyTemperatureC = 36.3
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-05T12:00:00Z",
            heartRate = 75,
            steps = 5453,
            sleepHours = 7.74,
            caloriesBurned = 348.23,
            stressLevel = 3,
            bodyTemperatureC = 37.09
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-05T18:00:00Z",
            heartRate = 62,
            steps = 2629,
            sleepHours = 7.65,
            caloriesBurned = 320.1,
            stressLevel = 3,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-06T06:00:00Z",
            heartRate = 65,
            steps = 4215,
            sleepHours = 6.8,
            caloriesBurned = 318.1,
            stressLevel = 5,
            bodyTemperatureC = 36.7
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-06T12:00:00Z",
            heartRate = 74,
            steps = 6270,
            sleepHours = 7.44,
            caloriesBurned = 349.68,
            stressLevel = 7,
            bodyTemperatureC = 36.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-06T18:00:00Z",
            heartRate = 59,
            steps = 4624,
            sleepHours = 6.91,
            caloriesBurned = 245.01,
            stressLevel = 7,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-07T06:00:00Z",
            heartRate = 67,
            steps = 3785,
            sleepHours = 8.41,
            caloriesBurned = 271.93,
            stressLevel = 6,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-07T12:00:00Z",
            heartRate = 66,
            steps = 5268,
            sleepHours = 8.04,
            caloriesBurned = 324.18,
            stressLevel = 7,
            bodyTemperatureC = 37.06
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-07T18:00:00Z",
            heartRate = 63,
            steps = 4998,
            sleepHours = 7.47,
            caloriesBurned = 371.47,
            stressLevel = 4,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-08T06:00:00Z",
            heartRate = 62,
            steps = 6356,
            sleepHours = 8.45,
            caloriesBurned = 239.52,
            stressLevel = 4,
            bodyTemperatureC = 36.95
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-08T12:00:00Z",
            heartRate = 77,
            steps = 5387,
            sleepHours = 7.48,
            caloriesBurned = 275.96,
            stressLevel = 6,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-08T18:00:00Z",
            heartRate = 80,
            steps = 5455,
            sleepHours = 7.05,
            caloriesBurned = 204.37,
            stressLevel = 7,
            bodyTemperatureC = 36.75
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-09T06:00:00Z",
            heartRate = 83,
            steps = 4116,
            sleepHours = 8.14,
            caloriesBurned = 370.92,
            stressLevel = 8,
            bodyTemperatureC = 36.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-09T12:00:00Z",
            heartRate = 56,
            steps = 3678,
            sleepHours = 8.41,
            caloriesBurned = 195.81,
            stressLevel = 5,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-09T18:00:00Z",
            heartRate = 78,
            steps = 4462,
            sleepHours = 6.93,
            caloriesBurned = 345.59,
            stressLevel = 4,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-10T06:00:00Z",
            heartRate = 77,
            steps = 3612,
            sleepHours = 6.77,
            caloriesBurned = 303.14,
            stressLevel = 6,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-10T12:00:00Z",
            heartRate = 56,
            steps = 5243,
            sleepHours = 8.31,
            caloriesBurned = 225.13,
            stressLevel = 3,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-10T18:00:00Z",
            heartRate = 68,
            steps = 3852,
            sleepHours = 7.93,
            caloriesBurned = 200.11,
            stressLevel = 8,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-11T06:00:00Z",
            heartRate = 85,
            steps = 4754,
            sleepHours = 8.46,
            caloriesBurned = 211.59,
            stressLevel = 7,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-11T12:00:00Z",
            heartRate = 83,
            steps = 4448,
            sleepHours = 7.45,
            caloriesBurned = 219.89,
            stressLevel = 4,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-11T18:00:00Z",
            heartRate = 75,
            steps = 2742,
            sleepHours = 8.32,
            caloriesBurned = 197.89,
            stressLevel = 6,
            bodyTemperatureC = 36.38
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-12T06:00:00Z",
            heartRate = 78,
            steps = 5461,
            sleepHours = 8.2,
            caloriesBurned = 187.46,
            stressLevel = 3,
            bodyTemperatureC = 36.6
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-12T12:00:00Z",
            heartRate = 81,
            steps = 3220,
            sleepHours = 8.37,
            caloriesBurned = 187.27,
            stressLevel = 8,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-12T18:00:00Z",
            heartRate = 70,
            steps = 3263,
            sleepHours = 8.37,
            caloriesBurned = 372.43,
            stressLevel = 4,
            bodyTemperatureC = 37.15
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-13T06:00:00Z",
            heartRate = 55,
            steps = 3722,
            sleepHours = 7.64,
            caloriesBurned = 201.46,
            stressLevel = 4,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-13T12:00:00Z",
            heartRate = 75,
            steps = 4725,
            sleepHours = 7.55,
            caloriesBurned = 357.85,
            stressLevel = 3,
            bodyTemperatureC = 37.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-13T18:00:00Z",
            heartRate = 69,
            steps = 3617,
            sleepHours = 6.89,
            caloriesBurned = 202.53,
            stressLevel = 3,
            bodyTemperatureC = 36.98
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-14T06:00:00Z",
            heartRate = 75,
            steps = 3553,
            sleepHours = 7.94,
            caloriesBurned = 182.82,
            stressLevel = 4,
            bodyTemperatureC = 37.05
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-14T12:00:00Z",
            heartRate = 73,
            steps = 5262,
            sleepHours = 8.01,
            caloriesBurned = 215.1,
            stressLevel = 8,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-14T18:00:00Z",
            heartRate = 67,
            steps = 5887,
            sleepHours = 7.36,
            caloriesBurned = 245.59,
            stressLevel = 5,
            bodyTemperatureC = 36.9
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-15T06:00:00Z",
            heartRate = 60,
            steps = 3075,
            sleepHours = 7.45,
            caloriesBurned = 367.17,
            stressLevel = 2,
            bodyTemperatureC = 36.41
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-15T12:00:00Z",
            heartRate = 62,
            steps = 4329,
            sleepHours = 8.01,
            caloriesBurned = 370.81,
            stressLevel = 4,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-15T18:00:00Z",
            heartRate = 73,
            steps = 2546,
            sleepHours = 7.02,
            caloriesBurned = 251.91,
            stressLevel = 3,
            bodyTemperatureC = 36.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-16T06:00:00Z",
            heartRate = 58,
            steps = 4406,
            sleepHours = 7.11,
            caloriesBurned = 261.08,
            stressLevel = 6,
            bodyTemperatureC = 37.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-16T12:00:00Z",
            heartRate = 83,
            steps = 5381,
            sleepHours = 8.04,
            caloriesBurned = 318.06,
            stressLevel = 7,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-16T18:00:00Z",
            heartRate = 64,
            steps = 4005,
            sleepHours = 7.73,
            caloriesBurned = 223.83,
            stressLevel = 3,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-17T06:00:00Z",
            heartRate = 69,
            steps = 5562,
            sleepHours = 8.48,
            caloriesBurned = 254.72,
            stressLevel = 7,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-17T12:00:00Z",
            heartRate = 70,
            steps = 5602,
            sleepHours = 7.58,
            caloriesBurned = 312.82,
            stressLevel = 3,
            bodyTemperatureC = 37.01
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-17T18:00:00Z",
            heartRate = 76,
            steps = 5591,
            sleepHours = 7.69,
            caloriesBurned = 337.47,
            stressLevel = 6,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-18T06:00:00Z",
            heartRate = 77,
            steps = 3981,
            sleepHours = 6.66,
            caloriesBurned = 292.83,
            stressLevel = 2,
            bodyTemperatureC = 37.09
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-18T12:00:00Z",
            heartRate = 83,
            steps = 4570,
            sleepHours = 6.9,
            caloriesBurned = 287.33,
            stressLevel = 3,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-18T18:00:00Z",
            heartRate = 71,
            steps = 4309,
            sleepHours = 6.73,
            caloriesBurned = 221.08,
            stressLevel = 6,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-19T06:00:00Z",
            heartRate = 83,
            steps = 4590,
            sleepHours = 7.39,
            caloriesBurned = 191.13,
            stressLevel = 3,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-19T12:00:00Z",
            heartRate = 69,
            steps = 4809,
            sleepHours = 6.62,
            caloriesBurned = 272.48,
            stressLevel = 8,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-19T18:00:00Z",
            heartRate = 55,
            steps = 4121,
            sleepHours = 7.01,
            caloriesBurned = 180.6,
            stressLevel = 3,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-20T06:00:00Z",
            heartRate = 56,
            steps = 4235,
            sleepHours = 7.19,
            caloriesBurned = 192.75,
            stressLevel = 2,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-20T12:00:00Z",
            heartRate = 57,
            steps = 6324,
            sleepHours = 7.44,
            caloriesBurned = 237.42,
            stressLevel = 3,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-20T18:00:00Z",
            heartRate = 79,
            steps = 5127,
            sleepHours = 8.46,
            caloriesBurned = 309.18,
            stressLevel = 5,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-21T06:00:00Z",
            heartRate = 83,
            steps = 4066,
            sleepHours = 7.4,
            caloriesBurned = 363.42,
            stressLevel = 5,
            bodyTemperatureC = 36.55
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-21T12:00:00Z",
            heartRate = 76,
            steps = 6449,
            sleepHours = 7.82,
            caloriesBurned = 287.86,
            stressLevel = 7,
            bodyTemperatureC = 37.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-21T18:00:00Z",
            heartRate = 58,
            steps = 3231,
            sleepHours = 8.49,
            caloriesBurned = 258.61,
            stressLevel = 3,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-22T06:00:00Z",
            heartRate = 62,
            steps = 5919,
            sleepHours = 6.51,
            caloriesBurned = 184.55,
            stressLevel = 4,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-22T12:00:00Z",
            heartRate = 78,
            steps = 4730,
            sleepHours = 7.35,
            caloriesBurned = 255.86,
            stressLevel = 3,
            bodyTemperatureC = 36.4
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-22T18:00:00Z",
            heartRate = 66,
            steps = 3135,
            sleepHours = 7.05,
            caloriesBurned = 367.48,
            stressLevel = 7,
            bodyTemperatureC = 37.02
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-23T06:00:00Z",
            heartRate = 56,
            steps = 5815,
            sleepHours = 7.82,
            caloriesBurned = 302.98,
            stressLevel = 2,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-23T12:00:00Z",
            heartRate = 57,
            steps = 2913,
            sleepHours = 7.69,
            caloriesBurned = 269.29,
            stressLevel = 7,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-23T18:00:00Z",
            heartRate = 56,
            steps = 3502,
            sleepHours = 7.98,
            caloriesBurned = 260.45,
            stressLevel = 3,
            bodyTemperatureC = 36.75
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-24T06:00:00Z",
            heartRate = 79,
            steps = 6037,
            sleepHours = 8.05,
            caloriesBurned = 208.03,
            stressLevel = 4,
            bodyTemperatureC = 36.38
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-24T12:00:00Z",
            heartRate = 84,
            steps = 5496,
            sleepHours = 7.65,
            caloriesBurned = 295.49,
            stressLevel = 8,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-24T18:00:00Z",
            heartRate = 65,
            steps = 3470,
            sleepHours = 7.1,
            caloriesBurned = 208.65,
            stressLevel = 7,
            bodyTemperatureC = 36.73
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-25T06:00:00Z",
            heartRate = 68,
            steps = 3730,
            sleepHours = 7.05,
            caloriesBurned = 291.34,
            stressLevel = 6,
            bodyTemperatureC = 37.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-25T12:00:00Z",
            heartRate = 84,
            steps = 3217,
            sleepHours = 7.75,
            caloriesBurned = 265.44,
            stressLevel = 5,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-25T18:00:00Z",
            heartRate = 66,
            steps = 6356,
            sleepHours = 7.79,
            caloriesBurned = 256.23,
            stressLevel = 6,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-26T06:00:00Z",
            heartRate = 68,
            steps = 4172,
            sleepHours = 6.8,
            caloriesBurned = 255.29,
            stressLevel = 8,
            bodyTemperatureC = 36.75
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-26T12:00:00Z",
            heartRate = 62,
            steps = 5978,
            sleepHours = 6.95,
            caloriesBurned = 351.51,
            stressLevel = 3,
            bodyTemperatureC = 37.07
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-26T18:00:00Z",
            heartRate = 84,
            steps = 2736,
            sleepHours = 7.62,
            caloriesBurned = 373.56,
            stressLevel = 6,
            bodyTemperatureC = 36.74
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-27T06:00:00Z",
            heartRate = 67,
            steps = 3494,
            sleepHours = 7.01,
            caloriesBurned = 246.05,
            stressLevel = 2,
            bodyTemperatureC = 37.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-27T12:00:00Z",
            heartRate = 82,
            steps = 4019,
            sleepHours = 6.68,
            caloriesBurned = 324.92,
            stressLevel = 3,
            bodyTemperatureC = 36.16
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-27T18:00:00Z",
            heartRate = 67,
            steps = 5259,
            sleepHours = 7.71,
            caloriesBurned = 187.91,
            stressLevel = 2,
            bodyTemperatureC = 36.33
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-28T06:00:00Z",
            heartRate = 79,
            steps = 4906,
            sleepHours = 7.95,
            caloriesBurned = 291.77,
            stressLevel = 5,
            bodyTemperatureC = 36.35
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-28T12:00:00Z",
            heartRate = 84,
            steps = 3863,
            sleepHours = 7.11,
            caloriesBurned = 361.8,
            stressLevel = 3,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-28T18:00:00Z",
            heartRate = 85,
            steps = 5537,
            sleepHours = 6.73,
            caloriesBurned = 379.91,
            stressLevel = 5,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-29T06:00:00Z",
            heartRate = 77,
            steps = 4975,
            sleepHours = 7.91,
            caloriesBurned = 259.33,
            stressLevel = 3,
            bodyTemperatureC = 36.76
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-29T12:00:00Z",
            heartRate = 79,
            steps = 3659,
            sleepHours = 7.26,
            caloriesBurned = 286.73,
            stressLevel = 4,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-29T18:00:00Z",
            heartRate = 66,
            steps = 4600,
            sleepHours = 8.27,
            caloriesBurned = 273.2,
            stressLevel = 8,
            bodyTemperatureC = 37.28
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-30T06:00:00Z",
            heartRate = 70,
            steps = 5619,
            sleepHours = 8.18,
            caloriesBurned = 362.87,
            stressLevel = 4,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-30T12:00:00Z",
            heartRate = 56,
            steps = 4804,
            sleepHours = 8.23,
            caloriesBurned = 328.25,
            stressLevel = 2,
            bodyTemperatureC = 36.41
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-30T18:00:00Z",
            heartRate = 84,
            steps = 4892,
            sleepHours = 7.66,
            caloriesBurned = 263.52,
            stressLevel = 3,
            bodyTemperatureC = 36.34
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-31T06:00:00Z",
            heartRate = 62,
            steps = 4055,
            sleepHours = 7.64,
            caloriesBurned = 229.15,
            stressLevel = 6,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-31T12:00:00Z",
            heartRate = 76,
            steps = 3882,
            sleepHours = 7.01,
            caloriesBurned = 344.32,
            stressLevel = 7,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-05-31T18:00:00Z",
            heartRate = 70,
            steps = 4387,
            sleepHours = 6.84,
            caloriesBurned = 339.0,
            stressLevel = 3,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-01T06:00:00Z",
            heartRate = 72,
            steps = 4500,
            sleepHours = 6.87,
            caloriesBurned = 357.87,
            stressLevel = 7,
            bodyTemperatureC = 37.25
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-01T12:00:00Z",
            heartRate = 71,
            steps = 2638,
            sleepHours = 8.18,
            caloriesBurned = 194.87,
            stressLevel = 8,
            bodyTemperatureC = 36.9
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-01T18:00:00Z",
            heartRate = 79,
            steps = 2526,
            sleepHours = 7.32,
            caloriesBurned = 348.51,
            stressLevel = 3,
            bodyTemperatureC = 36.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-02T06:00:00Z",
            heartRate = 59,
            steps = 2537,
            sleepHours = 6.94,
            caloriesBurned = 271.2,
            stressLevel = 2,
            bodyTemperatureC = 36.84
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-02T12:00:00Z",
            heartRate = 76,
            steps = 6325,
            sleepHours = 7.73,
            caloriesBurned = 276.64,
            stressLevel = 5,
            bodyTemperatureC = 36.12
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-02T18:00:00Z",
            heartRate = 72,
            steps = 4759,
            sleepHours = 7.32,
            caloriesBurned = 183.35,
            stressLevel = 7,
            bodyTemperatureC = 36.43
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-03T06:00:00Z",
            heartRate = 64,
            steps = 2570,
            sleepHours = 7.5,
            caloriesBurned = 319.57,
            stressLevel = 5,
            bodyTemperatureC = 37.07
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-03T12:00:00Z",
            heartRate = 84,
            steps = 3234,
            sleepHours = 6.71,
            caloriesBurned = 199.26,
            stressLevel = 3,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-03T18:00:00Z",
            heartRate = 74,
            steps = 4656,
            sleepHours = 7.0,
            caloriesBurned = 250.89,
            stressLevel = 8,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-04T06:00:00Z",
            heartRate = 66,
            steps = 6429,
            sleepHours = 7.31,
            caloriesBurned = 293.0,
            stressLevel = 7,
            bodyTemperatureC = 36.37
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-04T12:00:00Z",
            heartRate = 76,
            steps = 5891,
            sleepHours = 8.2,
            caloriesBurned = 310.75,
            stressLevel = 8,
            bodyTemperatureC = 36.88
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-04T18:00:00Z",
            heartRate = 56,
            steps = 2882,
            sleepHours = 7.31,
            caloriesBurned = 255.43,
            stressLevel = 5,
            bodyTemperatureC = 36.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-05T06:00:00Z",
            heartRate = 55,
            steps = 5378,
            sleepHours = 6.84,
            caloriesBurned = 279.97,
            stressLevel = 5,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-05T12:00:00Z",
            heartRate = 65,
            steps = 4817,
            sleepHours = 8.45,
            caloriesBurned = 374.77,
            stressLevel = 6,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-05T18:00:00Z",
            heartRate = 62,
            steps = 3365,
            sleepHours = 8.3,
            caloriesBurned = 318.46,
            stressLevel = 6,
            bodyTemperatureC = 36.67
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-06T06:00:00Z",
            heartRate = 56,
            steps = 6285,
            sleepHours = 6.65,
            caloriesBurned = 365.12,
            stressLevel = 6,
            bodyTemperatureC = 36.78
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-06T12:00:00Z",
            heartRate = 56,
            steps = 3234,
            sleepHours = 8.36,
            caloriesBurned = 242.9,
            stressLevel = 3,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-06T18:00:00Z",
            heartRate = 79,
            steps = 5861,
            sleepHours = 7.93,
            caloriesBurned = 259.66,
            stressLevel = 2,
            bodyTemperatureC = 36.46
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-07T06:00:00Z",
            heartRate = 73,
            steps = 3484,
            sleepHours = 7.63,
            caloriesBurned = 349.89,
            stressLevel = 7,
            bodyTemperatureC = 37.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-07T12:00:00Z",
            heartRate = 65,
            steps = 4072,
            sleepHours = 8.01,
            caloriesBurned = 207.99,
            stressLevel = 7,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-07T18:00:00Z",
            heartRate = 71,
            steps = 5553,
            sleepHours = 8.45,
            caloriesBurned = 190.74,
            stressLevel = 5,
            bodyTemperatureC = 36.38
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-08T06:00:00Z",
            heartRate = 57,
            steps = 3895,
            sleepHours = 7.71,
            caloriesBurned = 302.77,
            stressLevel = 6,
            bodyTemperatureC = 36.58
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-08T12:00:00Z",
            heartRate = 79,
            steps = 3836,
            sleepHours = 6.56,
            caloriesBurned = 234.67,
            stressLevel = 5,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-08T18:00:00Z",
            heartRate = 66,
            steps = 4765,
            sleepHours = 8.38,
            caloriesBurned = 266.37,
            stressLevel = 7,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-09T06:00:00Z",
            heartRate = 67,
            steps = 2851,
            sleepHours = 8.04,
            caloriesBurned = 239.08,
            stressLevel = 3,
            bodyTemperatureC = 36.96
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-09T12:00:00Z",
            heartRate = 57,
            steps = 3597,
            sleepHours = 6.81,
            caloriesBurned = 322.34,
            stressLevel = 7,
            bodyTemperatureC = 36.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-09T18:00:00Z",
            heartRate = 67,
            steps = 3797,
            sleepHours = 7.22,
            caloriesBurned = 198.3,
            stressLevel = 4,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-10T06:00:00Z",
            heartRate = 79,
            steps = 3604,
            sleepHours = 6.7,
            caloriesBurned = 197.46,
            stressLevel = 5,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-10T12:00:00Z",
            heartRate = 72,
            steps = 4598,
            sleepHours = 7.32,
            caloriesBurned = 185.25,
            stressLevel = 4,
            bodyTemperatureC = 36.77
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-10T18:00:00Z",
            heartRate = 74,
            steps = 4949,
            sleepHours = 8.07,
            caloriesBurned = 352.74,
            stressLevel = 2,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-11T06:00:00Z",
            heartRate = 67,
            steps = 5691,
            sleepHours = 6.67,
            caloriesBurned = 360.23,
            stressLevel = 3,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-11T12:00:00Z",
            heartRate = 60,
            steps = 5307,
            sleepHours = 7.26,
            caloriesBurned = 207.77,
            stressLevel = 4,
            bodyTemperatureC = 36.42
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-11T18:00:00Z",
            heartRate = 59,
            steps = 2759,
            sleepHours = 6.83,
            caloriesBurned = 235.19,
            stressLevel = 4,
            bodyTemperatureC = 36.68
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-12T06:00:00Z",
            heartRate = 57,
            steps = 3979,
            sleepHours = 7.0,
            caloriesBurned = 229.32,
            stressLevel = 7,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-12T12:00:00Z",
            heartRate = 74,
            steps = 3300,
            sleepHours = 7.42,
            caloriesBurned = 207.1,
            stressLevel = 2,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-12T18:00:00Z",
            heartRate = 65,
            steps = 5947,
            sleepHours = 7.74,
            caloriesBurned = 340.82,
            stressLevel = 4,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-13T06:00:00Z",
            heartRate = 68,
            steps = 5840,
            sleepHours = 8.15,
            caloriesBurned = 310.21,
            stressLevel = 6,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-13T12:00:00Z",
            heartRate = 65,
            steps = 4970,
            sleepHours = 8.39,
            caloriesBurned = 220.17,
            stressLevel = 4,
            bodyTemperatureC = 36.31
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-13T18:00:00Z",
            heartRate = 67,
            steps = 6467,
            sleepHours = 7.14,
            caloriesBurned = 326.97,
            stressLevel = 7,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-14T06:00:00Z",
            heartRate = 73,
            steps = 5702,
            sleepHours = 6.98,
            caloriesBurned = 255.21,
            stressLevel = 8,
            bodyTemperatureC = 37.04
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-14T12:00:00Z",
            heartRate = 66,
            steps = 2966,
            sleepHours = 8.36,
            caloriesBurned = 219.96,
            stressLevel = 6,
            bodyTemperatureC = 36.32
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-14T18:00:00Z",
            heartRate = 79,
            steps = 4753,
            sleepHours = 6.55,
            caloriesBurned = 325.44,
            stressLevel = 7,
            bodyTemperatureC = 36.35
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-15T06:00:00Z",
            heartRate = 80,
            steps = 3693,
            sleepHours = 8.16,
            caloriesBurned = 193.83,
            stressLevel = 8,
            bodyTemperatureC = 37.05
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-15T12:00:00Z",
            heartRate = 68,
            steps = 5256,
            sleepHours = 7.5,
            caloriesBurned = 306.67,
            stressLevel = 3,
            bodyTemperatureC = 36.4
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-15T18:00:00Z",
            heartRate = 59,
            steps = 5429,
            sleepHours = 7.35,
            caloriesBurned = 255.4,
            stressLevel = 5,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-16T06:00:00Z",
            heartRate = 70,
            steps = 4884,
            sleepHours = 7.3,
            caloriesBurned = 281.32,
            stressLevel = 8,
            bodyTemperatureC = 36.93
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-16T12:00:00Z",
            heartRate = 72,
            steps = 2650,
            sleepHours = 8.08,
            caloriesBurned = 251.91,
            stressLevel = 8,
            bodyTemperatureC = 36.74
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-16T18:00:00Z",
            heartRate = 75,
            steps = 6245,
            sleepHours = 6.67,
            caloriesBurned = 333.79,
            stressLevel = 7,
            bodyTemperatureC = 36.9
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-17T06:00:00Z",
            heartRate = 60,
            steps = 5150,
            sleepHours = 7.73,
            caloriesBurned = 292.64,
            stressLevel = 7,
            bodyTemperatureC = 36.91
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-17T12:00:00Z",
            heartRate = 67,
            steps = 6460,
            sleepHours = 8.01,
            caloriesBurned = 373.14,
            stressLevel = 5,
            bodyTemperatureC = 36.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-17T18:00:00Z",
            heartRate = 58,
            steps = 3559,
            sleepHours = 6.94,
            caloriesBurned = 329.37,
            stressLevel = 6,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-18T06:00:00Z",
            heartRate = 73,
            steps = 3405,
            sleepHours = 7.39,
            caloriesBurned = 258.23,
            stressLevel = 8,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-18T12:00:00Z",
            heartRate = 77,
            steps = 4549,
            sleepHours = 6.8,
            caloriesBurned = 379.54,
            stressLevel = 5,
            bodyTemperatureC = 36.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-18T18:00:00Z",
            heartRate = 68,
            steps = 6270,
            sleepHours = 8.42,
            caloriesBurned = 203.21,
            stressLevel = 7,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-19T06:00:00Z",
            heartRate = 64,
            steps = 3905,
            sleepHours = 7.41,
            caloriesBurned = 221.37,
            stressLevel = 5,
            bodyTemperatureC = 36.52
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-19T12:00:00Z",
            heartRate = 58,
            steps = 4294,
            sleepHours = 7.94,
            caloriesBurned = 270.49,
            stressLevel = 2,
            bodyTemperatureC = 36.46
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-19T18:00:00Z",
            heartRate = 80,
            steps = 5411,
            sleepHours = 6.73,
            caloriesBurned = 349.84,
            stressLevel = 7,
            bodyTemperatureC = 36.23
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-20T06:00:00Z",
            heartRate = 80,
            steps = 3173,
            sleepHours = 8.36,
            caloriesBurned = 328.1,
            stressLevel = 6,
            bodyTemperatureC = 36.31
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-20T12:00:00Z",
            heartRate = 60,
            steps = 3855,
            sleepHours = 7.62,
            caloriesBurned = 371.69,
            stressLevel = 3,
            bodyTemperatureC = 37.06
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-20T18:00:00Z",
            heartRate = 75,
            steps = 3255,
            sleepHours = 6.87,
            caloriesBurned = 311.46,
            stressLevel = 5,
            bodyTemperatureC = 36.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-21T06:00:00Z",
            heartRate = 74,
            steps = 6117,
            sleepHours = 6.89,
            caloriesBurned = 298.44,
            stressLevel = 5,
            bodyTemperatureC = 36.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-21T12:00:00Z",
            heartRate = 61,
            steps = 3342,
            sleepHours = 7.06,
            caloriesBurned = 320.75,
            stressLevel = 8,
            bodyTemperatureC = 36.18
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-21T18:00:00Z",
            heartRate = 58,
            steps = 5774,
            sleepHours = 8.24,
            caloriesBurned = 217.39,
            stressLevel = 4,
            bodyTemperatureC = 36.34
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-22T06:00:00Z",
            heartRate = 58,
            steps = 3574,
            sleepHours = 7.84,
            caloriesBurned = 277.9,
            stressLevel = 7,
            bodyTemperatureC = 36.48
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-22T12:00:00Z",
            heartRate = 67,
            steps = 5003,
            sleepHours = 7.29,
            caloriesBurned = 202.85,
            stressLevel = 4,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-22T18:00:00Z",
            heartRate = 74,
            steps = 3206,
            sleepHours = 8.13,
            caloriesBurned = 321.2,
            stressLevel = 4,
            bodyTemperatureC = 37.2
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-23T06:00:00Z",
            heartRate = 73,
            steps = 2847,
            sleepHours = 7.84,
            caloriesBurned = 242.64,
            stressLevel = 3,
            bodyTemperatureC = 36.47
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-23T12:00:00Z",
            heartRate = 60,
            steps = 4029,
            sleepHours = 7.89,
            caloriesBurned = 282.16,
            stressLevel = 5,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-23T18:00:00Z",
            heartRate = 73,
            steps = 4071,
            sleepHours = 7.35,
            caloriesBurned = 277.33,
            stressLevel = 6,
            bodyTemperatureC = 36.93
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-24T06:00:00Z",
            heartRate = 75,
            steps = 6312,
            sleepHours = 8.5,
            caloriesBurned = 290.98,
            stressLevel = 5,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-24T12:00:00Z",
            heartRate = 60,
            steps = 3788,
            sleepHours = 8.18,
            caloriesBurned = 303.88,
            stressLevel = 8,
            bodyTemperatureC = 36.53
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-24T18:00:00Z",
            heartRate = 55,
            steps = 4484,
            sleepHours = 6.77,
            caloriesBurned = 343.04,
            stressLevel = 6,
            bodyTemperatureC = 36.71
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-25T06:00:00Z",
            heartRate = 70,
            steps = 4175,
            sleepHours = 7.87,
            caloriesBurned = 263.13,
            stressLevel = 8,
            bodyTemperatureC = 36.63
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-25T12:00:00Z",
            heartRate = 60,
            steps = 2838,
            sleepHours = 7.63,
            caloriesBurned = 339.18,
            stressLevel = 3,
            bodyTemperatureC = 36.45
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-25T18:00:00Z",
            heartRate = 63,
            steps = 3420,
            sleepHours = 7.58,
            caloriesBurned = 213.64,
            stressLevel = 5,
            bodyTemperatureC = 36.78
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-26T06:00:00Z",
            heartRate = 79,
            steps = 5637,
            sleepHours = 7.49,
            caloriesBurned = 282.16,
            stressLevel = 6,
            bodyTemperatureC = 36.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-26T12:00:00Z",
            heartRate = 79,
            steps = 4724,
            sleepHours = 8.15,
            caloriesBurned = 253.37,
            stressLevel = 8,
            bodyTemperatureC = 37.01
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-26T18:00:00Z",
            heartRate = 79,
            steps = 5444,
            sleepHours = 7.38,
            caloriesBurned = 223.71,
            stressLevel = 5,
            bodyTemperatureC = 36.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-27T06:00:00Z",
            heartRate = 81,
            steps = 5177,
            sleepHours = 8.0,
            caloriesBurned = 239.54,
            stressLevel = 2,
            bodyTemperatureC = 36.64
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-27T12:00:00Z",
            heartRate = 66,
            steps = 6031,
            sleepHours = 8.13,
            caloriesBurned = 267.81,
            stressLevel = 2,
            bodyTemperatureC = 37.03
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-27T18:00:00Z",
            heartRate = 62,
            steps = 3359,
            sleepHours = 8.12,
            caloriesBurned = 297.58,
            stressLevel = 4,
            bodyTemperatureC = 37.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-28T06:00:00Z",
            heartRate = 74,
            steps = 5091,
            sleepHours = 7.36,
            caloriesBurned = 303.23,
            stressLevel = 8,
            bodyTemperatureC = 36.35
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-28T12:00:00Z",
            heartRate = 61,
            steps = 5799,
            sleepHours = 6.62,
            caloriesBurned = 250.16,
            stressLevel = 4,
            bodyTemperatureC = 36.82
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-28T18:00:00Z",
            heartRate = 60,
            steps = 3825,
            sleepHours = 8.46,
            caloriesBurned = 238.53,
            stressLevel = 6,
            bodyTemperatureC = 36.42
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-29T06:00:00Z",
            heartRate = 82,
            steps = 4607,
            sleepHours = 8.47,
            caloriesBurned = 315.86,
            stressLevel = 2,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-29T12:00:00Z",
            heartRate = 79,
            steps = 5718,
            sleepHours = 7.32,
            caloriesBurned = 191.86,
            stressLevel = 4,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-29T18:00:00Z",
            heartRate = 59,
            steps = 5373,
            sleepHours = 8.23,
            caloriesBurned = 229.94,
            stressLevel = 7,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-30T06:00:00Z",
            heartRate = 62,
            steps = 5618,
            sleepHours = 8.19,
            caloriesBurned = 258.54,
            stressLevel = 3,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-30T12:00:00Z",
            heartRate = 63,
            steps = 5071,
            sleepHours = 7.33,
            caloriesBurned = 270.4,
            stressLevel = 7,
            bodyTemperatureC = 37.05
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-06-30T18:00:00Z",
            heartRate = 79,
            steps = 2881,
            sleepHours = 7.31,
            caloriesBurned = 329.96,
            stressLevel = 7,
            bodyTemperatureC = 37.22
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-01T06:00:00Z",
            heartRate = 66,
            steps = 4362,
            sleepHours = 8.4,
            caloriesBurned = 245.46,
            stressLevel = 2,
            bodyTemperatureC = 37.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-01T12:00:00Z",
            heartRate = 82,
            steps = 5501,
            sleepHours = 6.69,
            caloriesBurned = 374.43,
            stressLevel = 7,
            bodyTemperatureC = 36.9
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-01T18:00:00Z",
            heartRate = 66,
            steps = 5982,
            sleepHours = 6.63,
            caloriesBurned = 286.88,
            stressLevel = 3,
            bodyTemperatureC = 37.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-02T06:00:00Z",
            heartRate = 81,
            steps = 3367,
            sleepHours = 7.49,
            caloriesBurned = 244.57,
            stressLevel = 4,
            bodyTemperatureC = 36.51
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-02T12:00:00Z",
            heartRate = 73,
            steps = 3034,
            sleepHours = 7.63,
            caloriesBurned = 277.07,
            stressLevel = 4,
            bodyTemperatureC = 37.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-02T18:00:00Z",
            heartRate = 79,
            steps = 2698,
            sleepHours = 6.59,
            caloriesBurned = 305.24,
            stressLevel = 8,
            bodyTemperatureC = 36.65
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-03T06:00:00Z",
            heartRate = 58,
            steps = 6306,
            sleepHours = 8.22,
            caloriesBurned = 268.26,
            stressLevel = 2,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-03T12:00:00Z",
            heartRate = 68,
            steps = 3328,
            sleepHours = 8.49,
            caloriesBurned = 361.88,
            stressLevel = 7,
            bodyTemperatureC = 36.46
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-03T18:00:00Z",
            heartRate = 82,
            steps = 6320,
            sleepHours = 8.25,
            caloriesBurned = 198.67,
            stressLevel = 4,
            bodyTemperatureC = 36.4
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-04T06:00:00Z",
            heartRate = 66,
            steps = 5221,
            sleepHours = 8.31,
            caloriesBurned = 213.11,
            stressLevel = 5,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-04T12:00:00Z",
            heartRate = 78,
            steps = 5364,
            sleepHours = 8.01,
            caloriesBurned = 265.85,
            stressLevel = 2,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-04T18:00:00Z",
            heartRate = 55,
            steps = 3374,
            sleepHours = 7.45,
            caloriesBurned = 206.54,
            stressLevel = 3,
            bodyTemperatureC = 36.72
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-05T06:00:00Z",
            heartRate = 69,
            steps = 2538,
            sleepHours = 6.52,
            caloriesBurned = 248.71,
            stressLevel = 2,
            bodyTemperatureC = 37.29
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-05T12:00:00Z",
            heartRate = 68,
            steps = 5342,
            sleepHours = 6.76,
            caloriesBurned = 194.17,
            stressLevel = 5,
            bodyTemperatureC = 36.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-05T18:00:00Z",
            heartRate = 80,
            steps = 2919,
            sleepHours = 6.71,
            caloriesBurned = 253.51,
            stressLevel = 4,
            bodyTemperatureC = 36.26
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-06T06:00:00Z",
            heartRate = 79,
            steps = 5831,
            sleepHours = 8.01,
            caloriesBurned = 206.63,
            stressLevel = 7,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-06T12:00:00Z",
            heartRate = 71,
            steps = 4807,
            sleepHours = 6.52,
            caloriesBurned = 310.0,
            stressLevel = 5,
            bodyTemperatureC = 36.52
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-06T18:00:00Z",
            heartRate = 61,
            steps = 5072,
            sleepHours = 8.0,
            caloriesBurned = 363.98,
            stressLevel = 6,
            bodyTemperatureC = 36.92
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-07T06:00:00Z",
            heartRate = 82,
            steps = 3389,
            sleepHours = 6.67,
            caloriesBurned = 200.09,
            stressLevel = 8,
            bodyTemperatureC = 36.25
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-07T12:00:00Z",
            heartRate = 78,
            steps = 4072,
            sleepHours = 7.2,
            caloriesBurned = 265.88,
            stressLevel = 8,
            bodyTemperatureC = 36.27
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-07T18:00:00Z",
            heartRate = 63,
            steps = 5140,
            sleepHours = 6.67,
            caloriesBurned = 290.68,
            stressLevel = 6,
            bodyTemperatureC = 36.97
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-08T06:00:00Z",
            heartRate = 64,
            steps = 5690,
            sleepHours = 8.38,
            caloriesBurned = 185.36,
            stressLevel = 8,
            bodyTemperatureC = 36.89
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-08T12:00:00Z",
            heartRate = 64,
            steps = 3341,
            sleepHours = 7.54,
            caloriesBurned = 281.9,
            stressLevel = 7,
            bodyTemperatureC = 36.57
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-08T18:00:00Z",
            heartRate = 75,
            steps = 2723,
            sleepHours = 8.07,
            caloriesBurned = 338.76,
            stressLevel = 3,
            bodyTemperatureC = 36.69
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-09T06:00:00Z",
            heartRate = 58,
            steps = 3487,
            sleepHours = 7.5,
            caloriesBurned = 298.79,
            stressLevel = 6,
            bodyTemperatureC = 37.17
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-09T12:00:00Z",
            heartRate = 55,
            steps = 3979,
            sleepHours = 8.37,
            caloriesBurned = 206.4,
            stressLevel = 8,
            bodyTemperatureC = 37.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-09T18:00:00Z",
            heartRate = 68,
            steps = 3996,
            sleepHours = 7.59,
            caloriesBurned = 214.55,
            stressLevel = 5,
            bodyTemperatureC = 37.25
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-10T06:00:00Z",
            heartRate = 79,
            steps = 2798,
            sleepHours = 6.53,
            caloriesBurned = 193.51,
            stressLevel = 4,
            bodyTemperatureC = 36.36
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-10T12:00:00Z",
            heartRate = 84,
            steps = 2747,
            sleepHours = 8.4,
            caloriesBurned = 259.6,
            stressLevel = 4,
            bodyTemperatureC = 36.85
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-10T18:00:00Z",
            heartRate = 71,
            steps = 5642,
            sleepHours = 7.33,
            caloriesBurned = 320.36,
            stressLevel = 2,
            bodyTemperatureC = 36.87
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-11T06:00:00Z",
            heartRate = 72,
            steps = 5023,
            sleepHours = 6.81,
            caloriesBurned = 196.72,
            stressLevel = 2,
            bodyTemperatureC = 36.71
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-11T12:00:00Z",
            heartRate = 61,
            steps = 6490,
            sleepHours = 8.12,
            caloriesBurned = 287.28,
            stressLevel = 5,
            bodyTemperatureC = 36.8
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-11T18:00:00Z",
            heartRate = 79,
            steps = 5918,
            sleepHours = 7.8,
            caloriesBurned = 308.63,
            stressLevel = 4,
            bodyTemperatureC = 36.94
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-12T06:00:00Z",
            heartRate = 78,
            steps = 6405,
            sleepHours = 8.19,
            caloriesBurned = 191.58,
            stressLevel = 2,
            bodyTemperatureC = 37.21
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-12T12:00:00Z",
            heartRate = 58,
            steps = 4357,
            sleepHours = 7.72,
            caloriesBurned = 191.01,
            stressLevel = 7,
            bodyTemperatureC = 36.99
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-12T18:00:00Z",
            heartRate = 78,
            steps = 3219,
            sleepHours = 6.74,
            caloriesBurned = 321.58,
            stressLevel = 7,
            bodyTemperatureC = 36.11
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-13T06:00:00Z",
            heartRate = 70,
            steps = 6403,
            sleepHours = 7.19,
            caloriesBurned = 283.44,
            stressLevel = 8,
            bodyTemperatureC = 36.96
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-13T12:00:00Z",
            heartRate = 60,
            steps = 4023,
            sleepHours = 6.75,
            caloriesBurned = 336.22,
            stressLevel = 4,
            bodyTemperatureC = 36.98
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-13T18:00:00Z",
            heartRate = 58,
            steps = 5659,
            sleepHours = 8.3,
            caloriesBurned = 247.0,
            stressLevel = 5,
            bodyTemperatureC = 36.43
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-14T06:00:00Z",
            heartRate = 57,
            steps = 3577,
            sleepHours = 7.92,
            caloriesBurned = 295.33,
            stressLevel = 2,
            bodyTemperatureC = 36.7
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-14T12:00:00Z",
            heartRate = 71,
            steps = 3975,
            sleepHours = 6.61,
            caloriesBurned = 351.87,
            stressLevel = 3,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-14T18:00:00Z",
            heartRate = 63,
            steps = 5667,
            sleepHours = 6.71,
            caloriesBurned = 294.78,
            stressLevel = 7,
            bodyTemperatureC = 36.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-15T06:00:00Z",
            heartRate = 78,
            steps = 4584,
            sleepHours = 6.51,
            caloriesBurned = 351.74,
            stressLevel = 2,
            bodyTemperatureC = 36.39
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-15T12:00:00Z",
            heartRate = 70,
            steps = 3990,
            sleepHours = 7.27,
            caloriesBurned = 210.02,
            stressLevel = 8,
            bodyTemperatureC = 36.14
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-15T18:00:00Z",
            heartRate = 80,
            steps = 6243,
            sleepHours = 7.93,
            caloriesBurned = 311.14,
            stressLevel = 3,
            bodyTemperatureC = 36.49
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-16T06:00:00Z",
            heartRate = 68,
            steps = 6251,
            sleepHours = 7.94,
            caloriesBurned = 234.25,
            stressLevel = 2,
            bodyTemperatureC = 36.79
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-16T12:00:00Z",
            heartRate = 58,
            steps = 4556,
            sleepHours = 7.85,
            caloriesBurned = 190.53,
            stressLevel = 3,
            bodyTemperatureC = 37.07
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-16T18:00:00Z",
            heartRate = 56,
            steps = 6407,
            sleepHours = 7.3,
            caloriesBurned = 355.4,
            stressLevel = 8,
            bodyTemperatureC = 36.44
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-17T06:00:00Z",
            heartRate = 82,
            steps = 3772,
            sleepHours = 7.15,
            caloriesBurned = 290.62,
            stressLevel = 2,
            bodyTemperatureC = 36.54
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-17T12:00:00Z",
            heartRate = 64,
            steps = 4809,
            sleepHours = 8.07,
            caloriesBurned = 327.92,
            stressLevel = 3,
            bodyTemperatureC = 36.66
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-17T18:00:00Z",
            heartRate = 73,
            steps = 6480,
            sleepHours = 7.49,
            caloriesBurned = 334.52,
            stressLevel = 3,
            bodyTemperatureC = 36.98
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-18T06:00:00Z",
            heartRate = 72,
            steps = 5614,
            sleepHours = 8.09,
            caloriesBurned = 210.11,
            stressLevel = 5,
            bodyTemperatureC = 36.13
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-18T12:00:00Z",
            heartRate = 72,
            steps = 3918,
            sleepHours = 7.77,
            caloriesBurned = 318.69,
            stressLevel = 2,
            bodyTemperatureC = 37.24
        ),
        HealthMetricRequest(
            userId = "athena",
            timestamp = "2024-07-18T18:00:00Z",
            heartRate = 55,
            steps = 5608,
            sleepHours = 7.81,
            caloriesBurned = 349.8,
            stressLevel = 7,
            bodyTemperatureC = 36.47
        ),
    ).map { it.copy(userId = userId) }
}
