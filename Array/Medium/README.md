# 🔢 Medium Array Problems in Java

This repository contains solutions to common **array problems** in Java.  
Each problem is implemented from scratch with:
- 📘 Explanation of the **idea**
- ⏱️ **Time & Space Complexity**

---

## 📂 Problems Covered

---
### 1. Two Sum Problem

- **Idea:**  
  Use a HashMap to store each number and its index as you iterate through the array. For each element, check if the complement (`target - current number`) exists in the map. If found, return the indices of the two numbers.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashMap)
- **Best Use:** Find two numbers in an array that add up to a specific target efficiently.
- **Example:**  
  Input: `arr = [2, 7, 11, 15]`, `target = 9`  
  Output: Indices `[1, 0]` (since `arr[1] + arr[0] = 7 + 2 = 9`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/two-sum/)

### 2. Sort Colors (Dutch National Flag Problem)

- **Idea:**  
  Use three pointers to partition the array into three sections: 0s, 1s, and 2s. Swap elements to their correct positions as you traverse the array, ensuring all 0s are at the start, 2s at the end, and 1s in the middle.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place sorting)
- **Best Use:** Efficiently sort an array containing only 0s, 1s, and 2s.
- **Example:**  
  Input: `arr = [1, 2, 0, 0, 1, 2, 1, 2]`  
  Output: `[0, 0, 1, 1, 1, 2, 2, 2]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/sort-colors/)
### 3. Majority Element in an Array

- **Idea:**  
  Sort the array and return the middle element. In an array where a majority element appears more than ⌊n/2⌋ times, the middle element after sorting will always be the majority.
- **Time Complexity:** O(n log n) (due to sorting)
- **Space Complexity:** O(1) (if sorting in-place)
- **Best Use:** Find the element that appears more than half the time in an array.
- **Example:**  
  Input: `arr = [3, 2, 3]`  
  Output: `3`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/majority-element/)

### 4. Maximum Subarray Sum (Kadane's Algorithm)

- **Idea:**  
  Use Kadane's Algorithm to find the maximum sum of a contiguous subarray. Iterate through the array, maintaining the current sum and updating the maximum sum found. Reset the current sum to zero if it becomes negative.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the largest sum of any contiguous subarray.
- **Example:**  
  Input: `arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
  Output: Maximum subarray sum is `6`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-subarray/)
### 5. Print Subarray with Maximum Subarray Sum

- **Idea:**  
  Use an enhanced version of Kadane's Algorithm to track the start and end indices of the subarray that gives the maximum sum. Update these indices whenever a new maximum is found, and print the subarray.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find and print the actual subarray that produces the maximum sum, not just the sum itself.
- **Example:**  
  Input: `arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
  Output:  
  Subarray: `4 -1 2 1`  
  The maximum subarray sum is `6`
  ### 6. Best Time to Buy and Sell Stock (Max Profit)

- **Idea:**  
  Track the minimum price seen so far while iterating through the array. For each price, calculate the profit if sold at that price and update the maximum profit found.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find the maximum profit from a single buy and sell operation in a list of stock prices.
- **Example:**  
  Input: `arr = [7, 1, 5, 3, 6, 4]`  
  Output: Max profit is `5` (buy at `1`, sell at `6`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
### 7. Rearrange Array Elements by Sign (Alternating Positive & Negative)

- **Idea:**  
  Create a new array and place positive numbers at even indices and negative numbers at odd indices as you iterate through the input. This ensures positives and negatives alternate, preserving their relative order.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the result array)
- **Best Use:** Rearrange an array so that positive and negative numbers alternate, useful for problems requiring sign-based ordering.
- **Example:**  
  Input: `nums = [3, -2, 1, -5, 2, -4]`  
  Output: `[3, -2, 1, -5, 2, -4]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/rearrange-array-elements-by-sign/)

### 8. Next Permutation of an Array

- **Idea:**  
  Find the first index from the end where the current element is less than the next. Swap it with the next larger element to its right, then reverse the subarray after the original index. This generates the next lexicographical permutation.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place modification)
- **Best Use:** Generate the next permutation in lexicographical order for problems involving permutations.
- **Example:**  
  Input: `nums = [1, 2, 3]`  
  Output: `[1, 3, 2]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/next-permutation/)
### 9. Medium.Leaders in an Array

- **Idea:**  
  Traverse the array from right to left, keeping track of the maximum element seen so far. Any element greater than all elements to its right is a leader. Collect leaders and reverse the list to maintain original order.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for storing leaders)
- **Best Use:** Find all elements in an array that are greater than all elements to their right.
- **Example:**  
  Input: `arr = [16, 17, 4, 3, 5, 2]`  
  Output: `[17, 5, 2]`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/leaders-in-an-array/)

### 10. Longest Consecutive Sequence in an Array

- **Idea:**  
  Use a HashSet to store all elements. For each element, check if it is the start of a sequence (i.e., `num - 1` is not in the set). Then, count the length of the sequence by incrementing and checking for consecutive numbers, removing them from the set as you go.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashSet)
- **Best Use:** Find the length of the longest sequence of consecutive integers in an unsorted array.
- **Example:**  
  Input: `arr = [100, 4, 200, 1, 3, 2]`  
  Output: Length of longest consecutive sequence is `4` (sequence: `1, 2, 3, 4`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)


### 11. Set Matrix Zeroes

- **Idea:**  
  Traverse the matrix to find all zero elements. For each zero, set its entire row and column to zero. This can be done using an auxiliary matrix or flags to avoid overwriting zeros prematurely.
- **Time Complexity:** O(m * n * (m + n)) (with auxiliary matrix approach)
- **Space Complexity:** O(m * n) (for the flag matrix)
- **Best Use:** Set entire rows and columns to zero if any element in them is zero, commonly used in matrix manipulation problems.
- **Example:**  
  Input:  
  ```
  [
    [1, 2, 3],
    [4, 0, 6],
    [7, 8, 9]
  ]
  ```
  Output:  
  ```
  [
    [1, 0, 3],
    [0, 0, 0],
    [7, 0, 9]
  ]
  ```
- **Problem Link:** [LeetCode](https://leetcode.com/problems/set-matrix-zeroes/)

### 12: Rotate Matrix by 90 Degrees

- **Idea:**  
  First, transpose the matrix (swap rows and columns). Then, reverse each row to achieve a 90-degree clockwise rotation. This is done in-place for square matrices.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1) (in-place rotation)
- **Best Use:** Efficiently rotate a square matrix by 90 degrees, commonly used in image processing and matrix manipulation.
- **Example:**  
  Input:  
  ```
  [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ]
  ```
  Output:  
  ```
  [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
  ]
  ```
- **Problem Link:** [LeetCode](https://leetcode.com/problems/rotate-image/)
# 13. Spiral Matrix Traversal
    Idea:
    Traverse the matrix in a spiral order by maintaining boundaries (top, bottom, left, right). Move right across the top row, down the right column, left across the bottom row, and up the left column, shrinking the boundaries after each pass until all elements are visited.
    Time Complexity: O(m * n) (where m and n are the matrix dimensions)
    Space Complexity: O(m * n) (for storing the result)
    Best Use: Retrieve all elements of a 2D matrix in spiral order, useful for matrix traversal problems.
    Example:
    Input:
    [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
    ]
    Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
*** Problem Link: https://leetcode.com/problems/spiral-matrix/