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