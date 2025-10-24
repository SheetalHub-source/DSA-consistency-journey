### 1️⃣ Binary Search on 1D Array

- **Idea:**  
  Use the binary search algorithm to efficiently find the index of a target element in a sorted array. Repeatedly divide the search interval in half, comparing the middle element to the target and narrowing the search range accordingly.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Quickly search for an element in a sorted array, commonly used in search problems and interview questions.
- **Example:**  
  Input: `arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`, `target = 7`  
  Output: `Element found at index: 6`
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/binary-search/)
### 2️⃣ Implement Lower Bound (Binary Search)

- **Idea:**  
  Use binary search to find the index of the first element in a sorted array that is greater than or equal to a given target (`x`). If no such element exists, return the length of the array.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the lower bound position for insertion or search, useful in range queries and ordered data problems.
- **Example:**  
  Input: `arr = [2, 3, 7, 10, 11, 11, 25]`, `target = 9`  
  Output: `Lower bound index: 3` (element `10` is the first ≥ 9)
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/lower-bound-in-cpp-stl/)

### 3️⃣ Implement Upper Bound (Binary Search)

- **Idea:**  
  Use binary search to find the index of the first element in a sorted array that is strictly greater than a given target (`x`). If no such element exists, return the length of the array.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the upper bound position for insertion or search, useful in range queries and ordered data problems.
- **Example:**  
  Input: `arr = [2, 3, 7, 10, 11, 11, 25]`, `x = 100`  
  Output: `7` (no element is greater than 100, so returns array length)
- **Problem Link:** [GeeksforGeeks](https://www.geeksforgeeks.org/upper-bound-in-cpp-stl/)
### 4️⃣ Search Insert Position

- **Idea:**  
  Use binary search to find the index of the target in a sorted array. If the target is not found, return the index where it should be inserted to maintain the sorted order.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently find the position to insert a target value in a sorted array, useful for search and insertion problems.
- **Example:**  
  Input: `arr = [1, 3]`, `target = 2`  
  Output: `1` (2 should be inserted at index 1)
- **Problem Link:** [LeetCode](https://leetcode.com/problems/search-insert-position/)

### 5️⃣ First and Last Occurrences in a Sorted Array

- **Idea:**  
  Use binary search twice — once to find the first (leftmost) index of the target and once to find the last (rightmost) index. For the first occurrence, when you find target move the right bound to mid-1 to continue searching left. For the last occurrence, when you find target move the left bound to mid+1 to continue searching right.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Get the index range of a target value in a sorted array (or return [-1, -1] if not present).
- **Example:**  
  Input: `nums = [5, 7, 7, 8, 8, 10]`, `target = 8`  
  Output: `[3, 4]`
- **Problem Link:** [LeetCode - Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
### 6️⃣ Count Occurrences of a Number in a Sorted Array

- **Idea:**  
  Use binary search twice to locate the first and last positions of the target value. If the value is present, the count is `last - first + 1`; otherwise the count is `0`.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Efficiently count how many times a value appears in a sorted array (useful when duplicates exist).
- **Example:**  
  Input: `arr = [2, 4, 6, 8, 8, 8, 11, 13]`, `x = 8`  
  Output: `The number of occurrences is: 3`
- **Problem Link:** [GeeksforGeeks — Count number of occurrences in a sorted array](https://www.geeksforgeeks.org/count-number-of-occurrences-in-a-sorted-array/)
### 7️⃣ Search in Rotated Sorted Array

- **Idea:**  
  Use a modified binary search. At each step determine which half is sorted (left → mid or mid → right). If the target lies within the sorted half, narrow the search to that half; otherwise search the other half.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Best Use:** Find the index of a target in a sorted array that has been rotated at an unknown pivot.
- **Example:**  
  Input: `arr = [7, 8, 9, 1, 2, 3, 4, 5, 6]`, `target = 1`  
  Output: `The index is: 3`
- **Problem Link:** [LeetCode - Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
