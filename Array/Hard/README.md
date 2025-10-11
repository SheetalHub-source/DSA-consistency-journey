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
### 4️⃣ Four Sum (Find All Unique Quadruplets That Sum to Target)

- **Idea:**  
  Sort the array and use four pointers (two nested loops for the first two numbers, then two pointers for the remaining two). Skip duplicates to ensure unique quadruplets. For each combination, check if the sum equals the target and add to the result.
- **Time Complexity:** O(n³)
- **Space Complexity:** O(k) (for storing unique quadruplets)
- **Best Use:** Find all unique quadruplets in an array that sum to a given target, useful for advanced array and combination problems.
- **Example:**  
  Input: `nums = [1, 0, -1, 0, -2, 2]`, `target = 0`  
  Output: `[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/4sum/)
### 5️⃣ Largest Subarray with Zero Sum

- **Idea:**  
  Use a HashMap to store prefix sums and their earliest indices. As you iterate, update the running sum. If the sum is zero or has been seen before, update the maximum length of the subarray found so far.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashMap)
- **Best Use:** Find the longest contiguous subarray with a sum of zero, useful for subarray and prefix sum problems.
- **Example:**  
  Input: `arr = [0, 0, 0, 0, 1, 0]`  
  Output: `4` (the longest subarray with zero sum is `[0, 0, 0, 0]`)
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1)
### 6️⃣ Maximum Rectangle Area in a Binary Matrix

- **Idea:**  
  Treat each row of the matrix as the base of a histogram. For each row, calculate the height of consecutive 1s in each column. Use a stack-based approach to find the largest rectangle area in the histogram for each row, updating the maximum area found.
- **Time Complexity:** O(n * m)
- **Space Complexity:** O(m) (for the stack and height array)
- **Best Use:** Find the largest rectangle containing only 1s in a binary matrix, useful for image processing and dynamic programming problems.
- **Example:**  
  Input:
  ```
  [
    [0, 0, 0, 0],
    [1, 1, 1, 1],
    [1, 1, 1, 1]
  ]
  ```
  Output: `8` (the largest rectangle of 1s has area 8)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximal-rectangle/)

### 7️⃣ Count Subarrays with Given XOR

- **Idea:**  
  Use a HashMap to store the frequency of prefix XORs. For each element, compute the current prefix XOR and check if `(prefix XOR ^ k)` exists in the map. If it does, add its frequency to the count. Update the map with the current prefix XOR.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashMap)
- **Best Use:** Efficiently count the number of subarrays whose XOR equals a given value, useful for bit manipulation and prefix sum problems.
- **Example:**  
  Input: `arr = [4, 2, 2, 6, 4]`, `k = 6`  
  Output: `4`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/count-the-number-of-subarrays-with-given-xor/1)
### 8️⃣ Merge Intervals

- **Idea:**  
  First, sort the intervals based on their start values (and end values if starts are equal). Then, iterate through the intervals and merge overlapping ones by updating the end value. Add non-overlapping intervals directly to the result.
- **Time Complexity:** O(n log n) (due to sorting)
- **Space Complexity:** O(n) (for storing merged intervals)
- **Best Use:** Efficiently merge overlapping intervals, useful in scheduling, calendar, and range problems.
- **Example:**  
  Input: `intervals = [[4, 1], [4, 7], [10, 8], [15, 18]]`  
  Output: `[[1, 7], [8, 10], [15, 18]]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/merge-intervals/)
### 9️⃣ Merge Two Sorted Arrays

- **Idea:**  
  Use two pointers to merge two sorted arrays into one. Copy the first m elements of `nums1` into a temporary array, then merge elements from the temporary array and `nums2` back into `nums1` in sorted order.
