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
  ### 3️⃣ Valid Anagram
- **Idea:**  
  Use a frequency array of size 26 to count occurrences of each character in both strings. Decrement counts for the second string and check if all counts are zero.
  - **Time Complexity:** O(n) (single pass through both strings)
  - **Space Complexity:** O(1) (fixed size array)
  - **Best Use:** Check if two strings are anagrams of each other efficiently.
  - **Example:**  
    Input: `s = "anagram", t = "nagaram"`  
    Output: `true`
  - **Problem Link:** [LeetCode - Valid Anagram](https://leetcode.com/problems/valid-anagram/)
## 4️⃣ Implement strStr()
- **Idea:**  
  Use a sliding window approach to check each substring of `haystack` that matches the length of `needle`. Compare characters one by one.
  - **Time Complexity:** O(n*m) (where n is length of haystack and m is length of needle)
  - **Space Complexity:** O(1)
  - **Best Use:** Find the first occurrence of a substring within another string.
    - **Example:**  
      Input: `haystack = "hello", needle = "ll"`  
      Output: `2`
    - **Problem Link:** [LeetCode - Implement strStr()](https://leetcode.com/problems/implement-strstr/)
  ## 5️⃣ Count and Say
- **Idea:**  
  Build the sequence iteratively by reading the previous term and counting consecutive digits.
  - **Time Complexity:** O(n * 2^n) (due to string construction)
  - **Space Complexity:** O(2^n) (for storing the sequence)
  - **Best Use:** Generate the nth term of the count-and-say sequence.
    - **Example:**  
      Input: `n = 4`  
      Output: `"1211"`
    - **Problem Link:** [LeetCode - Count and Say](https://leetcode.com/problems/count-and-say/)