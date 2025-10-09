

# Problem Log

Track every solved problem here. Add a new row each time you solve something.

| Date       | Topic   | Problem   | Platform | Link                                         | Approach                  | Time | Notes                     |
|------------|---------|-----------|----------|---------------------------------------------|---------------------------|------|---------------------------|
| 2025-10-03 | Arrays  | Two Sum   | LeetCode | https://leetcode.com/problems/two-sum/      | HashMap (num -> index)    | 12m  | Watch out for duplicates |
| 2025-10-03 | Arrays  | besttimetobuyandsellstock   | LeetCode | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/      | track and update the min and max value    | 18m  | update min before calculating the max |
| 2025-10-03 | Arrays  | Maximum Subarray | LeetCode | https://leetcode.com/problems/maximum-subarray/ | Kadane's algorithm (rolling max) | 48m   | reset running sum think in terms of graph and reset whenever hit below zero the total sum |
| 2025-10-04 | Arrays  | Contains Duplicate | LeetCode | https://leetcode.com/problems/contains-duplicate/ | HashSet (short-circuit on seen values) | 42m   | can use bitset / hashset / streams -> sets compare the size with array to validate duplicates |
| 2025-10-04 | Arrays  | Product of Array Except Self | LeetCode | https://leetcode.com/problems/product-of-array-except-self/ | Prefix & suffix products (O(1) extra space) | 54m   | build left prefix, right suffix, multiply into result |
| 2025-10-09 | Strings | Longest Substring Without Repeating Characters | LeetCode | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Sliding window with last seen index map | 37m | jump left pointer past duplicates for O(n) scan + multiple ways of doing it more like a thought before jumping to well rounded ds try if there exist a basic alt with basic ds as that could enhance the execution |
