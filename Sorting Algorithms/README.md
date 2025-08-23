# Sorting Algorithms

This folder contains implementations and explanations of common **sorting algorithms** in Java.  
Each algorithm is implemented from scratch with notes on **time complexity, space complexity, and use-cases**.  

---

## 📂 Algorithms Covered

### 🔹 1. Selection Sort
- **Idea:** Repeatedly finds the minimum element and places it at the beginning.  
- **Time Complexity:** O(n²)  
- **Space Complexity:** O(1)  
- **Best Use:** Small datasets where simplicity matters more than efficiency.  
- **Code:** [SelectionSort.java](./SelectionSort.java), [SelectionSortUsingGeneric.java](./SelectionSortUsingGeneric.java)

### 🔹 2. Bubble Sort
- **Idea:** Repeatedly compares adjacent elements and swaps them if they are in the wrong order.  
- **Time Complexity:** O(n²) (Best Case: O(n) if optimized with a swap flag)  
- **Space Complexity:** O(1)  
- **Best Use:** Educational purposes and very small datasets; rarely used in production due to inefficiency.  
- **Code:** [BubbleSort.java](./BubbleSort.java)

### 🔹 3. Insertion Sort
- **Idea:** Builds the sorted array one element at a time by inserting each element into its correct position.
- **Time Complexity:** O(n²) (Best Case: O(n) when already sorted)
- **Space Complexity:** O(1)
- **Best Use:** Small or nearly sorted datasets; useful for online/incremental sorting.
- **Code:** [InsertionSort.java](./InsertionSort.java)

### 🔹 4. Merge Sort
- **Idea:** A **divide-and-conquer** algorithm that splits the array into halves, recursively sorts them, and then merges the sorted halves.  
- **Time Complexity:**  
  - Best Case: O(n log n)  
  - Average Case: O(n log n)  
  - Worst Case: O(n log n)  
- **Space Complexity:** O(n) (extra space needed for temporary arrays during merging)  
- **Best Use:** Large datasets where stable sorting and guaranteed O(n log n) performance is required. Commonly used in external sorting (e.g., sorting data from disk).  
- **Code:** [MergeSort.java](./MergeSort.java)  

---
### 🔹 5. Quick Sort
- **Idea:** A **divide-and-conquer** algorithm that:
  1. Selects a **pivot** element.  
  2. Partitions the array into two parts – elements **smaller than pivot** on the left, **greater than pivot** on the right.  
  3. Recursively applies the same process to each partition.  

- **Time Complexity:**  
  - Best Case: **O(n log n)** (when partitions are balanced)  
  - Average Case: **O(n log n)**  
  - Worst Case: **O(n²)** (when the pivot selection is poor, e.g., always smallest/largest element)  

- **Space Complexity:**  
  - **O(log n)** (for recursion stack in average case)  
  - **O(n)** in the worst case  

- **Best Use:**  
  - General-purpose sorting where average-case performance is more important than worst-case guarantees.  
  - Commonly used in **standard library sort implementations** (with optimizations like randomized pivot or hybrid approaches).  

- **Code:** [QuickSort.java](./QuickSort.java)  
### 🔹 6. Counting Sort
- **Idea:**  
  - Works for **non-negative integers**.  
  - Counts the frequency of each element and reconstructs the sorted array based on counts.  
- **Time Complexity:**  
  - Best Case: **O(n + k)**  
  - Average Case: **O(n + k)**  
  - Worst Case: **O(n + k)**  
  *(where `n` is number of elements and `k` is the maximum element value)*  
- **Space Complexity:** O(k) (extra array used for counts)  
- **Best Use:**  
  - When the range of input values (`k`) is not much larger than the number of elements (`n`).  
  - Useful in scenarios like sorting grades, counting objects, or preprocessing for radix sort.  
- **Limitations:** Not suitable for sorting negative numbers directly or very large ranges.  
- **Code:** [CountSort.java](./CountSort.java)  

---