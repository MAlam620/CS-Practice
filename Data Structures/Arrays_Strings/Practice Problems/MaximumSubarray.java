/**
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 */

 /**
  * The algorithm below is called Kadane's Algorithm, and runs in O(n), using Dynamic Programming techniques. Revisit this problem after
  going through that section to better understand it.
  */
import java.util.ArrayList;
public class MaximumSubarray
{
    public int maxSubArray(int[] A) 
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length; i++)
        {
            if (sum < 0)
            {
                sum = A[i];
            } 
                
            else
            {
                sum += A[i];
            } 
                
            if (sum > max)
            {
                max = sum;
            }
               
        }
        return max;
    }

    public static void main(String[] args)
    {
        MaximumSubarray test = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = test.maxSubArray(nums);
        System.out.println(sum);
    }
}