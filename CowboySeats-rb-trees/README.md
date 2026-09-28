# CowboySeats

The scenario: The year is 2050.  The Hardin-Simmons sports teams have so dominated our competition that we are now one of the leading programs in the NCAA.  To accommodate the rising popularity, HSU has built a new stadium/arena with 1 million seats.  Each seat is numbered from 1-1,000,000 and the seats are arranged in a snake order so that each numbered seat is in proximity to the adjacent numbered seats.  

This project will create a seat reservation system.  We will use an implementation of red-black trees to track open/unassigned blocks of seats and assigned blocks, with each block of seats being represented as one node.  For a key, we will use a combination of the block size (in seats) and the starting seat #.

Your job is to implement the red-black tree so that all tests pass and the project works.

## Getting started

Assignment by Todd Dole for CSCI-3323 at Hardin-Simmons University.

This assignment is in the `CowboySeats-rb-trees/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c rb-trees
```

Do not complete the assignment directly on `main`.

## Implement the red-black tree

Read the supplied code, then complete the `TODO` comments in `src/main/java/edu/hsutx/RedBlackTree.java`, including the required method documentation. Paths in this section are relative to `CowboySeats-rb-trees/`.

The required operations include node depth and black depth, insertion, deletion, fix-up procedures, rotations, and searching. JUnit 5 tests are provided in `src/test/java/edu/hsutx/RedBlackTreeTest.java`.

`CowboySeatTree` specializes your tree for seat assignments. `MainApp` starts the Swing visualization, and `ReservationController` processes the supplied `data/reservations.csv` file.

## Build and test

From the repository root:

```bash
./gradlew :CowboySeats-rb-trees:test
./gradlew :CowboySeats-rb-trees:build
```

In Windows PowerShell:

```powershell
.\gradlew.bat :CowboySeats-rb-trees:test
.\gradlew.bat :CowboySeats-rb-trees:build
```

To run just the assignment's test class:

```bash
./gradlew :CowboySeats-rb-trees:test --tests edu.hsutx.RedBlackTreeTest
```

In Windows PowerShell:

```powershell
.\gradlew.bat :CowboySeats-rb-trees:test --tests edu.hsutx.RedBlackTreeTest
```

The starter implementation is incomplete, so test failures are expected until you complete the TODOs. Continue until all tests pass. The `build` task compiles, tests, and packages this assignment.

## Run the application

From the repository root:

```bash
./gradlew :CowboySeats-rb-trees:run
```

In Windows PowerShell:

```powershell
.\gradlew.bat :CowboySeats-rb-trees:run
```

This launches a Swing visualization and processes reservations from `data/reservations.csv`. The application depends on your completed tree implementation to produce correct results. Check that reservation processing updates the seat and tree displays correctly.

The Gradle run task uses `CowboySeats-rb-trees/` as its working directory to find the CSV file. When running `edu.hsutx.MainApp` directly in IntelliJ IDEA, set the run configuration's working directory to the repository's `CowboySeats-rb-trees` directory. Reload the root Gradle project after pulling the new assignment so IntelliJ discovers the module.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add CowboySeats-rb-trees
git commit -m "Implement red-black tree operations"
git push -u origin rb-trees
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- You completed all required TODOs in `RedBlackTree.java`, including documentation.
- All `RedBlackTreeTest` tests pass.
- `./gradlew :CowboySeats-rb-trees:build` completes successfully.
- You ran the application and verified the reservation visualization.
- Your work is committed to the `rb-trees` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your Pull Request.
