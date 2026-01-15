#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

if command -v gradle >/dev/null 2>&1; then
  exec gradle -p "$ROOT_DIR" "$@"
fi

"$ROOT_DIR/scripts/bootstrap-gradle.sh" >/dev/null
GRADLE_HOME="$ROOT_DIR/.tooling/gradle/gradle-8.6"
exec "$GRADLE_HOME/bin/gradle" -p "$ROOT_DIR" "$@"
