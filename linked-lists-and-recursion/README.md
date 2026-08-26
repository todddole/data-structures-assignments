# Linked Lists and Recursion: Growing Degree Days

## Overview

In this assignment, you will complete a small Java application that calculates the day on which certain growing-degree-day heat thresholds were reached.

The assignment will give you practice with:

- Recursion
- Linked lists
- Reading and understanding existing Java code
- Completing partially implemented methods
- Using unit tests to check your work
- Building and testing a Gradle project

Starter code has already been provided. **Search the source files for `TODO` comments to find the portions of the program you need to complete.**

---

## Growing Degree Days

A **Growing Degree Day (GDD)** is a measure of accumulated heat used to estimate plant growth and development.

For a given day:

```text
GDD = average daily temperature - crop-specific base temperature
```

For example, suppose we use a base temperature of 51°F for grapes.

On August 1, 2023, the average daily temperature in Abilene was 91.9°F:

```text
91.9 - 51 = 40.9 GDD
```

### Cumulative Growing Degree Days

**Cumulative Growing Degree Days (CGDD)** are the sum of the Growing Degree Days accumulated throughout the year.

CGDD cannot fall below zero. Plants cannot "ungrow"; sufficiently cold temperatures simply stop the accumulation of growing degree days.

The supplied weather data contains daily temperature information for Abilene, Texas, during 2023.

---

# Getting Started

This assignment is located in:

```text
linked-lists-and-recursion/
```

within your `data-structures-assignments` repository.

Before beginning, make sure you have updated your `main` branch with the latest starter code from the course repository.

From the root of your `data-structures-assignments` repository:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
```

Then create a new branch for this assignment:

```bash
git switch -c linked-lists-and-recursion
```

**Do not complete the assignment directly on `main`.**

---

# Project Structure

The important files for this assignment are under:

```text
linked-lists-and-recursion/
├── build.gradle.kts
├── data/
│   └── Abilene-2023-Weather.csv
└── src/
    ├── main/
    │   └── java/
    │       └── edu/
    │           └── hsutx/
    │               ├── CircularLL.java
    │               ├── GrowingDays.java
    │               └── Main.java
    └── test/
        └── java/
            └── edu/
                └── hsutx/
                    ├── CircularLLTest.java
                    └── GrowingDaysTest.java
```

You should read through the supplied code before beginning your implementation.

Look specifically for comments containing:

```java
// TODO
```

These identify portions of the starter code that you are expected to complete.

---

# Step 1 — Complete `GrowingDays.java`

Open:

```text
linked-lists-and-recursion/src/main/java/edu/hsutx/GrowingDays.java
```

Find each `TODO` and complete the required code.

Your implementation should pass the tests in:

```text
GrowingDaysTest.java
```

From the **root of the semester repository**, run:

```bash
./gradlew :linked-lists-and-recursion:test --tests edu.hsutx.GrowingDaysTest
```

On Windows, if you are using Command Prompt or PowerShell, you may instead need:

```text
gradlew.bat :linked-lists-and-recursion:test --tests edu.hsutx.GrowingDaysTest
```

Continue working until all `GrowingDaysTest` tests pass.

---

# Step 2 — Complete `CircularLL.java`

Open:

```text
linked-lists-and-recursion/src/main/java/edu/hsutx/CircularLL.java
```

Find each `TODO` and complete the required code.

Your implementation should pass the tests in:

```text
CircularLLTest.java
```

Run:

```bash
./gradlew :linked-lists-and-recursion:test --tests edu.hsutx.CircularLLTest
```

Continue working until all `CircularLLTest` tests pass.

---

# Step 3 — Build and Test the Entire Assignment

Once both portions are working, build the entire assignment:

```bash
./gradlew :linked-lists-and-recursion:build
```

This will compile the assignment and run its test suite.

Make sure the build completes successfully before submitting your final work.

You may also run the Gradle tasks and tests using IntelliJ's built-in Gradle and JUnit functionality.

---

# Step 4 — Run the Program

Run the `Main` class from IntelliJ IDEA.

Test the completed application and confirm that it produces the expected results.

For example, for the input:

```text
2000
```

the correct result should indicate:

```text
172
Wednesday
```

**Note:** Run `Main` directly through IntelliJ rather than through a Gradle task. The program expects interactive standard input.

---

# Committing Your Work

Commit your work regularly as you complete meaningful portions of the assignment.

For example:

```bash
git status
git add .
git commit -m "Implement growing degree day calculations"
git push -u origin linked-lists-and-recursion
```

After the first push, subsequent changes can normally be pushed with:

```bash
git push
```

Do not wait until the assignment is completely finished to make your first commit.

---

# Before Submitting

Make sure that:

- [ ] You completed all required `TODO` sections in `GrowingDays.java`.
- [ ] All `GrowingDaysTest` tests pass.
- [ ] You completed all required `TODO` sections in `CircularLL.java`.
- [ ] All `CircularLLTest` tests pass.
- [ ] `./gradlew :linked-lists-and-recursion:build` completes successfully.
- [ ] You ran `Main` and verified that the application works.
- [ ] Your work has been committed to the `linked-lists-and-recursion` branch.
- [ ] Your latest commits have been pushed to your GitHub repository.

Follow the course submission instructions for creating and submitting your Pull Request.