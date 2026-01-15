package com.example.healthmonitor.tests.suites

import com.example.healthmonitor.model.DailySummary
import com.example.healthmonitor.model.MetricSample
import com.example.healthmonitor.model.UserProfile
import com.example.healthmonitor.storage.LocalHealthStore
import com.example.healthmonitor.tests.TestCase
import com.example.healthmonitor.tests.TestSuite
import com.example.healthmonitor.tests.assertEquals
import com.example.healthmonitor.tests.deleteTree
import java.nio.file.Files
import java.nio.file.Path
import java.time.LocalDate

class LocalHealthStoreSuite : TestSuite() {
    override val name: String = "LocalHealthStoreSuite"

    override fun tests(): List<TestCase> = listOf(
        TestCase("stores and loads profile") {
            withTempDir { dir ->
                val store = LocalHealthStore(dir)
                val profile = UserProfile("athena", "Athena", 30, 165.0, 60.0, 10000, 7.5, 62)
                store.saveProfile(profile)
                val loaded = store.loadProfile("athena")
                assertEquals(profile, loaded, "profile round-trip")
            }
        },
        TestCase("stores samples and summaries") {
            withTempDir { dir ->
                val store = LocalHealthStore(dir)
                val sample = MetricSample("2024-01-01T08:00:00Z", 70, 1200, 2.0, 180.0, 3, 36.5)
                store.appendSample("athena", sample)
                assertEquals(listOf(sample), store.loadSamples("athena"), "sample round-trip")

                val summary = DailySummary("2024-01-01", 70.0, 1200, 2.0, 180.0, 3.0, 36.5)
                store.saveSummary("athena", LocalDate.parse("2024-01-01"), summary)
                assertEquals(summary, store.loadSummary("athena", LocalDate.parse("2024-01-01")), "summary round-trip")
            }
        }
    )

    private fun withTempDir(block: (Path) -> Unit) {
        val dir = Files.createTempDirectory("health-store")
        try {
            block(dir)
        } finally {
            deleteTree(dir)
        }
    }
}
