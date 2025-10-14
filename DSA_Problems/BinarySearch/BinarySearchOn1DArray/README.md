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
