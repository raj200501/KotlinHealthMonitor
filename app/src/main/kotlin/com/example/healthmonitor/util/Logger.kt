package com.example.healthmonitor.util

import com.example.healthmonitor.config.LogLevel
import java.time.Instant

class Logger(private val name: String, private val level: LogLevel) {
    fun trace(message: () -> String) = log(LogLevel.TRACE, message)
    fun debug(message: () -> String) = log(LogLevel.DEBUG, message)
    fun info(message: () -> String) = log(LogLevel.INFO, message)
    fun warn(message: () -> String) = log(LogLevel.WARN, message)
    fun error(message: () -> String) = log(LogLevel.ERROR, message)

    private fun log(eventLevel: LogLevel, message: () -> String) {
        if (eventLevel.ordinal < level.ordinal) return
        val timestamp = Instant.now().toString()
        println("$timestamp [$eventLevel] $name - ${message()}")
    }
}

object LoggerFactory {
    fun getLogger(name: String, level: LogLevel): Logger = Logger(name, level)
}
