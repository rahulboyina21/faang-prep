// package faang-prep.java.arrays;
import java.util.*;
public class productofarrayexself {

        public static int[] productExceptSelf(int[] nums) {
            
            // Brain stroming time 
    
            /* 
                Mighty Algo monstor will mix all the elements as dough in the bakery and remove the items in the dough like i remove star shape from the dough if i am using the star mold as i am going to get the same star there so.
    
                1. Multiply all the elements while doing keep few things in mind
                a)number of zero's if there is only one zero then it alone get's the only value if there are multiple zero's none get any value.
                b)if there are -ve elements then value doesn't change only sign does 
                op is -ve and current element is -ve(Encountered odd -ve's) make it positive
                op is +ve and current element is -ve(Encountered even -ve's) make it negative 
            */
    
            // Boolean foundZero=false;
    
            // int arraySize=nums.length;
    
            // if(arraySize == 1 ) return nums;
    
            // if(arraySize == 0 ) throw new IllegalArgumentException("Invalid number of args");
    
            // int zeroCounter=0,productAll=1,zeroIndex=-1;
            // for(int i=0;i<arraySize;++i)
            // {
            //     int value=nums[i];
    
            //     if(value==0) 
            //     {
            //         ++zeroCounter;
            //         zeroIndex=i;
            //     }
            //     else
            //     {
            //         productAll*=value;
            //     }
            //     if(zeroCounter>1) return new int[nums.length];
            // }
            // if(zeroCounter!=0)
            // {
            //     Arrays.fill(nums,0);
            //     nums[zeroIndex]=productAll;
            //     return nums;
            // }
            // for(int i=0;i<arraySize;++i)
            // {
            //         int updatedValue=productAll/nums[i];
            //         nums[i]=updatedValue;
            // }
            // return nums;
    
            /*
            I got the feedback saying this is not what we wanted to achieve many times we are not math matically leniant in any math expression but we do more on the thinking in terms logical framework 
            i got the input to use the prefix and postfix to calculate this let's understand 
    
            1. prefix till element x
            2. postfix reverse from the end element to the actual element
            // in both the pre and post fix we are excluding the current element in the calucaltion
            3. Now multiply both of the values then we have the summation.
             */
    
            final int arraySize=nums.length;
    
            if(arraySize == 1 ) return nums.clone();
    
            if(arraySize == 0 ) throw new IllegalArgumentException("Invalid number of args");
    
            int zeroCounter=0,zeroIndex=-1,prefixVariable=1,postfixVariable=1,productAll=1;
            Boolean flag=false;
            final int[] prepostfix = new int[arraySize];
    
            for(int i=0;i<arraySize;++i)
            {
                int value=nums[i];
    
                if(value==0) 
                {
                    ++zeroCounter;
                    zeroIndex=i;
                    flag=!flag;
                }
                else productAll*=value;
                if(!flag)
                {
                    prepostfix[i]=prefixVariable;
                    prefixVariable*=value;
                }
                if(zeroCounter>1) return new int[nums.length];
            }
            if(zeroCounter!=0)
            {
                Arrays.fill(nums,0);
                nums[zeroIndex]=productAll;
                return nums;
            }
            for(int i=arraySize-1;i>=0;--i)
            {
                prepostfix[i]*=postfixVariable;
                postfixVariable*=nums[i];
            }
            return prepostfix;
    
    
        }
    
        public static void main(String args[])
        {
            int[][] inputs = { {1,2,3,4}, {4,5,1,8,2}, {0,1,2,3,4}, {2,0,4,0}, {-1,1,0,-3,3}, {10}, {-2,-3,-4,-5}, {1,1,1,1}, {100000,10000,10,1}, {Integer.MIN_VALUE, 2, -3} };

            for (int[] arr: inputs)
            {
                int[]res=productExceptSelf(arr);
                for(int x:res)
                {
                    System.out.print(x+" , ");
                }
                System.out.println();
            }
        }

}