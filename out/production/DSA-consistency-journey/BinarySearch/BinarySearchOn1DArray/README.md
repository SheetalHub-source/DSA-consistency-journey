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

### ⃣8  Search in Rotated Sorted Array II (Handles Duplicates)

- **Idea:**  
  Use a modified binary search that accounts for duplicates. At each step check mid; if values at low, mid, and high are equal, move pointers inward. Otherwise determine which half is sorted and decide where the target may lie, narrowing the search accordingly.

- **Time Complexity:** O(log n) on average, O(n) in the worst case (when duplicates force linear scans)
- **Space Complexity:** O(1)

- **Best Use:** Find whether a target exists in a rotated sorted array that may contain duplicate elements.

- **Example:**  
  Input: `arr = [1,0,1,1,1]`, `target = 0`  
  Output: `true`

- **Problem Link:** [LeetCode - Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
### 9️⃣ Min in Rotated Sorted Array

- **Idea:**  
  Use a modified binary search to find the minimum element in a rotated sorted array. Compare the middle element with the rightmost element: if arr[mid] > arr[high], the minimum is in the right half; otherwise it's in the left half (including mid). Handle duplicates by shrinking bounds when low, mid, and high are equal.

- **Time Complexity:** O(log n) on average, O(n) worst-case (when duplicates force linear behavior)
- **Space Complexity:** O(1)

- **Best Use:** Find the smallest element in a rotated sorted array (array originally sorted in ascending order and then rotated).

- **Example:**  
  Input: `arr = [2, 1]`  
  Output: `1`

- **Problem Link:** [LeetCode - Find Minimum in Rotated Sorted Array (153)](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
### 10. Sorted Array Rotation Count

- **Idea:**  
  Find the index of the minimum element using binary search. In a sorted array rotated k times, the index of the smallest element equals the rotation count. Use a modified binary search: compare mid with high to decide which half contains the minimum.

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

- **Best Use:** Determine how many times a sorted array has been rotated (useful for restoring original order or pivot-related problems).

- **Example:**  
  Input: `arr = [4, 5, 6, 1, 2, 3, 4, 5]`  
  Output: `Rotation count = 3` (minimum element `1` is at index 3)

- **Problem Link:** [GeeksforGeeks — Find rotation count in rotated sorted array](https://www.geeksforgeeks.org/write-a-program-to-find-the-number-of-times-a-sorted-and-rotated-array-is-rotated/)
### 11. Single Element in a Sorted Array

- **Idea:**  
  Use binary search on the paired structure. For an array where every element appears exactly twice except one, pairs start at even indices before the unique element and shift after it. At each step, make `mid` even (if needed) and compare `arr[mid]` with `arr[mid+1]`. If they match, the single element is to the right; otherwise it's to the left (including `mid`).

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

- **Best Use:** Find the single non-duplicate element in a sorted array where all other elements appear exactly twice.

- **Example:**  
  Input: `arr = [0, 0, 1, 1, 2, 3, 3]`  
  Output: `2`

- **Problem Link:** [LeetCode - Single Element in a Sorted Array (540)](https://leetcode.com/problems/single-element-in-a-sorted-array/)
### 12. Find Peak Element
- **Idea:**  
  Use binary search to find a peak element in an array where a peak is defined as an element greater than its neighbors. At each step, compare the middle element with its right neighbor: if `arr[mid] < arr[mid + 1]`, the peak lies to the right; otherwise, it lies to the left (including mid).
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
  - **Best Use:** Efficiently find a peak element in an unsorted array.     
  - **Example:**  
  Input: `arr = [1, 2, 3, 1]`  
  Output: `2` (index of peak element `3`)
  - **Problem Link:** [LeetCode - Find Peak Element (162)](https://leetcode.com/problems/find-peak-element/)
