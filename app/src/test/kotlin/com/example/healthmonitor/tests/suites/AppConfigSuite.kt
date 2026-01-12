package com.example.healthmonitor.tests.suites

import com.example.healthmonitor.config.AppConfig
import com.example.healthmonitor.config.Environment
import com.example.healthmonitor.tests.TestCase
import com.example.healthmonitor.tests.TestSuite
import com.example.healthmonitor.tests.assertEquals

class AppConfigSuite : TestSuite() {
    override val name: String = "AppConfigSuite"

    override fun tests(): List<TestCase> = listOf(
        TestCase("loads defaults") {
            val config = AppConfig.fromEnv(FakeEnvironment(emptyMap()))
            assertEquals(8080, config.port, "default port")
            assertEquals(180L, config.retentionDays, "default retention")
            assertEquals(true, config.sampleSeedOnStart, "default seed")
        },
        TestCase("reads overrides") {
            val env = FakeEnvironment(
                mapOf(
                    "HEALTH_MONITOR_PORT" to "9090",
                    "HEALTH_MONITOR_DATA_DIR" to "tmp-data",
                    "HEALTH_MONITOR_RETENTION_DAYS" to "365",
                    "HEALTH_MONITOR_SEED_SAMPLE" to "false",
                    "HEALTH_MONITOR_LOG_LEVEL" to "debug"
                )
            )
            val config = AppConfig.fromEnv(env)
            assertEquals(9090, config.port, "override port")
            assertEquals(365L, config.retentionDays, "override retention")
            assertEquals(false, config.sampleSeedOnStart, "override seed")
            assertEquals("DEBUG", config.logLevel.name, "override log level")
        }
    )

    private class FakeEnvironment(private val values: Map<String, String>) : Environment {
        override fun string(key: String, default: String): String = values[key] ?: default
        override fun int(key: String, default: Int): Int = values[key]?.toInt() ?: default
        override fun long(key: String, default: Long): Long = values[key]?.toLong() ?: default
        override fun bool(key: String, default: Boolean): Boolean = values[key]?.toBoolean() ?: default
    }
}
