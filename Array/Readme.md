# 🔢 Array Problems in Java

This repository contains solutions to common **array problems** in Java.  
Each problem is implemented from scratch with:
- 📘 Explanation of the **idea**
- ⏱️ **Time & Space Complexity**

---

## 📂 Problems Covered

---

### 1️⃣ Largest Element in an Array

- **Idea:** Traverse the array and keep track of the maximum element encountered.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Finding the maximum value in an unsorted array.
- **Example:**  
  Input: `arr = [10, 4, 3, 50, 23, 90]`  
  Output: Largest element = `90`

---

### 2️⃣ Second Largest Element in an Array

- **Idea:** Traverse the array and keep track of the second maximum element encountered.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Finding the second maximum value in an unsorted array.
- **Example:**  
  Input: `arr = [10, 4, 3, 50, 23, 90]`  
  Output: Second largest element = `50`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/second-largest3735/1)

---

### 3️⃣ Check if Array is Sorted (Non-decreasing Order)

- **Idea:** Traverse the array and check if each element is greater than or equal to the previous one.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Validating if an array is sorted for further algorithms like binary search.
- **Example:**  
  Input: `arr = [10, 20, 30, 40, 50]`  
  Output: `true`  
  Input: `arr = [90, 80, 100, 70, 40, 30]`  
  Output: `false`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1)

---

### 4️⃣ Remove Duplicates from Sorted Array

- **Idea:** Traverse the sorted array using two pointers. Keep one pointer (`j`) to store the position of the next unique element, and another pointer (`i`) to iterate through the array. Whenever a new unique element is found, place it at `nums[j]` and increase the count.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Example:**  
  Input: `arr = [1, 1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 5]`  
  Output: Count = `4`  
  Distinct elements are: `1 3 4 5`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)

---

### 5️⃣ Rotate Array by One Position

- **Idea:**  
  To rotate the array to the left by one position:  
  1. Store the first element in a temporary variable.
  2. Shift all elements of the array one index to the left.
  3. Place the stored element at the end of the array.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place rotation)
- **Example:**  
  Input:  
  `arr = [1, 2, 3, 4, 5]`  
  Output: Rotated Array = `[2, 3, 4, 5, 1]`
- **Problem Link:** [TakeUForward](https://takeuforward.org/plus/dsa/problems/left-rotate-array-by-one)

---

### 6️⃣ Rotate Array by K Positions

- **Idea:**  
  Use the **array reversal algorithm** to rotate the array by `k` positions.  
  1. Reverse the entire array.
  2. Reverse the first `k` elements.
  3. Reverse the remaining `n-k` elements.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place rotation)
- **Example:**  
  Input:  
  `arr = [1, 2, 3, 4, 5], k = 3`  
  Output: `[3, 4, 5, 1, 2]`
-
### 7️⃣ Move All Zeros to End of Array

- **Idea:**  
  Traverse the array, copying non-zero elements to the front. Count the number of zeros, then fill the remaining positions at the end with zeros.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place operation)
- **Best Use:** Efficiently rearrange an array so that all zeros are at the end, preserving the order of non-zero elements.
- **Example:**  
  Input: `arr = [1, 2, 0, 7, 4, 0, 5, 0, 3, 0]`  
  Output: `[1, 2, 7, 4, 5, 3, 0, 0, 0, 0]`
- **Problem Link:**: https://leetcode.com/problems/move-zeroes/