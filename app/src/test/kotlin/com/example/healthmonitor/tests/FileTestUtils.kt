package com.example.healthmonitor.tests

import java.nio.file.Files
import java.nio.file.Path

fun deleteTree(path: Path) {
    if (!Files.exists(path)) return
    Files.walk(path)
        .sorted(Comparator.reverseOrder())
        .forEach { Files.deleteIfExists(it) }
}
