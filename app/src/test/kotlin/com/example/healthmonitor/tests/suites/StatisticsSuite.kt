package com.example.healthmonitor.tests.suites

import com.example.healthmonitor.analytics.StatisticsCalculator
import com.example.healthmonitor.model.MetricSample
import com.example.healthmonitor.tests.TestCase
import com.example.healthmonitor.tests.TestSuite
import com.example.healthmonitor.tests.assertEquals

class StatisticsSuite : TestSuite() {
    override val name: String = "StatisticsSuite"

    override fun tests(): List<TestCase> = listOf(
        TestCase("summarize averages") {
            val calculator = StatisticsCalculator()
            val samples = listOf(
                MetricSample("2024-01-01T08:00:00Z", 70, 2000, 2.0, 180.0, 3, 36.4),
                MetricSample("2024-01-01T12:00:00Z", 75, 3500, 1.0, 220.0, 5, 36.7)
            )
            val summary = calculator.summarize("2024-01-01", samples)
            assertEquals(72.5, summary.averageHeartRate, "average heart rate")
            assertEquals(5500, summary.totalSteps, "total steps")
            assertEquals(3.0, summary.sleepHours, "sleep hours")
        },
        TestCase("trend stable") {
            val calculator = StatisticsCalculator()
            val current = calculator.summarize(
                "2024-01-02",
                listOf(MetricSample("2024-01-02T08:00:00Z", 70, 5000, 7.0, 200.0, 5, 36.6))
            )
            val baseline = calculator.summarize(
                "2024-01-01",
                listOf(MetricSample("2024-01-01T08:00:00Z", 70, 5000, 7.0, 200.0, 5, 36.6))
            )
            val trend = calculator.trend(current, baseline)
            assertEquals("stable", trend.trendLabel, "trend label")
        }
    )
}
