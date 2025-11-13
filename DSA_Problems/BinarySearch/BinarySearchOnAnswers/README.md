
### 1️⃣ Find Square Root of a Number (Integer Square Root)

- Idea: Use binary search to compute floor(sqrt(n)). For n < 2 return n. Otherwise search in [1, n/2], check mid*mid <= n using a wider type (long) to avoid overflow, move bounds accordingly and return the last valid mid.
- Time Complexity: O(log n)
- Space Complexity: O(1)
- Example:  
  Input: n = 8  
  Output: 2
- Problem Link / Reference: LeetCode 69 - https://leetcode.com/problems/sqrtx/
### 2️⃣ Find the Smallest Divisor Given a Threshold
- Idea: Use binary search on the range [1, max(nums)] to find the smallest divisor such that the sum of ceil(nums[i]/divisor) is <= threshold. For each mid divisor, compute the sum and adjust bounds accordingly.
- Time Complexity: O(n log m) where m is the max element in nums
- Space Complexity: O(1)
- Example:  
  Input: nums = [1,2,5,9], threshold = 6  
  Output: 5
- Problem Link / Reference: LeetCode 1283 - https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/