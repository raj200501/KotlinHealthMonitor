package com.example.healthmonitor.tests

abstract class TestSuite {
    abstract val name: String
    abstract fun tests(): List<TestCase>

    fun run(): List<TestResult> {
        return tests().map { test ->
            try {
                test.block()
                TestResult("${name}.${test.name}", true, null)
            } catch (ex: Exception) {
                TestResult("${name}.${test.name}", false, ex.message ?: ex.javaClass.simpleName)
            }
        }
    }
}

data class TestCase(val name: String, val block: () -> Unit)

data class TestResult(val name: String, val passed: Boolean, val message: String?)
