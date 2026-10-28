# Dijkstra's Robotic Pathfinder

This is an assignment template for the Hardin-Simmons University CSCI-3323 Data Structures course.

In this assignment, you will extend the graph implementation from the Graph Basics assignment to represent a robot's configuration space and use Dijkstra's algorithm to find a shortest path through it.

A configuration space is a grid-based map of coordinates a robot can navigate. The supplied map uses `0` for open space and `1` for blocked space.

## Getting started

This assignment is in the `DijkstrasRoboticPathfinder/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c dijkstras-robotic-pathfinder
```

Do not complete the assignment directly on `main`.

## Implement the pathfinder

The assignment has two parts:

1. Complete the constructor in `DijkstrasRoboticPathfinder/src/main/java/edu/hsutx/CSpaceGraph.java`. Convert each open coordinate in the configuration-space array into a graph vertex and connect it to each adjacent open coordinate. Horizontal and vertical edges have weight `1`; diagonal edges have weight `Math.sqrt(2)`.
2. Implement Dijkstra's algorithm in `DijkstrasRoboticPathfinder/src/main/java/edu/hsutx/WeightedDirectedGraph.java`. The pathfinder must return the shortest path as coordinates using the supplied `Point` class.

Complete the remaining `TODO` comments needed to support these operations. The starter application in `PathFinder.java` loads `data/cspace.csv`, constructs the graph, finds a path, and writes the result to `data/pathfinder_image.jpg` with the path shown in yellow.

The included `WeightedDirectedGraphTest` class exercises the graph operations introduced in the previous assignment. The starter implementation is incomplete, so test failures are expected until those operations work.

## Build and test

Run the assignment tasks from the repository root:

```bash
./gradlew :DijkstrasRoboticPathfinder:test
./gradlew :DijkstrasRoboticPathfinder:build
./gradlew :DijkstrasRoboticPathfinder:run
```

In Windows PowerShell:

```powershell
.\gradlew.bat :DijkstrasRoboticPathfinder:test
.\gradlew.bat :DijkstrasRoboticPathfinder:build
.\gradlew.bat :DijkstrasRoboticPathfinder:run
```

The `run` task uses the assignment directory as its working directory, so it can read and write files in `DijkstrasRoboticPathfinder/data/`. Reload the root Gradle project after pulling the assignment so IntelliJ IDEA discovers the new module and its run task.

For this assignment, consider the pathfinder complete when the application generates an image containing an appropriate shortest path and the inherited graph tests pass.

## Optional map generation

To experiment with a different map:

1. Create a 300-by-300 bitmap in Microsoft Paint, using black for obstacles and white for open space.
2. Run `data/imagegen.py` to generate a configuration-space CSV from the bitmap. You can change the robot size by adjusting the value used by the script.
3. Run the pathfinder again to generate a new output image. The supplied `data/cspace_image.jpg` shows the included configuration space without a path.

This experimentation is optional and is not required to complete the assignment.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add DijkstrasRoboticPathfinder
git commit -m "Implement Dijkstra robotic pathfinder"
git push -u origin dijkstras-robotic-pathfinder
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- you completed the required `TODO` comments in `CSpaceGraph` and `WeightedDirectedGraph`;
- `./gradlew :DijkstrasRoboticPathfinder:test` passes;
- `./gradlew :DijkstrasRoboticPathfinder:build` completes successfully;
- `./gradlew :DijkstrasRoboticPathfinder:run` generates the expected path image; and
- your work is committed to the `dijkstras-robotic-pathfinder` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your pull request.
