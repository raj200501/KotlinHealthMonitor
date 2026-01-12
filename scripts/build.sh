#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

if ! command -v gradle >/dev/null 2>&1; then
  "$ROOT_DIR/scripts/bootstrap-gradle.sh" >/dev/null
  GRADLE_BIN="$ROOT_DIR/.tooling/gradle/gradle-8.6/bin/gradle"
else
  GRADLE_BIN="$(command -v gradle)"
fi

GRADLE_HOME="$(cd "$(dirname "$GRADLE_BIN")/.." && pwd)"
LIB_DIR="$GRADLE_HOME/lib"

KOTLIN_COMPILER_JAR=$(ls "$LIB_DIR"/kotlin-compiler-embeddable-*.jar | head -n 1)
KOTLIN_STDLIB_JAR=$(ls "$LIB_DIR"/kotlin-stdlib-*.jar | head -n 1)
KOTLIN_REFLECT_JAR=$(ls "$LIB_DIR"/kotlin-reflect-*.jar | head -n 1)
KOTLIN_SCRIPT_RUNTIME_JAR=$(ls "$LIB_DIR"/kotlin-script-runtime-*.jar | head -n 1)
KOTLIN_COROUTINES_JAR=$(ls "$LIB_DIR"/kotlinx-coroutines-core-jvm-*.jar | head -n 1)
TROVE_JAR=$(ls "$LIB_DIR"/trove4j-*.jar | head -n 1)
ANNOTATIONS_JAR=$(ls "$LIB_DIR"/annotations-*.jar | head -n 1)

CLASSPATH="$KOTLIN_COMPILER_JAR:$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR:$KOTLIN_SCRIPT_RUNTIME_JAR:$KOTLIN_COROUTINES_JAR:$TROVE_JAR:$ANNOTATIONS_JAR"

MAIN_OUT="$ROOT_DIR/build/classes/main"
TEST_OUT="$ROOT_DIR/build/classes/test"
INTEGRATION_OUT="$ROOT_DIR/build/classes/integration"

mkdir -p "$MAIN_OUT" "$TEST_OUT" "$INTEGRATION_OUT"

MAIN_SOURCES=$(find "$ROOT_DIR/app/src/main/kotlin" -name "*.kt")
TEST_SOURCES=$(find "$ROOT_DIR/app/src/test/kotlin" -name "*.kt")
INTEGRATION_SOURCES=$(find "$ROOT_DIR/app/src/integrationTest/kotlin" -name "*.kt" || true)

java -cp "$CLASSPATH" org.jetbrains.kotlin.cli.jvm.K2JVMCompiler \
  -d "$MAIN_OUT" \
  -jvm-target 21 \
  -no-stdlib -no-reflect \
  -classpath "$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR" \
  $MAIN_SOURCES

java -cp "$CLASSPATH" org.jetbrains.kotlin.cli.jvm.K2JVMCompiler \
  -d "$TEST_OUT" \
  -jvm-target 21 \
  -no-stdlib -no-reflect \
  -classpath "$MAIN_OUT:$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR" \
  $TEST_SOURCES

if [[ -n "${INTEGRATION_SOURCES// }" ]]; then
  java -cp "$CLASSPATH" org.jetbrains.kotlin.cli.jvm.K2JVMCompiler \
    -d "$INTEGRATION_OUT" \
    -jvm-target 21 \
    -no-stdlib -no-reflect \
    -classpath "$MAIN_OUT:$TEST_OUT:$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR" \
    $INTEGRATION_SOURCES
fi
