# Thread Lab

This is an assignment template for the Hardin-Simmons University CSCI-3323 Data Structures course.

In this lab, you will use Java threads to speed up a program that counts the lines in every text file in a directory. The supplied `LineCounter` processes files one at a time. Your job is to write a multithreaded version and compare its running time to the original.

## Getting started

This assignment is in the `ThreadLab/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c thread-lab
```

Do not complete the assignment directly on `main`.

## The starter code

Paths in this section are relative to `ThreadLab/`.

- `src/main/java/edu/hsutx/LineCounter.java` contains two entry points:
  - `main` reads every `.txt` file in the given directory sequentially, prints each file's line count, and reports the total elapsed time.
  - `mainAlternate` is currently an identical copy of `main`. This is the method you will modify.
- `src/main/java/edu/hsutx/CodeTimer.java` is a simple timer used to measure elapsed time. You do not need to change it.
- `src/test/java/edu/hsutx/LineCounterTest.java` runs both versions against the `textfiles/` directory so you can compare their output and timing.
- `textfiles/` contains 61 text files of varying sizes, ranging from a few lines to about 40 MB.

## Implement the threaded line counter

Complete the `TODO` in `mainAlternate` so that it counts the lines of the files concurrently using threads:

1. Create a separate thread to count the lines of each file. You may extend `Thread`, implement `Runnable`, or use a lambda.
2. Start all of the threads before waiting on any of them.
3. Wait for every thread to finish (for example, with `join()`) **before** stopping the timer and printing the summary. Otherwise, the reported time will not include the work done by the threads.

Leave `main` unchanged so that it remains the sequential baseline. Your threaded version must report the same number of files and the same line count for each file as `main`, although the order in which files are printed may differ from run to run.

Once you have an initial working threaded solution, vary your solution to see if there is a faster way to solve the problem.

(Semaphores?  A cap on total threads?)

Experiment with different numbers and sizes of files as well.  

Try to submit a version that will perform the fastest possible counts in all types of circumstances.

We will have an in-class competition to see whose code performs the best!

## Build and test

Run the assignment tasks from the repository root:

```bash
./gradlew :ThreadLab:test
./gradlew :ThreadLab:build
```

In Windows PowerShell:

```powershell
.\gradlew.bat :ThreadLab:test
.\gradlew.bat :ThreadLab:build
```

The tests run with `ThreadLab/` as the working directory, so they can read the files in `ThreadLab/textfiles/`. Program output, including each version's elapsed time, is shown in the console.

Gradle skips tests that have already passed if nothing has changed. To run them again so you can take another timing measurement, add `--rerun`:

```bash
./gradlew :ThreadLab:test --rerun
```

In Windows PowerShell:

```powershell
.\gradlew.bat :ThreadLab:test --rerun
```

Reload the root Gradle project after pulling the assignment so IntelliJ IDEA discovers the new module.

## Compare the results

Run the tests several times and record the elapsed time reported by `main` and by `mainAlternate`. Keep in mind:

- The operating system caches recently read files, so the first run is often slower than later runs. Compare runs made under similar conditions.
- The order in which the tests run can affect timing, because whichever version runs second may benefit from cached files.
- A single very large file can dominate the total time no matter how many threads you use.

Be prepared to explain whether your threaded version was faster, by roughly how much, and why the speedup is or is not proportional to the number of threads you created.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add ThreadLab
git commit -m "Implement threaded line counter"
git push -u origin thread-lab
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- `mainAlternate` counts lines using threads and waits for all of them to finish before reporting the elapsed time;
- `main` is unchanged;
- `./gradlew :ThreadLab:build` completes successfully; and
- your work is committed to the `thread-lab` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your pull request.
