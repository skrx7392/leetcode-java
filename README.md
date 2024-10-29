[![Build and Test](https://github.com/skrx7392/leetcode-java/actions/workflows/gradle.yml/badge.svg)](https://github.com/skrx7392/leetcode-java/actions/workflows/gradle.yml)

# LeetCode Java Solutions

This repository contains Java solutions for a variety of LeetCode problems, organized by categories and supported by tests. Each solution aims to provide clear, efficient code that can be reused for learning and problem-solving.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Clone the Repository](#clone-the-repository)
  - [Build and Test](#build-and-test)
- [GitHub Actions CI/CD](#github-actions-cicd)
- [License](#license)

## Project Structure

The project is organized as follows:
- `src/main/java`: Contains solution classes, each dedicated to a specific LeetCode problem.
- `src/test/java`: Contains JUnit test classes for verifying each solution.

## Prerequisites

- **Java 17** or higher
- **Gradle** (used to build, test, and manage dependencies)

## Getting Started

### Clone the Repository

git clone https://github.com/skrx7392/leetcode-java.git
cd leetcode-java

### Build and Test
To compile the project and run all tests, use Gradle:

`./gradlew build`

To run tests only:

`./gradlew test`

## GitHub Actions CI/CD
This repository includes a GitHub Actions workflow (build.yml) that automatically builds and tests the project on every push and pull request to the main branch. The workflow:

- Checks out the code
- Sets up the Java environment
- Caches Gradle dependencies for faster builds
- Runs ./gradlew build and ./gradlew test to verify the code
- You can view the workflow file under .github/workflows/gradle.yml.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
