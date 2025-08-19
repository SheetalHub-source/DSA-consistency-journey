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
