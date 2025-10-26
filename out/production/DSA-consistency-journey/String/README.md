### 1️⃣ Last Word Length

- **Idea:**  
  Scan the string from the end, skip trailing spaces, then count characters until the next space or start of string. This returns the length of the last word without extra allocations.

- **Time Complexity:** O(n) (single pass from end)
- **Space Complexity:** O(1)

- **Best Use:** Find the length of the last word in a string that may contain trailing spaces.

- **Example:**  
  Input: `s = "Hello World       "`  
  Output: `5`

- **Problem Link:** [LeetCode - Length of Last Word](https://leetcode.com/problems/length-of-last-word/)
