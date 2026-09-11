# Binary Search Trees

Assignment by Todd Dole for CSCI-3323 at Hardin-Simmons University.

In this assignment, you will implement `BinarySearchTree`. Search for `TODO` comments in `src/main/java/edu/hsutx/BinarySearchTree.java` and complete the methods. JUnit 5 tests are provided in `src/test/java/edu/hsutx/BinarySearchTreeTest.java`.

`BibleTree` uses your tree to store Bible verses, with one verse per node.

## Getting started

This assignment is in the `binary-search-tree/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c binary-search-tree
```

Do not complete the assignment directly on `main`.

## Build and test

From the repository root:

```bash
./gradlew :binary-search-tree:test
./gradlew :binary-search-tree:build
```

In Windows PowerShell:

```powershell
.\gradlew.bat :binary-search-tree:test
.\gradlew.bat :binary-search-tree:build
```

To run just the assignment's test class:

```bash
./gradlew :binary-search-tree:test --tests edu.hsutx.BinarySearchTreeTest
```

The starter implementation is incomplete, so assertion failures are expected until you complete the TODOs. Continue until all tests pass. The `build` task compiles, tests, and packages this assignment.

## Run the applications

The project includes two applications. From the repository root:

```bash
./gradlew :binary-search-tree:runVerseLookup
./gradlew :binary-search-tree:runPrintTheBible
```

In Windows PowerShell:

```powershell
.\gradlew.bat :binary-search-tree:runVerseLookup
.\gradlew.bat :binary-search-tree:runPrintTheBible
```

`runVerseLookup` accepts a scripture reference from standard input and displays the verse text. The standard `:binary-search-tree:run` task also starts this application.

`runPrintTheBible` recursively visits the tree and prints the entire Bible in verse order.

These Gradle tasks use `binary-search-tree/` as their working directory to find `data/reordered_geneva.txt`. When running `VerseLookup` or `PrintTheBible` directly in IntelliJ IDEA, set the run configuration's working directory to the repository's `binary-search-tree` directory. Reload the root Gradle project after pulling the new assignment so IntelliJ discovers the module.

The applications depend on your completed tree implementation to produce correct results.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add binary-search-tree
git commit -m "Implement binary search tree operations"
git push -u origin binary-search-tree
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- You completed all required TODOs in `BinarySearchTree.java`, including documentation.
- All `BinarySearchTreeTest` tests pass.
- `./gradlew :binary-search-tree:build` completes successfully.
- You ran both applications and verified their output.
- Your work is committed to the `binary-search-tree` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your Pull Request.

## A note on the translation

This project uses the Geneva Bible, a public-domain translation produced in 1599. This translation was brought to America on the Mayflower and widely used by the Pilgrims and early Protestant settlers.

The data directory includes:

- `geneva.txt`: the original text, one verse per line.
- `reordered_geneva.txt`: verses reordered to produce a balanced tree when inserted.
- `reorder.py`: the Python script used to produce the reordered text.
