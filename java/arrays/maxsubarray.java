// package faang-prep.java.arrays;



public class maxsubarray {

// Think like we are seeing the peaks in the graph for each step in x axis 

// APPROACH 01 -> Brute force with partial improvements

/*
        public static int maxSubArray(int[] nums) {

            if (nums == null || nums.length == 0)
            {
                throw new IllegalArgumentException("Input array must not be empty");
            }

            int sum=nums[0],maxsum=nums[0];

            // inital step itself be the peak as there are no elements to compete in 1st iteration
    
            for(int i=1;i<nums.length;++i)
            {
                // If we encounter a new value which is greater than previous value generally 
                // we add it to the chain but it takes into -ve scale we need to discard and start fresh that's what we are doing here
                if(nums[i]>sum && sum<0)
                {
                    sum=nums[i];    
                }
                else
                {
                    sum+=nums[i];
                }
                // each step we compare is it the max so far if yes then yeah it's the max subarray 
                maxsum=Math.max(maxsum,sum);

            }
    
            return maxsum;
        }

*/

// Approach 02 : Let's apply kandane's algorithm as it mainly revolves arround choosing the best item so far while performing
// operation like max / min or etc ... 

public static int maxSubArray(int[] nums) 
{
    int current_max=0,global_max=nums[0];
    for(int val:nums)
    {
        /*
         in the below step either we will find the value which can added as a link to the chain of element's we have added or 
         it will act as a breaking point(when it tends to descent the value even by a fraction then we consider the max portion so far and exclude the change)
         THE KEY IS THAT CURRENT VALUE ALWAYS MUTATES TO STAND OUT OR BREAK FALL GIVING RISE TO NEW VALUE AS THE STARTING POINT OF THE NEW CHAIN

         */
        current_max=Math.max(current_max+val,val);

        // We might compare segments of array or whole array in the above step 

        global_max=Math.max(current_max,global_max);

        // The above step tells us what's the max segment which standsout as the max-subarray which undergoes constant comparision with current maximum


    }
    return global_max;
}

    public static void main(String args[])
    {
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{0, -1}) + " (Expected: 0)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{-2, -1}) + " (Expected: -1)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{1, -1}) + " (Expected: 1)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{-1, -2}) + " (Expected: -1)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{122, 123}) + " (Expected: 245)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{-99, 98}) + " (Expected: 98)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{2, -1}) + " (Expected: 2)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{-99, -1}) + " (Expected: -1)");
        System.out.println("The Max Sub Array is = " + maxSubArray(new int[]{}) + " (Expected: Exception)");
    }
    
}
