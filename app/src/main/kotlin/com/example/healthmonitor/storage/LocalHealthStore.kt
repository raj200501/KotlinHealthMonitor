package com.example.healthmonitor.storage

import com.example.healthmonitor.model.DailySummary
import com.example.healthmonitor.model.MetricSample
import com.example.healthmonitor.model.UserProfile
import com.example.healthmonitor.util.JsonCodec
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.time.LocalDate

class LocalHealthStore(private val baseDir: Path) {

    init {
        Files.createDirectories(baseDir)
        Files.createDirectories(profileDir())
        Files.createDirectories(samplesDir())
        Files.createDirectories(summaryDir())
    }

    fun saveProfile(profile: UserProfile) {
        val path = profilePath(profile.id)
        Files.writeString(path, JsonCodec.encodeUserProfile(profile))
    }

    fun loadProfile(userId: String): UserProfile? {
        val path = profilePath(userId)
        return if (Files.exists(path)) {
            JsonCodec.decodeUserProfile(Files.readString(path))
        } else {
            null
        }
    }

    fun appendSample(userId: String, sample: MetricSample) {
        val path = samplePath(userId)
        Files.writeString(
            path,
            JsonCodec.encodeMetricSample(sample) + "\n",
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND
        )
    }

    fun loadSamples(userId: String): List<MetricSample> {
        val path = samplePath(userId)
        if (!Files.exists(path)) return emptyList()
        return Files.readAllLines(path)
            .filter { it.isNotBlank() }
            .map { JsonCodec.decodeMetricSample(it) }
    }

    fun saveSummary(userId: String, date: LocalDate, summary: DailySummary) {
        val path = summaryPath(userId, date)
        Files.writeString(path, JsonCodec.encodeDailySummary(summary))
    }

    fun loadSummary(userId: String, date: LocalDate): DailySummary? {
        val path = summaryPath(userId, date)
        return if (Files.exists(path)) {
            JsonCodec.decodeDailySummary(Files.readString(path))
        } else {
            null
        }
    }

    fun loadSummaries(userId: String): List<DailySummary> {
        val dir = summaryDir().resolve(userId)
        if (!Files.exists(dir)) return emptyList()
        return Files.list(dir)
            .filter { it.toString().endsWith(".json") }
            .map { JsonCodec.decodeDailySummary(Files.readString(it)) }
            .toList()
    }

    fun loadProfiles(): List<UserProfile> {
        if (!Files.exists(profileDir())) return emptyList()
        return Files.list(profileDir())
            .filter { it.toString().endsWith(".json") }
            .map { JsonCodec.decodeUserProfile(Files.readString(it)) }
            .toList()
    }

    private fun profileDir(): Path = baseDir.resolve("profiles")
    private fun samplesDir(): Path = baseDir.resolve("samples")
    private fun summaryDir(): Path = baseDir.resolve("summaries")

    private fun profilePath(userId: String): Path = profileDir().resolve("$userId.json")
    private fun samplePath(userId: String): Path = samplesDir().resolve("$userId.jsonl")
    private fun summaryPath(userId: String, date: LocalDate): Path =
        summaryDir().resolve(userId).also { Files.createDirectories(it) }.resolve("$date.json")
}