- **Time Complexity:** O(m + n)
- **Space Complexity:** O(m) (for the temporary array)
- **Best Use:** Efficiently merge two sorted arrays, especially when one has enough space to hold the result (as in many coding interviews).
- **Example:**  
  Input: `nums1 = [1, 2, 3, 0, 0, 0]`, `m = 3`, `nums2 = [2, 5, 6]`, `n = 3`  
  Output: `[1, 2, 2, 3, 5, 6]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/merge-sorted-array/)

### 🔟 Maximum Product Subarray

- **Idea:**  
  Track both the maximum and minimum products ending at each position, since a negative number can turn a minimum product into a maximum (and vice versa). Update the result with the highest product found so far.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find the contiguous subarray within an array (containing at least one number) which has the largest product, useful for problems involving products and sign changes.
- **Example:**  
  Input: `nums = [1, 2, -3, 0, -4, -5]`  
  Output: `20` (the maximum product subarray is `[-4, -5]`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-product-subarray/)


### 1️⃣1️⃣ Merge Two Sorted Arrays (with and without Extra Space)

- **Idea:**  
  There are two approaches:
  1. **With Extra Space:** Copy the first m elements of `nums1` into a temporary array, then merge with `nums2` back into `nums1` using two pointers.
  2. **Without Extra Space:** Start merging from the end of `nums1` and `nums2` (since `nums1` has enough space), placing the largest elements at the back and working backwards.
- **Time Complexity:** O(m + n)
- **Space Complexity:** O(m) for the extra space approach, O(1) for the in-place approach
- **Best Use:** Efficiently merge two sorted arrays, especially when one has extra space at the end.
- **Example:**  
  Input: `nums1 = [1, 2, 3, 0, 0, 0]`, `m = 3`, `nums2 = [2, 5, 6]`, `n = 3`  
  Output: `[1, 2, 2, 3, 5, 6]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/merge-sorted-array/)

### 1️⃣2️⃣ Find the Repeating and Missing Number in an Array

- **Idea:**  
  There are two main approaches:
  1. **HashMap Approach:** Count the frequency of each number. The number with frequency > 1 is repeating, and the number missing from the map is the missing one.
  2. **Mathematical Approach:** Use the sum and sum of squares formulas for the first n natural numbers. Calculate the difference between the actual and expected sums to derive equations for the repeating and missing numbers.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) for the mathematical approach, O(n) for the HashMap approach
- **Best Use:** Efficiently find both the repeating and missing numbers in an array containing numbers from 1 to n.
- **Example:**  
  Input: `nums = [6, 5, 7, 1, 8, 6, 4, 3, 2]`  
  Output: `[6, 9]` (6 is repeating, 9 is missing)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/set-mismatch/)
### 1️⃣3️⃣ Count Inversions in an Array

- **Idea:**  
  There are two approaches:
  1. **Brute Force:** Use nested loops to count pairs `(i, j)` such that `i < j` and `arr[i] > arr[j]`.
  2. **Optimal (Merge Sort):** Use a modified merge sort to count inversions while merging. When an element from the right subarray is placed before an element from the left, all remaining elements in the left subarray form inversions.
- **Time Complexity:**
  - Brute Force: O(n²)
  - Merge Sort: O(n log n)
- **Space Complexity:** O(n) (for the temporary arrays in merge sort)
- **Best Use:** Efficiently count the number of inversions in an array, useful for measuring how far an array is from being sorted.
- **Example:**  
  Input: `arr = [2, 4, 1, 3, 5]`  
  Output: `3` (inversions are: (2,1), (4,1), (4,3))
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/inversion-of-array/0)

### 1️4 Reverse Pairs (Count Important Reverse Pairs)

- **Idea:**  
  Use a modified merge sort to count pairs `(i, j)` such that `i < j` and `nums[i] > 2 * nums[j]`. For each merge step, count the qualifying pairs before merging the two sorted halves. Then, merge the arrays in sorted order to maintain efficiency.
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n) (for temporary arrays during merge)
- **Best Use:** Efficiently count reverse pairs in an array, useful for advanced sorting and counting problems.
- **Example:**  
  Input: `nums = [1, 3, 2, 3, 1]`  
  Output: `2` (reverse pairs: (3,1) and (3,1))
- **Problem Link:** [LeetCode](https://leetcode.com/problems/reverse-pairs/)
### 15. Maximum Product Subarray

- **Idea:**  
  Track both the maximum and minimum products ending at each position, since multiplying by a negative number can swap the maximum and minimum. Update the result with the highest product found so far as you iterate through the array.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find the contiguous subarray within an array (containing at least one number) which has the largest product, useful for problems involving products and sign changes.
- **Example:**  
  Input: `nums = [2, 3, -2, 4]`  
  Output: `6` (the maximum product subarray is `[2, 3]`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-product-subarray/)
