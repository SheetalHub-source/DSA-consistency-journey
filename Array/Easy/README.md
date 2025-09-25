# 🔢 Easy Array Problems in Java

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
  ...existing code...

### 8️⃣ Linear Search in an Array

- **Idea:**  
  Traverse the array from start to end, comparing each element with the target value. Return the index if found, otherwise return -1.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Searching for an element in an unsorted array.
- **Example:**  
  Input: `arr = [3, 5, 2, 4, 9]`, target = `4`  
  Output: Element found at index = `3`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1)

### 9️⃣ Union of Two Sorted Arrays

- **Idea:**  
  Use two pointers to traverse both sorted arrays. Compare elements and add the smaller one to the result if it is not a duplicate. Continue until both arrays are fully traversed, ensuring only unique elements are added.
- **Time Complexity:** O(n + m)  
  (where n and m are the lengths of the two arrays)
- **Space Complexity:** O(n + m)  
  (for storing the union)
- **Best Use:** Efficiently find the union of two sorted arrays, removing duplicates.
- **Example:**  
  Input:  
  `a = [1, 1, 1, 1, 1]`  
  `b = [2, 2, 2, 2, 2]`  
  Output: `[1, 2]`
- **Problem:https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

### 🔟 Find the Missing Number in an Array

- **Idea:**  
  Calculate the expected sum of numbers from `0` to `n` using the formula `n*(n+1)/2`. Subtract the actual sum of the array from the expected sum to get the missing number.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the missing number in an array containing numbers from `0` to `n` with one missing.
- **Example:**  
  Input: `arr = [3, 0, 1]`  
  Output: The missing number is `2`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/missing-number/)
  ...existing code...

### 1️⃣1️⃣ Maximum Consecutive Ones in a Binary Array

- **Idea:**  
  Traverse the array, counting consecutive 1s. Reset the count when a 0 is encountered and keep track of the maximum count found.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find the longest sequence of consecutive 1s in a binary array.
- **Example:**

  Input: `arr = [1, 1, 0, 1, 1, 1]`  
  Output: The maximum number of consecutive 1s is `3`
- **Problem Link:**: https://leetcode.com/problems/max-consecutive-ones/

...existing code...

### 1️⃣2️⃣ Find the Single Number (Element Appearing Once)

- **Idea:**  
  Use XOR operation to find the element that appears only once in an array where every other element appears twice. XORing all elements cancels out the duplicates, leaving the unique element.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the single non-duplicate element in an array of pairs.
- **Example:**  
  Input: `arr = [4, 1, 2, 1, 2]`  
  Output: The single number is `4`
- **Problem Link:** https://leetcode.com/problems/single-number/

### 1️⃣3️⃣ Longest Subarray with Sum K

- **Idea:**  
  Use a HashMap to store prefix sums and their earliest indices. For each element, calculate the prefix sum and check if `(prefix sum - k)` exists in the map. If it does, update the result with the length of the subarray. This efficiently finds the longest subarray with sum equal to `k`.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashMap)
- **Best Use:** Find the longest subarray with a given sum in linear time.
- **Example:**  
  Input: `arr = [1, 2, 3, 2, 5]`, `k = 5`  
  Output: Longest subarray length with sum `5` is `2`
- **Problem Link:**https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

### 1️⃣4️⃣ Maximum Number of Words You Can Type

- **Idea:**  
  Mark all broken letters in a boolean array. For each word in the input text, check if it contains any broken letter. If not, count it as a word that can be typed.
- **Time Complexity:** O(n + m) (where n = length of text, m = length of brokenLetters)
- **Space Complexity:** O(1) (fixed array for 26 lowercase letters)
- **Best Use:** Quickly determine how many words in a sentence can be typed without using any broken keyboard letters.
- **Example:**  
  Input: `text = "hello world"`, `brokenLetters = "ad"`  
  Output: `1` (only "world" can be typed)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-number-of-words-you-can-type/)
- 
### 1️⃣5️⃣ Generate Binary Numbers from 1 to N

- **Idea:**  
  For each number from 1 to N, convert it to its binary representation using repeated division by 2. Reverse the result to get the correct binary string and collect all binary numbers in a list.
- **Time Complexity:** O(n * log n) (for converting each number to binary)
- **Space Complexity:** O(n * log n) (for storing all binary strings)
- **Best Use:** Generate binary representations for a range of numbers, useful for bit manipulation and number theory problems.
- **Example:**  
  Input: `n = 5`  
  Output: `["1", "10", "11", "100", "101"]`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1)
