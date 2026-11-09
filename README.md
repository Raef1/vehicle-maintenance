# CSI 3370: Java CI/CD demonstration

This project illustrates a Java Maven build, JUnit 5 tests, a GitHub Actions CI pipeline, and publishing a tested executable JAR to GitHub Releases.

## Requirements
- Java 17+
- Maven 3.8+
- Git and a GitHub account

## Run locally
```powershell
mvn clean test
mvn package
java -jar target/vehicle-maintenance-1.0.0.jar
```
Expected output: `Maintenance cost: $100.0`.

## Create the one GitHub repository
1. Create an **empty** GitHub repository named `vehicle-maintenance` (do not initialize with a README).
2. In this project folder run:
```powershell
git init
git add .
git commit -m "Initial Java CI demo"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/vehicle-maintenance.git
git push -u origin main
```
3. Open **Actions** to watch the tests and release jobs.
4. If GitHub blocks the release, check repository **Settings → Actions → General → Workflow permissions**, and ensure GitHub Actions can create releases. The workflow requests `contents: write` for the release job.
5. Open **Releases**, download `vehicle-maintenance-1.0.0.jar`, and run `java -jar vehicle-maintenance-1.0.0.jar`.

## Classroom demonstration
- **Pass:** Initial implementation passes four tests and creates a GitHub Release.
- **Fail:** Change `0.02` to `0.03` in `MaintenanceCalculator.java`, commit, and push. The gasoline test fails and the release job is skipped.
- **Pass again:** Restore `0.02`, commit, and push. The tests pass and another release is published.

## Deployment terminology
The workflow **publishes/distributes** a JAR through GitHub Releases. It does not deploy a continuously running server application.

## Notes
- A push to `main` publishes a release only when the build and tests pass.
- Pull requests run tests but do not publish releases.
- The workflow has not been executed against your GitHub account by this package creation.
