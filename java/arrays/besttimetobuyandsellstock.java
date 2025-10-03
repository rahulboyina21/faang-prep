// package faang-prep.java.arrays;
import java.util.*;
public class besttimetobuyandsellstock {
    // Problem: Best Time to Buy and Sell Stock (LeetCode #121)
    // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    // Difficulty: Easy
    // Approach: track min price -> update the max profit by constant comparision with the minimum value in the time line prior.
    // Time: O(n)
    // Space: O(n)
    public static int maxProfit(int[] prices) {
        int minPrice=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;++i)
        {
            // Initial Approach 
            // int temp=prices[i]-minPrice;
            // if(temp<0)
            // {
            //     minPrice=prices[i];
            // }
            // else if(temp>profit)
            // {
            //     maxProfit=temp;
            // }

            // Refined 

            if(prices[i]<minPrice) minPrice=prices[i];
            else
            {
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String args[])
    {
        int[] prices = {12,1,24,45,7,843,48,48,79,3};
        int result = maxProfit(prices);
        System.out.println("Max Profit is "+result);
    }
}
