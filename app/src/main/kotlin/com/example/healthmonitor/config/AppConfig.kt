package com.example.healthmonitor.config

import java.nio.file.Path
import java.nio.file.Paths

/**
 * Configuration for the health monitor service. Values are read from environment variables
 * with sane defaults so the project runs out-of-the-box.
 */
data class AppConfig(
    val port: Int,
    val dataDir: Path,
    val retentionDays: Long,
    val sampleSeedOnStart: Boolean,
    val logLevel: LogLevel
) {
    companion object {
        fun fromEnv(environment: Environment = Environment.System): AppConfig {
            val port = environment.int("HEALTH_MONITOR_PORT", 8080)
            val dataDir = environment.string("HEALTH_MONITOR_DATA_DIR", "data").let { Paths.get(it) }
            val retention = environment.long("HEALTH_MONITOR_RETENTION_DAYS", 180)
            val seed = environment.bool("HEALTH_MONITOR_SEED_SAMPLE", true)
            val logLevel = LogLevel.from(environment.string("HEALTH_MONITOR_LOG_LEVEL", "INFO"))
            return AppConfig(
                port = port,
                dataDir = dataDir,
                retentionDays = retention,
                sampleSeedOnStart = seed,
                logLevel = logLevel
            )
        }
    }
}

enum class LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR;

    companion object {
        fun from(value: String): LogLevel =
            entries.firstOrNull { it.name.equals(value.trim(), ignoreCase = true) } ?: INFO
    }
}
