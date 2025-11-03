
### 1️⃣ Find Square Root of a Number (Integer Square Root)

- Idea: Use binary search to compute floor(sqrt(n)). For n < 2 return n. Otherwise search in [1, n/2], check mid*mid <= n using a wider type (long) to avoid overflow, move bounds accordingly and return the last valid mid.
- Time Complexity: O(log n)
- Space Complexity: O(1)
- Example:  
  Input: n = 8  
  Output: 2
- Problem Link / Reference: LeetCode 69 - https://leetcode.com/problems/sqrtx/
