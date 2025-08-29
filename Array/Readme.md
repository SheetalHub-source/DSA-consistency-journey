# 🔢 Array Problems in Java  

This repository contains solutions to common **array problems** in Java.  
Each problem is implemented from scratch with:  
- 📘 Explanation of the **idea**  
- ⏱️ **Time & Space Complexity**  

---
## 📂 Problems Covered  

### 🔹 1. Largest Element in an Array  
- **Idea:** Traverse the array and keep track of the maximum element encountered.  
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  
- **Best Use:** Finding the maximum value in an unsorted array.  
- **Example:**  
  Input:  arr = [10, 4, 3, 50, 23, 90]  
  Output: Largest element = 90
### 🔹 2. Second Largest Element in an Array  
- **Idea:** Traverse the array and keep track of the second maximum element encountered.  
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  
- **Best Use:** Finding the second maximum value in an unsorted array.  
- **Example:**  
  Input:  arr = [10, 4, 3, 50, 23, 90]  
  Output: Largest element = 50
 - **Problem Link:** https://www.geeksforgeeks.org/problems/second-largest3735/1
### 🔹 3. Check if Array is Sorted (Non-decreasing Order)
**Idea:** Traverse the array and check if each element is greater than or equal to the previous one.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Validating if an array is sorted for further algorithms like binary search.
- **Example:**  
Input:  arr = [10, 20, 30, 40, 50]  
Output: true
Input:  arr = [90, 80, 100, 70, 40, 30]  
Output: false
- **Problem Link:**   https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

### 🔹 4. Remove Duplicates from Sorted Array
**Idea:** Traverse the sorted array using two pointers. Keep one pointer (j) to store the position of the next unique element, and another pointer (i) to iterate through the array. Whenever a new unique element is found, place it at nums[j] and increase the count.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Example:**  
Input:
arr = [1, 1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 5] 
Output: Count = 4
Distinct elements are: 1 3 4 5
- **Problem Link:**   https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/