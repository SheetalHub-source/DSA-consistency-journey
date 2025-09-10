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

### 1️⃣4️⃣ Two Sum Problem

- **Idea:**  
  Use a HashMap to store each number and its index as you iterate through the array. For each element, check if the complement (`target - current number`) exists in the map. If found, return the indices of the two numbers.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the HashMap)
- **Best Use:** Find two numbers in an array that add up to a specific target efficiently.
- **Example:**  
  Input: `arr = [2, 7, 11, 15]`, `target = 9`  
  Output: Indices `[1, 0]` (since `arr[1] + arr[0] = 7 + 2 = 9`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/two-sum/)

### 1️⃣5️⃣ Sort Colors (Dutch National Flag Problem)

- **Idea:**  
  Use three pointers to partition the array into three sections: 0s, 1s, and 2s. Swap elements to their correct positions as you traverse the array, ensuring all 0s are at the start, 2s at the end, and 1s in the middle.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place sorting)
- **Best Use:** Efficiently sort an array containing only 0s, 1s, and 2s.
- **Example:**  
  Input: `arr = [1, 2, 0, 0, 1, 2, 1, 2]`  
  Output: `[0, 0, 1, 1, 1, 2, 2, 2]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/sort-colors/)
### 1️⃣6️⃣ Majority Element in an Array

- **Idea:**  
  Sort the array and return the middle element. In an array where a majority element appears more than ⌊n/2⌋ times, the middle element after sorting will always be the majority.
- **Time Complexity:** O(n log n) (due to sorting)
- **Space Complexity:** O(1) (if sorting in-place)
- **Best Use:** Find the element that appears more than half the time in an array.
- **Example:**  
  Input: `arr = [3, 2, 3]`  
  Output: `3`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/majority-element/)

### 1️⃣7️⃣ Maximum Subarray Sum (Kadane's Algorithm)

- **Idea:**  
  Use Kadane's Algorithm to find the maximum sum of a contiguous subarray. Iterate through the array, maintaining the current sum and updating the maximum sum found. Reset the current sum to zero if it becomes negative.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the largest sum of any contiguous subarray.
- **Example:**  
  Input: `arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
  Output: Maximum subarray sum is `6`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-subarray/)
### 1️⃣8️⃣ Print Subarray with Maximum Subarray Sum

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
  ### 1️⃣9️⃣ Best Time to Buy and Sell Stock (Max Profit)

- **Idea:**  
  Track the minimum price seen so far while iterating through the array. For each price, calculate the profit if sold at that price and update the maximum profit found.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Best Use:** Find the maximum profit from a single buy and sell operation in a list of stock prices.
- **Example:**  
  Input: `arr = [7, 1, 5, 3, 6, 4]`  
  Output: Max profit is `5` (buy at `1`, sell at `6`)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
### 2️⃣0️⃣ Rearrange Array Elements by Sign (Alternating Positive & Negative)

- **Idea:**  
  Create a new array and place positive numbers at even indices and negative numbers at odd indices as you iterate through the input. This ensures positives and negatives alternate, preserving their relative order.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for the result array)
- **Best Use:** Rearrange an array so that positive and negative numbers alternate, useful for problems requiring sign-based ordering.
- **Example:**  
  Input: `nums = [3, -2, 1, -5, 2, -4]`  
  Output: `[3, -2, 1, -5, 2, -4]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/rearrange-array-elements-by-sign/)

### 2️⃣1️⃣ Next Permutation of an Array

- **Idea:**  
  Find the first index from the end where the current element is less than the next. Swap it with the next larger element to its right, then reverse the subarray after the original index. This generates the next lexicographical permutation.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) (in-place modification)
- **Best Use:** Generate the next permutation in lexicographical order for problems involving permutations.
- **Example:**  
  Input: `nums = [1, 2, 3]`  
  Output: `[1, 3, 2]`
- **Problem Link:** [LeetCode](https://leetcode.com/problems/next-permutation/)
### 2️⃣2️⃣ Medium.Leaders in an Array

- **Idea:**  
  Traverse the array from right to left, keeping track of the maximum element seen so far. Any element greater than all elements to its right is a leader. Collect leaders and reverse the list to maintain original order.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (for storing leaders)
- **Best Use:** Find all elements in an array that are greater than all elements to their right.
- **Example:**  
  Input: `arr = [16, 17, 4, 3, 5, 2]`  
  Output: `[17, 5, 2]`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/leaders-in-an-array/)
