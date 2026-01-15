#!/usr/bin/env bash
set -euo pipefail

GRADLE_VERSION="8.6"
ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
TOOLING_DIR="$ROOT_DIR/.tooling/gradle"
GRADLE_HOME="$TOOLING_DIR/gradle-$GRADLE_VERSION"

if [[ -x "$GRADLE_HOME/bin/gradle" ]]; then
  echo "Gradle $GRADLE_VERSION already installed at $GRADLE_HOME"
  exit 0
fi

mkdir -p "$TOOLING_DIR"
ARCHIVE="$TOOLING_DIR/gradle-$GRADLE_VERSION-bin.zip"
PRIMARY_URL="https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip"
FALLBACK_URL="https://downloads.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip"
GITHUB_URL="https://github.com/gradle/gradle-distributions/releases/download/v${GRADLE_VERSION}.0/gradle-${GRADLE_VERSION}-bin.zip"

echo "Downloading Gradle $GRADLE_VERSION..."
if command -v curl >/dev/null 2>&1; then
  if ! curl -fsSL -H "User-Agent: kotlin-health-monitor" "$PRIMARY_URL" -o "$ARCHIVE"; then
    echo "Primary download failed, trying fallback URL..."
    if ! curl -fsSL -H "User-Agent: kotlin-health-monitor" "$FALLBACK_URL" -o "$ARCHIVE"; then
      echo "Fallback download failed, trying GitHub release URL..."
      curl -fsSL -H "User-Agent: kotlin-health-monitor" -L "$GITHUB_URL" -o "$ARCHIVE"
    fi
  fi
else
  echo "curl is required to download Gradle" >&2
  exit 1
fi

echo "Extracting Gradle..."
if command -v unzip >/dev/null 2>&1; then
  unzip -q "$ARCHIVE" -d "$TOOLING_DIR"
else
  echo "unzip is required to extract Gradle" >&2
  exit 1
fi

rm -f "$ARCHIVE"

echo "Gradle ready at $GRADLE_HOME"
