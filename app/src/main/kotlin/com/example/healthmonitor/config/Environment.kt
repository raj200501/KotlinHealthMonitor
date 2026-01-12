package com.example.healthmonitor.config

/**
 * Abstraction over environment variables to make configuration testable.
 */
interface Environment {
    fun string(key: String, default: String): String
    fun int(key: String, default: Int): Int
    fun long(key: String, default: Long): Long
    fun bool(key: String, default: Boolean): Boolean

    object System : Environment {
        override fun string(key: String, default: String): String =
            java.lang.System.getenv(key)?.takeIf { it.isNotBlank() } ?: default

        override fun int(key: String, default: Int): Int =
            java.lang.System.getenv(key)?.toIntOrNull() ?: default

        override fun long(key: String, default: Long): Long =
            java.lang.System.getenv(key)?.toLongOrNull() ?: default

        override fun bool(key: String, default: Boolean): Boolean =
            java.lang.System.getenv(key)?.trim()?.lowercase()?.let {
                when (it) {
                    "true", "1", "yes", "y" -> true
                    "false", "0", "no", "n" -> false
                    else -> default
                }
            } ?: default
    }
}
