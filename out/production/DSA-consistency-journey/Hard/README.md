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
-
### 2️⃣ Majority Element II (Elements Appearing More Than n/3 Times)

- **Idea:**  
  Use a modified Boyer-Moore Voting Algorithm to find all elements that appear more than ⌊n/3⌋ times in the array. Track up to two candidates and their counts, then verify their actual occurrences.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find all majority elements in an array that appear more than n/3 times.
- **Example:**  
  Input: `nums = [0, 3, 4, 1, 0]`  
  Output: `[0]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/majority-element-ii/)
### 3️⃣ Three Sum (Find All Unique Triplets That Sum to Zero)

- **Idea:**  
  Use nested loops or hashing to find all unique triplets in the array that sum to zero. Sort each triplet before adding to a set to avoid duplicates. The brute force approach checks all combinations, while the better approach uses a hashset for faster lookup.
- **Time Complexity:**
  - Brute Force: O(n³)
  - Better Approach: O(n²)
- **Space Complexity:** O(k) (for storing unique triplets)
- **Best Use:** Find all unique triplets in an array that sum to zero, a classic interview and coding challenge problem.
- **Example:**  
  Input: `arr = [-1, 0, 1, 2, -1, -4]`  
  Output: `[[-1, -1, 2], [-1, 0, 1]]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/3sum/)


