# 🔢 Hard Array Problems in Java

This repository contains solutions to common **array problems** in Java.  
Each problem is implemented from scratch with:
- 📘 Explanation of the **idea**
- ⏱️ **Time & Space Complexity**

---

## 📂 Problems Covered

---
### 1️⃣ Pascal's Triangle

- **Idea:**  
  Build each row of Pascal's Triangle using the previous row. The first and last elements of each row are always 1. Each inner element is the sum of the two elements directly above it from the previous row.
- **Time Complexity:** O(numRows²)
- **Space Complexity:** O(numRows²) (for storing the triangle)
- **Best Use:** Efficiently generate Pascal's Triangle for combinatorial and binomial coefficient problems.
- **Example:**  
  Input: `numRows = 5`  
  Output:  
  ```
  [
    [1],
    [1, 1],
    [1, 2, 1],
    [1, 3, 3, 1],
    [1, 4, 6, 4, 1]
  ]
  ```
- **Problem Link:** [LeetCode](https://leetcode.com/problems/pascals-triangle/)
