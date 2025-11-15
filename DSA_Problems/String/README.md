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
### 2️⃣ Reverse String
- **Idea:**  
  Use two pointers, one at the start and one at the end of the string. Swap characters at these pointers and move them towards each other until they meet.
  - **Time Complexity:** O(n) (single pass)
  - **Space Complexity:** O(1) (in-place)
  - **Best Use:** Reverse a string in place without using extra space.
  - **Example:**  
    Input: `s = ["h","e","l","l","o"]`  
    Output: `["o","l","l","e","h"]`
  - **Problem Link:** [LeetCode - Reverse String](https://leetcode.com/problems/reverse-string/)