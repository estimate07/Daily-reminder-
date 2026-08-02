# ROVIO DAILY 3

ROVIO DAILY 3 is an offline-first Android APK built with Kotlin, Jetpack Compose, Material 3, Room, DataStore, WorkManager, MVVM, and StateFlow.

## What it does
- Tracks three YouTube Shorts per day: morning, afternoon, evening.
- First tap secretly arms a hidden one-hour timer and moves the slot to DOING.
- Confirming requires a long press on the status button; attempts before one hour are recorded as rush attempts.
- A 15-minute cooldown prevents stacking multiple slots too quickly.
- TIME VAULT shows live hidden timer state, rush attempts, cooldown locks, and deep-work totals.
- AUDIT shows a weekly legitimacy overview.

## Build APK with GitHub Actions
1. Push this project to your empty GitHub repository on `main` or `master`.
2. Open the repository on GitHub.
3. Select the **Actions** tab.
4. Open the latest **Build APK** workflow run.
5. Scroll to **Artifacts**.
6. Download either:
   - `rovio-daily-debug-apk` for `app-debug.apk`
   - `rovio-daily-release-apk` for `app-release-unsigned.apk`

## Install the APK
1. Download the artifact zip from GitHub Actions.
2. Unzip it.
3. Transfer the APK to your Android device.
4. Enable **Install unknown apps** for your file manager or browser.
5. Tap the APK and install.

## Push commands for your empty repository
Replace `<MY_EMPTY_REPO_URL>` with your GitHub repo URL:

```bash
git init
git add .
git commit -m "Initial Rovio Daily 3 with all locks"
git branch -M main
git remote add origin <MY_EMPTY_REPO_URL>
git push -u origin main
```

After the push, GitHub Actions automatically builds the APK and uploads it as an artifact.
