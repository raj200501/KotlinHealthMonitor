package com.example.healthmonitor.util

class SimpleJsonParser(private val input: String) {
    private var index = 0

    fun parseObject(): Map<String, Any?> {
        skipWhitespace()
        expect('{')
        skipWhitespace()
        val map = mutableMapOf<String, Any?>()
        if (peek() == '}') {
            index++
            return map
        }
        while (true) {
            skipWhitespace()
            val key = parseString()
            skipWhitespace()
            expect(':')
            skipWhitespace()
            val value = parseValue()
            map[key] = value
            skipWhitespace()
            when (peek()) {
                ',' -> {
                    index++
                    continue
                }
                '}' -> {
                    index++
                    break
                }
                else -> error("Expected , or } at position $index")
            }
        }
        return map
    }

    private fun parseValue(): Any? {
        skipWhitespace()
        return when (val ch = peek()) {
            '"' -> parseString()
            '{' -> parseObject()
            '[' -> parseArray()
            't' -> parseLiteral("true", true)
            'f' -> parseLiteral("false", false)
            'n' -> parseLiteral("null", null)
            else -> if (ch.isDigit() || ch == '-' || ch == '+') parseNumber() else error("Unexpected value at $index")
        }
    }

    private fun parseArray(): List<Any?> {
        expect('[')
        skipWhitespace()
        val list = mutableListOf<Any?>()
        if (peek() == ']') {
            index++
            return list
        }
        while (true) {
            val value = parseValue()
            list += value
            skipWhitespace()
            when (peek()) {
                ',' -> {
                    index++
                    continue
                }
                ']' -> {
                    index++
                    break
                }
                else -> error("Expected , or ] at position $index")
            }
        }
        return list
    }

    private fun parseString(): String {
        expect('"')
        val builder = StringBuilder()
        while (index < input.length) {
            val ch = input[index++]
            when (ch) {
                '"' -> return builder.toString()
                '\\' -> {
                    val escaped = input[index++]
                    builder.append(
                        when (escaped) {
                            '"' -> '"'
                            '\\' -> '\\'
                            '/' -> '/'
                            'b' -> '\b'
                            'f' -> '\u000C'
                            'n' -> '\n'
                            'r' -> '\r'
                            't' -> '\t'
                            'u' -> {
                                val hex = input.substring(index, index + 4)
                                index += 4
                                hex.toInt(16).toChar()
                            }
                            else -> error("Invalid escape at position $index")
                        }
                    )
                }
                else -> builder.append(ch)
            }
        }
        error("Unterminated string")
    }

    private fun parseNumber(): Number {
        val start = index
        while (index < input.length && input[index] !in listOf(',', '}', ']', ' ', '\n', '\r', '\t')) {
            index++
        }
        val token = input.substring(start, index)
        return if (token.contains('.') || token.contains('e', ignoreCase = true)) {
            token.toDouble()
        } else {
            token.toLong()
        }
    }

    private fun parseLiteral(literal: String, value: Any?): Any? {
        if (input.startsWith(literal, index)) {
            index += literal.length
            return value
        }
        error("Expected $literal at position $index")
    }

    private fun skipWhitespace() {
        while (index < input.length && input[index].isWhitespace()) {
            index++
        }
    }

    private fun expect(ch: Char) {
        if (peek() != ch) error("Expected $ch at position $index")
        index++
    }

    private fun peek(): Char {
        if (index >= input.length) error("Unexpected end of input")
        return input[index]
    }
}

object SimpleJsonWriter {
    fun escape(value: String): String {
        val builder = StringBuilder()
        value.forEach { ch ->
            when (ch) {
                '\\' -> builder.append("\\\\")
                '"' -> builder.append("\\\"")
                '\b' -> builder.append("\\b")
                '\n' -> builder.append("\\n")
                '\r' -> builder.append("\\r")
                '\t' -> builder.append("\\t")
                else -> builder.append(ch)
            }
        }
        return builder.toString()
    }

    fun quote(value: String): String = "\"${escape(value)}\""
}
