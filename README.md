# Kotlin Health Monitor (JVM Service)

Kotlin Health Monitor is a Kotlin JVM service that ingests wearable-style health metrics, produces daily summaries, and serves real-time analytics over HTTP. The project is intentionally runnable from a clean checkout without Android Studio.

## What it does (README contract)

- **Ingest metrics** via HTTP POST.
- **Serve summaries and recommendations** via HTTP GET.
- **Seed sample data** for quick demos.
- **Persist metrics locally** to a configurable data directory.

## Quickstart (verified)

```sh
./scripts/run.sh
```

By default the service starts on `http://localhost:8080` and seeds sample data.

### Try it

```sh
curl -s http://localhost:8080/health
curl -s "http://localhost:8080/metrics?userId=athena"
```

## API Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | `/health` | Service status and uptime |
| GET | `/metrics?userId=...` | Daily summary + recommendations |
| POST | `/metrics` | Ingest a new metric sample |
| GET | `/snapshot?userId=...` | Full snapshot including latest sample |
| GET | `/scorecard?userId=...` | Rolling health scorecard |
| POST | `/summary` | Recompute a daily summary |
| GET | `/system` | System-wide summary report |
| POST | `/seed` | Seed sample data for a user |

### Example ingest payload

```json
{
  "userId": "athena",
  "timestamp": "2024-01-05T08:00:00Z",
  "heartRate": 72,
  "steps": 1500,
  "sleepHours": 1.2,
  "caloriesBurned": 120.0,
  "stressLevel": 4,
  "bodyTemperatureC": 36.6
}
```

## Configuration

All configuration is done via environment variables (see `.env.example`).

| Variable | Default | Description |
| --- | --- | --- |
| `HEALTH_MONITOR_PORT` | `8080` | Port to bind the HTTP server |
| `HEALTH_MONITOR_DATA_DIR` | `./data` | Directory for persisted metrics |
| `HEALTH_MONITOR_RETENTION_DAYS` | `180` | Retention window for data (reserved for future cleanup) |
| `HEALTH_MONITOR_SEED_SAMPLE` | `true` | Seed sample data on startup |
| `HEALTH_MONITOR_LOG_LEVEL` | `INFO` | Logging level |

## Verification (verified)

```sh
./scripts/verify.sh
```

The verification script:
- Compiles the Kotlin sources using the Kotlin compiler bundled with Gradle.
- Runs unit tests.
- Runs integration tests that start the HTTP server and exercise the `/health` and `/metrics` endpoints.

## Tooling notes

- The scripts use a locally installed Gradle distribution when available.
- If Gradle is not installed, `scripts/bootstrap-gradle.sh` downloads it into `.tooling/gradle`.

## Troubleshooting

- **Gradle not found**: `./scripts/verify.sh` downloads Gradle into `.tooling/gradle` automatically.
- **Port already in use**: set `HEALTH_MONITOR_PORT` to an open port.
- **Data reset**: delete the `data/` directory to clear stored metrics.

## Project layout

- `app/src/main/kotlin`: Kotlin service implementation.
- `app/src/test/kotlin`: unit tests + test runner.
- `app/src/integrationTest/kotlin`: integration/smoke tests.
- `scripts/`: run + verify scripts.
- `.github/workflows/`: CI workflow that runs the same verification.
