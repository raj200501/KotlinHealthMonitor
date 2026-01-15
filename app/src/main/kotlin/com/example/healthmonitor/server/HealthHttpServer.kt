package com.example.healthmonitor.server

import com.example.healthmonitor.model.*
import com.example.healthmonitor.service.HealthMonitorService
import com.example.healthmonitor.util.JsonCodec
import com.example.healthmonitor.util.Logger
import com.example.healthmonitor.util.SampleData
import java.io.OutputStream
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer

class HealthHttpServer(
    private val port: Int,
    private val service: HealthMonitorService,
    private val logger: Logger,
    private val startedAt: Instant = Instant.now()
) {
    private val server: HttpServer = HttpServer.create(InetSocketAddress(port), 0)

    fun start() {
        registerRoutes()
        server.executor = null
        server.start()
        logger.info { "Health Monitor server started on port $port" }
    }

    fun stop(delaySeconds: Int = 0) {
        server.stop(delaySeconds)
        logger.info { "Health Monitor server stopped" }
    }

    private fun registerRoutes() {
        server.createContext("/health", handler { exchange ->
            if (exchange.requestMethod != "GET") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use GET")))
                return@handler
            }
            val uptime = Duration.between(startedAt, Instant.now()).seconds
            val response = HealthStatusResponse("ok", uptime, "1.0.0")
            exchange.respond(200, JsonCodec.encodeHealthStatus(response))
        })

        server.createContext("/metrics", handler { exchange ->
            when (exchange.requestMethod) {
                "GET" -> handleGetSummary(exchange)
                "POST" -> handlePostMetric(exchange)
                else -> exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use GET or POST")))
            }
        })

        server.createContext("/snapshot", handler { exchange ->
            if (exchange.requestMethod != "GET") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use GET")))
                return@handler
            }
            val userId = exchange.queryParam("userId")
            if (userId == null) {
                exchange.respond(400, JsonCodec.encodeError(ErrorResponse("missing_user", "userId is required")))
                return@handler
            }
            val snapshot = service.buildSnapshot(userId)
            exchange.respond(200, JsonCodec.encodeHealthSnapshot(snapshot))
        })

        server.createContext("/scorecard", handler { exchange ->
            if (exchange.requestMethod != "GET") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use GET")))
                return@handler
            }
            val userId = exchange.queryParam("userId")
            if (userId == null) {
                exchange.respond(400, JsonCodec.encodeError(ErrorResponse("missing_user", "userId is required")))
                return@handler
            }
            val scorecard = service.scorecard(userId)
            exchange.respond(200, JsonCodec.encodeScorecard(scorecard))
        })

        server.createContext("/report", handler { exchange ->
            if (exchange.requestMethod != "POST") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use POST")))
                return@handler
            }
            val filter = JsonCodec.decodeReportFilter(exchange.readBody())
            val summaries = service
                .summary(filter.userId)
                .summary
                .let { listOf(it) }
            val report = MetricReport(filter.userId, filter.startDate, filter.endDate, summaries)
            exchange.respond(200, JsonCodec.encodeMetricReport(report))
        })

        server.createContext("/system", handler { exchange ->
            if (exchange.requestMethod != "GET") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use GET")))
                return@handler
            }
            exchange.respond(200, JsonCodec.encodeSystemReport(service.systemReport()))
        })

        server.createContext("/seed", handler { exchange ->
            if (exchange.requestMethod != "POST") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use POST")))
                return@handler
            }
            val userId = JsonCodec.decodeSeedRequest(exchange.readBody())
            SeedDataSeeder(service).seed(userId)
            exchange.respond(200, "{\"seeded\":true,\"userId\":\"$userId\"}")
        })

        server.createContext("/summary", handler { exchange ->
            if (exchange.requestMethod != "POST") {
                exchange.respond(405, JsonCodec.encodeError(ErrorResponse("method_not_allowed", "Use POST")))
                return@handler
            }
            val (userId, date) = JsonCodec.decodeSummaryRequest(exchange.readBody())
            val summary = service.updateDailySummary(userId, LocalDate.parse(date))
            exchange.respond(200, JsonCodec.encodeDailySummary(summary))
        })
    }

    private fun handleGetSummary(exchange: HttpExchange) {
        val userId = exchange.queryParam("userId")
        if (userId == null) {
            exchange.respond(400, JsonCodec.encodeError(ErrorResponse("missing_user", "userId is required")))
            return
        }
        val summary = service.summary(userId)
        exchange.respond(200, JsonCodec.encodeUserSummary(summary))
    }

    private fun handlePostMetric(exchange: HttpExchange) {
        val request = JsonCodec.decodeHealthMetricRequest(exchange.readBody())
        val validation = service.validate(request)
        if (!validation.valid) {
            exchange.respond(422, JsonCodec.encodeError(ErrorResponse("validation_failed", validation.issues.joinToString("; "))))
            return
        }
        val response = service.ingest(request)
        val date = LocalDate.parse(request.timestamp.substring(0, 10))
        service.updateDailySummary(request.userId, date)
        exchange.respond(201, JsonCodec.encodeMetricIngestResponse(response))
    }

    private fun handler(block: (HttpExchange) -> Unit): HttpHandler = HttpHandler { exchange ->
        try {
            block(exchange)
        } catch (ex: IllegalArgumentException) {
            exchange.respond(400, JsonCodec.encodeError(ErrorResponse("bad_request", ex.message)))
        } catch (ex: Exception) {
            logger.error { "Request failed: ${ex.message}" }
            exchange.respond(500, JsonCodec.encodeError(ErrorResponse("server_error", "Unexpected error")))
        }
    }

    private fun HttpExchange.readBody(): String =
        requestBody.bufferedReader(StandardCharsets.UTF_8).use { it.readText() }

    private fun HttpExchange.respond(status: Int, payload: String) {
        val bytes = payload.toByteArray(StandardCharsets.UTF_8)
        responseHeaders.add("Content-Type", "application/json")
        sendResponseHeaders(status, bytes.size.toLong())
        responseBody.use { it.write(bytes) }
    }

    private fun HttpExchange.queryParam(name: String): String? {
        val query = requestURI.query ?: return null
        return query.split("&")
            .mapNotNull { part ->
                val pieces = part.split("=")
                if (pieces.size == 2 && pieces[0] == name) pieces[1] else null
            }
            .firstOrNull()
    }
}

class SeedDataSeeder(private val service: HealthMonitorService) {
    fun seed(userId: String) {
        val profiles = SampleProfiles.profiles()
        val profile = profiles.firstOrNull { it.id == userId } ?: profiles.first()
        service.ensureProfile(profile)
        SampleData.samplesFor(userId).forEach { request ->
            service.ingest(request)
            val date = LocalDate.parse(request.timestamp.substring(0, 10))
            service.updateDailySummary(userId, date)
        }
    }
}

object SampleProfiles {
    fun profiles(): List<UserProfile> = listOf(
        UserProfile(
            id = "athena",
            displayName = "Athena Park",
            age = 32,
            heightCm = 168.0,
            weightKg = 62.0,
            targetSteps = 10000,
            targetSleepHours = 7.5,
            restingHeartRate = 62
        ),
        UserProfile(
            id = "leo",
            displayName = "Leo Chen",
            age = 41,
            heightCm = 178.0,
            weightKg = 78.0,
            targetSteps = 9000,
            targetSleepHours = 7.0,
            restingHeartRate = 65
        )
    )
}
