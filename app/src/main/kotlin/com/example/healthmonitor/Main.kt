package com.example.healthmonitor

import com.example.healthmonitor.config.AppConfig
import com.example.healthmonitor.model.UserProfile
import com.example.healthmonitor.server.HealthHttpServer
import com.example.healthmonitor.server.SampleProfiles
import com.example.healthmonitor.service.HealthMonitorService
import com.example.healthmonitor.storage.LocalHealthStore
import com.example.healthmonitor.util.LoggerFactory
import java.nio.file.Files
import java.time.LocalDate

fun main(args: Array<String>) {
    val config = AppConfig.fromEnv()
    val logger = LoggerFactory.getLogger("Main", config.logLevel)
    Files.createDirectories(config.dataDir)

    val store = LocalHealthStore(config.dataDir)
    val service = HealthMonitorService(store)

    val command = args.firstOrNull() ?: "server"
    when (command) {
        "server" -> {
            if (config.sampleSeedOnStart) {
                seedSampleData(service)
            }
            val server = HealthHttpServer(config.port, service, logger)
            server.start()
        }
        "seed" -> {
            seedSampleData(service)
            logger.info { "Sample data seeded." }
        }
        "summary" -> {
            val userId = args.getOrNull(1) ?: "athena"
            val date = args.getOrNull(2) ?: LocalDate.now().toString()
            val summary = service.updateDailySummary(userId, LocalDate.parse(date))
            logger.info { "Summary for $userId on $date: $summary" }
        }
        else -> {
            logger.error { "Unknown command: $command" }
        }
    }
}

private fun seedSampleData(service: HealthMonitorService) {
    SampleProfiles.profiles().forEach { profile ->
        service.ensureProfile(profile)
    }
    val defaultUser = SampleProfiles.profiles().first()
    val seeder = com.example.healthmonitor.server.SeedDataSeeder(service)
    seeder.seed(defaultUser.id)
}
