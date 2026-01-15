package com.example.healthmonitor.tests

class AssertionFailure(message: String) : RuntimeException(message)

fun assertThat(condition: Boolean, message: String) {
    if (!condition) throw AssertionFailure(message)
}

fun <T> assertEquals(expected: T, actual: T, message: String) {
    if (expected != actual) {
        throw AssertionFailure("$message. Expected=$expected Actual=$actual")
    }
}

fun assertContains(haystack: String, needle: String, message: String) {
    if (!haystack.contains(needle)) {
        throw AssertionFailure("$message. Missing '$needle'")
    }
}
