#!/usr/bin/env bash
set -euo pipefail
DIR="$(cd "$(dirname "$0")" && pwd)"
VER="8.9"
DIST="$HOME/.gradle/wrapper/dists/gradle-$VER-bin/gradle-$VER"
if [ ! -x "$DIST/bin/gradle" ]; then
  mkdir -p "$(dirname "$DIST")"
  ZIP="/tmp/gradle-$VER-bin.zip"
  curl -L --retry 3 -o "$ZIP" "https://services.gradle.org/distributions/gradle-$VER-bin.zip"
  unzip -q "$ZIP" -d "$(dirname "$DIST")"
fi
exec "$DIST/bin/gradle" -p "$DIR" "$@"
