package com.example.healthmonitor.tests

import com.example.healthmonitor.tests.suites.AppConfigSuite
import com.example.healthmonitor.tests.suites.IntegrationSuite
import com.example.healthmonitor.tests.suites.LocalHealthStoreSuite
import com.example.healthmonitor.tests.suites.StatisticsSuite

fun main() {
    val suites = listOf(
        AppConfigSuite(),
        StatisticsSuite(),
        LocalHealthStoreSuite(),
        IntegrationSuite()
    )

    val results = suites.flatMap { it.run() }
    val failed = results.filterNot { it.passed }

    println("Executed ${results.size} tests")
    failed.forEach { println("FAILED: ${it.name} -> ${it.message}") }

    if (failed.isNotEmpty()) {
        throw IllegalStateException("${failed.size} tests failed")
    }
}
