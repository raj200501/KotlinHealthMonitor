#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

"$ROOT_DIR/scripts/build.sh"

if ! command -v gradle >/dev/null 2>&1; then
  GRADLE_BIN="$ROOT_DIR/.tooling/gradle/gradle-8.6/bin/gradle"
else
  GRADLE_BIN="$(command -v gradle)"
fi

GRADLE_HOME="$(cd "$(dirname "$GRADLE_BIN")/.." && pwd)"
LIB_DIR="$GRADLE_HOME/lib"
KOTLIN_STDLIB_JAR=$(ls "$LIB_DIR"/kotlin-stdlib-*.jar | head -n 1)
KOTLIN_REFLECT_JAR=$(ls "$LIB_DIR"/kotlin-reflect-*.jar | head -n 1)

MAIN_OUT="$ROOT_DIR/build/classes/main"
TEST_OUT="$ROOT_DIR/build/classes/test"
INTEGRATION_OUT="$ROOT_DIR/build/classes/integration"

CLASSPATH="$MAIN_OUT:$TEST_OUT:$INTEGRATION_OUT:$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR"

java -cp "$CLASSPATH" com.example.healthmonitor.tests.TestRunnerKt
