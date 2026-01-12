package com.example.healthmonitor.tests.suites

import com.example.healthmonitor.config.LogLevel
import com.example.healthmonitor.model.HealthMetricRequest
import com.example.healthmonitor.server.HealthHttpServer
import com.example.healthmonitor.server.SampleProfiles
import com.example.healthmonitor.service.HealthMonitorService
import com.example.healthmonitor.storage.LocalHealthStore
import com.example.healthmonitor.tests.TestCase
import com.example.healthmonitor.tests.TestSuite
import com.example.healthmonitor.tests.assertContains
import com.example.healthmonitor.tests.assertEquals
import com.example.healthmonitor.tests.deleteTree
import com.example.healthmonitor.util.JsonCodec
import com.example.healthmonitor.util.LoggerFactory
import com.example.healthmonitor.util.SampleData
import com.example.healthmonitor.util.SimpleJsonParser
import java.net.HttpURLConnection
import java.net.ServerSocket
import java.net.URL
import java.nio.file.Files

class IntegrationSuite : TestSuite() {
    override val name: String = "IntegrationSuite"

    override fun tests(): List<TestCase> = listOf(
        TestCase("health endpoint ok") {
            withServer { port, _ ->
                val response = get(port, "/health")
                val payload = SimpleJsonParser(response).parseObject()
                assertEquals("ok", payload["status"], "health status")
            }
        },
        TestCase("metrics endpoint returns summary") {
            withServer { port, _ ->
                val response = get(port, "/metrics?userId=athena")
                val payload = SimpleJsonParser(response).parseObject()
                val user = payload["user"] as Map<*, *>
                assertEquals("athena", user["id"], "user id")
            }
        },
        TestCase("ingest endpoint accepts metrics") {
            withServer { port, _ ->
                val request = HealthMetricRequest(
                    userId = "athena",
                    timestamp = "2024-01-05T08:00:00Z",
                    heartRate = 72,
                    steps = 1500,
                    sleepHours = 1.2,
                    caloriesBurned = 120.0,
                    stressLevel = 4,
                    bodyTemperatureC = 36.6
                )
                val response = post(port, "/metrics", JsonCodec.encodeHealthMetricRequest(request))
                assertContains(response, "stored", "stored response")
            }
        }
    )

    private fun withServer(block: (Int, HealthHttpServer) -> Unit) {
        val dir = Files.createTempDirectory("health-http")
        val port = findFreePort()
        val store = LocalHealthStore(dir)
        val service = HealthMonitorService(store)
        SampleProfiles.profiles().forEach { service.ensureProfile(it) }
        SampleData.samplesFor("athena").take(5).forEach { service.ingest(it) }
        val logger = LoggerFactory.getLogger("integration", LogLevel.ERROR)
        val server = HealthHttpServer(port, service, logger)
        server.start()
        try {
            block(port, server)
        } finally {
            server.stop(0)
            deleteTree(dir)
        }
    }

    private fun get(port: Int, path: String): String {
        val connection = URL("http://localhost:$port$path").openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        return connection.inputStream.bufferedReader().use { it.readText() }
    }

    private fun post(port: Int, path: String, body: String): String {
        val connection = URL("http://localhost:$port$path").openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/json")
        connection.outputStream.use { it.write(body.toByteArray()) }
        return connection.inputStream.bufferedReader().use { it.readText() }
    }

    private fun findFreePort(): Int {
        ServerSocket(0).use { return it.localPort }
    }
}
