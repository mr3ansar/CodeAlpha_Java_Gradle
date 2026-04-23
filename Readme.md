# CodeAlpha Java Gradle Project

A Java application built as part of the CodeAlpha DevOps Internship — Task 3.
This project demonstrates automated builds, dependency management, unit testing,
and CI/CD integration using Gradle and GitHub Actions.

---

## What this project does

- Performs basic arithmetic operations (add, subtract, multiply, divide)
- Built and managed entirely using Gradle as the build tool
- Includes a full unit test suite using JUnit Jupiter
- Automatically builds and tests on every push via GitHub Actions CI/CD pipeline

---

## Project Structure

```
CodeAlpha_Java_Gradle/
├── app/
│   ├── build.gradle               ← dependencies & build configuration
│   └── src/
│       ├── main/java/com/codealpha/
│       │   ├── App.java           ← main application entry point
│       │   └── Calculator.java    ← core logic
│       └── test/java/com/codealpha/
│           └── AppTest.java       ← unit tests
├── .github/workflows/
│   └── gradle-ci.yml              ← GitHub Actions CI/CD pipeline
├── gradlew                        ← Gradle wrapper (Mac/Linux)
├── gradlew.bat                    ← Gradle wrapper (Windows)
└── settings.gradle
```

---

## Prerequisites

| Requirement | Version |
|---|---|
| Java JDK | 17+ |
| Gradle | 9.4.1+ |
| Git | Latest |
| IntelliJ IDEA | Community Edition |

---

## How to build and run

**1. Clone the repository**
```
git clone https://github.com/YOUR_USERNAME/CodeAlpha_Java_Gradle.git
cd CodeAlpha_Java_Gradle
```

**2. Build the project**
```
gradlew.bat build        (Windows)
./gradlew build          (Mac/Linux)
```

**3. Run the application**
```
gradlew.bat run          (Windows)
./gradlew run            (Mac/Linux)
```

**4. Run the tests**
```
gradlew.bat test         (Windows)
./gradlew test           (Mac/Linux)
```

**5. See all available Gradle tasks**
```
gradlew.bat tasks        (Windows)
./gradlew tasks          (Mac/Linux)
```

---

## Expected output

Running the application produces:

```
=== CodeAlpha Java App — Built with Gradle ===
Addition:       5 + 3  = 8
Subtraction:   10 - 4  = 6
Multiplication: 3 * 5  = 15
Division:       9 / 2  = 4.5
=============================================
```

---

## Test results

Running the test suite produces:

```
AppTest > testAdd() PASSED
AppTest > testSubtract() PASSED
AppTest > testMultiply() PASSED
AppTest > testDivide() PASSED
AppTest > testDivideByZero() PASSED

5 tests completed, 0 failed

BUILD SUCCESSFUL
```

The full HTML test report is generated at:
```
app/build/reports/tests/test/index.html
```

---

## CI/CD Pipeline

This project uses GitHub Actions for continuous integration.
On every push to the `main` branch the pipeline automatically:

1. Checks out the code
2. Sets up Java 17 on the runner
3. Caches Gradle dependencies for faster builds
4. Grants execute permission to the Gradle wrapper
5. Builds the project using Gradle
6. Runs all unit tests
7. Uploads the test report as a downloadable artifact

Pipeline status: ![CI](https://github.com/YOUR_USERNAME/CodeAlpha_Java_Gradle/actions/workflows/gradle-ci.yml/badge.svg)

---

## Dependencies

Managed via `app/build.gradle`:

| Library | Version | Purpose |
|---|---|---|
| JUnit Jupiter | 5.10.0 | Unit testing framework |
| JUnit Platform Launcher | Latest | Test runner |

All dependencies are downloaded automatically from Maven Central on first build.

---

## Key Gradle commands explained

| Command | What it does |
|---|---|
| `./gradlew build` | Compiles code and runs tests |
| `./gradlew run` | Runs the application |
| `./gradlew test` | Runs only the unit tests |
| `./gradlew clean` | Deletes the build folder |
| `./gradlew tasks` | Lists all available tasks |
| `./gradlew dependencies` | Shows full dependency tree |

---

## Tech Stack

| Tool | Purpose |
|---|---|
| Java 17 | Programming language |
| Gradle 9.4.1 | Build automation & dependency management |
| JUnit Jupiter | Unit testing framework |
| GitHub Actions | CI/CD pipeline |
| IntelliJ IDEA | IDE |

---

## DevOps concepts demonstrated

- **Build Automation** — Gradle automates compilation, testing and packaging
- **Dependency Management** — External libraries declared and resolved automatically
- **Unit Testing** — All business logic covered by automated tests
- **Continuous Integration** — Every push triggers an automated build and test run
- **Continuous Delivery** — Artifacts uploaded and available after every successful run
- **Infrastructure as Code** — Pipeline defined in a YAML file inside the repo

---

## Author

Internship at **CodeAlpha** — DevOps Track

- GitHub: [mr3ansar](https://github.com/mr3ansar)
- Internship: CodeAlpha

---

*This project was completed as part of the CodeAlpha DevOps Internship Program.*
