/**
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in 
ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:

Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Note:

    Then length of the input array is in range [1, 10,000].
    The input array may contain duplicates, so ascending order here means <=.

 */

public class ShortestContinuousSubarray
{
    /**
     1). Create a variable to keep track of the maximum value in the array.
     2). Iterate and see if current value you're on is less than the maximum. If so, this means at this index,
     the array is out of order. Use a 'right' index variable to keep track of where this maximum is located.
     3). Now do this in reverse to find the minimum value. 
     4). This process gives you the bounds on the subarray to be sorted. The return is right - left + 1.
     */

     /**
        Time Complexity: Sorting take O(2n) since we loop over the input twice, which is simplified to O(n)

        Space Complexity: O(1), since no new data structure needed to be created, just variable assignments. 
      */
    public int findUnsortedSubarray(int[] nums) 
    {
        int maximum = nums[0];
        int minimum = nums[nums.length - 1];
        int left = -1;
        int right = -1;

        for(int i = 0; i < nums.length; i++)
        {
            maximum = Math.max(maximum, nums[i]);
            if(nums[i] < maximum)
            {
                right = i;
            }
            System.out.println(right);
        }

        for(int i = nums.length - 1; i >= 0; i--)
        {
            minimum = Math.min(minimum, nums[i]);
            if(nums[i] > minimum)
            {
                left = i;
            }
        }

        if(right == -1)
        {
            return 0;
        }
        return right - left + 1;

    }

    public static void main(String[] args)
    {
        ShortestContinuousSubarray test = new ShortestContinuousSubarray();
        int[] testArray = {1,5,4,3,2,7};

        int result = test.findUnsortedSubarray(testArray);
        System.out.println(result);
    }

}