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
     1). Create a copy of the input array
     2). Sort this copy.
     3). Now loop and compare the copy and the original. You can determine the left and righmost elements where mismatches occur. 
     The subarray between these indices is the subarry.
     */

     /**
        Time Complexity: Sorting take O(n log n) and the for loop adds to the O(n). Since O(n log n) is the dominant term,
        simplify to O(n log n).

        Space Complexity: You need to create a copy of the original, so O(n). 
      */
    public int findUnsortedSubarray(int[] nums) 
    {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = nums.length;
        int end = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        if((end - start) > 0)
        {
            return (end - start + 1);
        }
        else
        {
            return 0;
        }

    }

}