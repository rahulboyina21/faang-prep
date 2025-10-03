import java.util.*;

public class twosum {
    // Problem: Two Sum (LeetCode #1)
    // Link: https://leetcode.com/problems/two-sum/
    // Difficulty: Easy
    // Approach: HashMap (num -> index)
    // Time: O(n)
    // Space: O(n)
    public static int[] twosum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;++i)
        {
            int compliment = target - nums[i];
            if(mp.containsKey(compliment))
            {
                return new int[]{mp.get(compliment),i};
            }
            else
            {
                mp.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String args[])
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twosum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}