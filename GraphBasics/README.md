# Graph Basics

This is an assignment template for the Hardin-Simmons University CSCI-3323 Data Structures course.

Your assignment is to implement the data storage and methods in `WeightedDirectedGraph` so that all supplied tests pass. Although the search methods do not use edge weights in this assignment, later assignments will reuse this code, so your representation must store each edge's weight.

The graph is directed: an edge from one vertex to another does not automatically create an edge in the opposite direction.

## Getting started

This assignment is in the `GraphBasics/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c graph-basics
```

Do not complete the assignment directly on `main`.

## Implement the graph

Complete the `TODO` comments in `GraphBasics/src/main/java/edu/hsutx/WeightedDirectedGraph.java`. You may use an adjacency list, an adjacency matrix, or both, but your representation must preserve edge weights and direction.

Implement these operations:

- determine whether a directed edge connects two vertices;
- return the weighted adjacency matrix;
- find a path with breadth-first search (BFS); and
- find a path with depth-first search (DFS).

Follow the ordering requirements in the method documentation so that traversals produce reproducible paths. JUnit 5 tests are provided in `GraphBasics/src/test/java/edu/hsutx/WeightedDirectedGraphTest.java`.

## Build and test

Run the assignment tasks from the repository root:

```bash
./gradlew :GraphBasics:test
./gradlew :GraphBasics:build
```

In Windows PowerShell:

```powershell
.\gradlew.bat :GraphBasics:test
.\gradlew.bat :GraphBasics:build
```

To run only the supplied test class:

```bash
./gradlew :GraphBasics:test --tests edu.hsutx.WeightedDirectedGraphTest
```

In Windows PowerShell:

```powershell
.\gradlew.bat :GraphBasics:test --tests edu.hsutx.WeightedDirectedGraphTest
```

The starter implementation is incomplete, so test failures are expected until you finish the TODOs. The `build` task compiles, tests, and packages this assignment. Reload the root Gradle project after pulling the assignment so IntelliJ IDEA discovers the new module.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add GraphBasics
git commit -m "Implement graph basics"
git push -u origin graph-basics
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- you completed every required `TODO` in `WeightedDirectedGraph.java`;
- all `WeightedDirectedGraphTest` tests pass;
- `./gradlew :GraphBasics:build` completes successfully; and
- your work is committed to the `graph-basics` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your pull request.
