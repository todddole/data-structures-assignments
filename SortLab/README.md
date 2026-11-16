# Sort Lab

This is an assignment template for the Hardin-Simmons University CSCI-3323 Data Structures course.

In this lab, you will implement several sorting algorithms and compare their running times on different kinds of data. The goal is to find data sets on which each sort beats the others, and to understand why.

There is only one submission for this lab. We will not hold a peer review session.

## Getting started

This assignment is in the `SortLab/` directory of the `data-structures-assignments` repository. Use the Gradle wrapper at the repository root for all commands below. The shared wrapper requires JDK 17 or newer to run Gradle.

Before beginning, update your `main` branch with the latest starter code. From the repository root:

```bash
git switch main
git pull origin main
git fetch upstream
git merge upstream/main
git push origin main
git switch -c sort-lab
```

Do not complete the assignment directly on `main`.

## The starter code

Paths in this section are relative to `SortLab/`.

- `src/main/java/edu/hsutx/SortLab.java` contains:
  - `createArray(n, maxValue)`, which builds an array of `n` random integers in the range `0` to `maxValue - 1`.
  - `countingSort`, a complete implementation of counting sort.
  - `radixSort`, which is empty.
  - `comparisonSort` and `secondComparisonSort`, which both currently contain a selection sort for demonstration purposes.
  - `main`, which runs every sort on the same data for each entry in `paramList` and prints the elapsed time of each sort in seconds.
- `src/main/java/edu/hsutx/CodeTimer.java` is a simple timer used to measure elapsed time. You do not need to change it.

## Implement the sorts

1. Implement `radixSort()`. You may use any base (radix) you like. Base 10 is the easiest to reason about, but larger bases such as 256 or 65,536 can be much faster.
2. Replace the selection sort in `comparisonSort()` with a comparison sort that runs in O(n log n) time. QuickSort, MergeSort, and HeapSort are all valid choices, or you can explore a different O(n log n) sort.
3. Replace the selection sort in `secondComparisonSort()` with a **different** O(n log n) comparison sort.
4. Update the labels printed in `main` (`"Comparison Sort"`) to the names of the sorts you chose.

You may add more sorting methods to the comparison if you like. There are `TODO (optional)` markers in `SortLab.java` showing where to add them.

Make sure each sort actually sorts the array. A sort that runs quickly but leaves the array out of order does not count. Consider writing a small helper that checks whether an array is in order and calling it after each sort while you develop.

## Tune `paramList`

Each row of `paramList` in `main` is `{n, maxValue}`: the number of elements and the range of values. Adjust `paramList` so that it contains:

- one data set where `radixSort` is the fastest sort;
- one data set where `comparisonSort` is the fastest sort; and
- one data set where `secondComparisonSort` is the fastest sort.

Think about how the running time of each algorithm depends on `n` and on the range of values, and choose your data sets based on that. Run each configuration several times, because timings vary from run to run, especially for small inputs that finish in a few milliseconds.

Be prepared to explain why each sort wins on the data set you chose for it.

## Build and run

Run the assignment tasks from the repository root:

```bash
./gradlew :SortLab:build
./gradlew :SortLab:run
```

In Windows PowerShell:

```powershell
.\gradlew.bat :SortLab:build
.\gradlew.bat :SortLab:run
```

You can also run `SortLab.main` directly from IntelliJ IDEA. Reload the root Gradle project after pulling the assignment so IntelliJ IDEA discovers the new module.

### Expect the starter code to be slow

Selection sort is O(n²). With the starter `paramList`, the third test run (n = 1,000,000) asks selection sort to do about 500 billion comparisons, twice. That takes a very long time, and the program will look as if it has frozen. Press `Ctrl+C` to stop it. This problem goes away once you replace both selection sorts with O(n log n) sorts.

## Warning: `OutOfMemoryError`

Some sorts use memory in proportion to the **range of values**, not just the number of elements. If you choose large values in `paramList`, the program can crash with an error like one of these:

```text
java.lang.OutOfMemoryError: Java heap space
java.lang.OutOfMemoryError: Requested array size exceeds VM limit
```

Things to know:

- **Counting sort allocates an array as large as the maximum value.** `countingSort` creates `int[max + 1]`, and each `int` uses 4 bytes. A range of 0–1,000,000 needs about 4 MB, which is fine. A range of 0–1,999,999,999 (the first row of the starter `paramList`) needs about **8 GB** for that one array, no matter how small `n` is. Depending on how much memory your computer has, this may be very slow or may crash.
- **Java cannot create an array with more than about 2,147,483,639 elements.** If `maxValue` is close to the largest `int` (2,147,483,647), counting sort fails with `Requested array size exceeds VM limit` no matter how much memory you have.
- **Large values of `n` use memory too.** Each test run keeps the original array plus a copy for the sort being timed, and MergeSort, radix sort, and counting sort each allocate at least one more array of size `n`. At 4 bytes per element, n = 100,000,000 is about 400 MB per array, so several of them add up quickly.
- **A large radix base uses memory too.** A radix sort with base 65,536 needs a count array of 65,536 entries, which is fine. A much larger base can cost as much memory as counting sort.
- **By default, Java can use only about one quarter of your computer's memory.** So a computer with 16 GB of RAM usually gives the program about 4 GB, even when more is free.

If you hit an `OutOfMemoryError`:

1. Reduce `n` or `maxValue` in the row that caused the crash. The test run number printed just before the error tells you which row it was.
2. If you need more memory for an experiment, raise the heap limit. For `./gradlew :SortLab:run`, add this to `SortLab/build.gradle.kts`:

   ```kotlin
   tasks.named<JavaExec>("run") {
       maxHeapSize = "6g"
   }
   ```

   In IntelliJ IDEA, open **Run → Edit Configurations…**, select the `SortLab` configuration, choose **Modify options → Add VM options**, and enter `-Xmx6g`.

   Do not set the limit higher than the memory your computer actually has. If you do, the operating system will start swapping memory to disk, and your timings will be meaningless.

An `OutOfMemoryError` is also a result worth discussing. A sort that needs more memory than you have does not win on that data set, however fast it might be in theory.

## Committing and submitting

Commit regularly as you complete meaningful portions of the assignment:

```bash
git status
git add SortLab
git commit -m "Implement radix sort"
git push -u origin sort-lab
```

After the first push, use `git push` for subsequent commits.

Before submitting, confirm that:

- `radixSort`, `comparisonSort`, and `secondComparisonSort` are implemented and correctly sort the array;
- `comparisonSort` and `secondComparisonSort` use two different O(n log n) comparison sorts, and their printed labels name those sorts;
- `paramList` contains a data set on which each of those three sorts is the fastest;
- `./gradlew :SortLab:build` completes successfully; and
- your work is committed to the `sort-lab` branch and pushed to GitHub.

Follow the course submission instructions for creating and submitting your pull request.
