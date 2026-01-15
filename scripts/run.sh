#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

if [[ -x "/root/.local/share/mise/installs/java/21.0.2/bin/java" ]]; then
  export JAVA_HOME="/root/.local/share/mise/installs/java/21.0.2"
  JAVA_BIN="$JAVA_HOME/bin/java"
elif [[ -x "/usr/lib/jvm/java-21-openjdk-amd64/bin/java" ]]; then
  export JAVA_HOME="/usr/lib/jvm/java-21-openjdk-amd64"
  JAVA_BIN="$JAVA_HOME/bin/java"
elif [[ -n "${JAVA_HOME:-}" && -x "$JAVA_HOME/bin/java" ]]; then
  JAVA_BIN="$JAVA_HOME/bin/java"
else
  JAVA_BIN="java"
fi

export HEALTH_MONITOR_PORT="${HEALTH_MONITOR_PORT:-8080}"
export HEALTH_MONITOR_DATA_DIR="${HEALTH_MONITOR_DATA_DIR:-$ROOT_DIR/data}"
export HEALTH_MONITOR_SEED_SAMPLE="${HEALTH_MONITOR_SEED_SAMPLE:-true}"
export HEALTH_MONITOR_LOG_LEVEL="${HEALTH_MONITOR_LOG_LEVEL:-INFO}"

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
CLASSPATH="$MAIN_OUT:$KOTLIN_STDLIB_JAR:$KOTLIN_REFLECT_JAR"

"$JAVA_BIN" -cp "$CLASSPATH" com.example.healthmonitor.MainKt server
