/**
 * Given an array of numbers, find the maximum sum of any contiguous
 * subarray of the array. For example, given the array [34, -50, 42, 14, -5, 86]
 * the maximum sum would be 137, since we would take elements 42, 14, -5, and 86. Given the
 * array [-5, -1, -8, -9], the maximum sum would be 0, since we choose not to take 
 * any elements. 
 * 
 * Do this in O(n) time.
 * 
 * Follow-up: What if the elements can wrap around? FOr example, given
 * [8, -1, 3, 4], return 15, as we choose the numbers 3, 4, and 8 where the 8
 * is obtained from wrapping around.
 */

 /**
  * Algorithm
  1). Iterate over the array and find the indices of all positive values.
  2). 
  */

import java.util.ArrayList;
 public class MaximumSubarray
 {
    public int maxSubArray(int[] nums)
    {
       ArrayList<Integer> indices = new ArrayList<Integer>();

       if(nums.length == 0)
       {
           return 0;
       }
       int minimumValue = nums[0];
       for(int i = 0; i < nums.length; i++)
       {
           if(nums[i] >= 0)
           {
               indices.add(i);
           }
           minimumValue = Math.min(minimumValue, nums[0]);
       }
       System.out.println(indices.size() + ":)");
       if(indices.size() <= 1)
       {
           return minimumValue;
       }
       
       
       int totalSum = indices.get(0);     
       int currentSum = 0;
       for(int i = indices.get(0); i < indices.get(indices.size()-1); i++)
       {
           currentSum = currentSum + nums[i];
           currentSum = Math.max(currentSum, 0);
           totalSum = Math.max(totalSum, currentSum);
       }
       
       return totalSum;   
    }

    public static void main(String[] args)
    {
        MaximumSubarray test = new MaximumSubarray();
        int[] array = {-2,1};
        int dummy = test.maxSubArray(array);
        System.out.println(dummy);
    }
 }