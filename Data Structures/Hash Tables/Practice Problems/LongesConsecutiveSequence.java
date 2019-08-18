package com.hash.problems;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * Your algorithm should run in O(n) complexity.
 *
 * Example:
 *
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */

import java.util.HashMap;
import java.util.*;

public class LongesConsecutiveSequence
{
    /**
     Create an empty hash.
     Insert all array elements to hash.
     Do following for every element arr[i]
     Check if this element is the starting point of a subsequence. To check this, we simply look for arr[i] – 1 in the
     hash, if not found, then this is the first element a subsequence.
     If this element is the first element, then count number of elements in the consecutive starting with this element.
     Iterate from arr[i] + 1 till the last element that can be found.
     If the count is more than the previous longest subsequence found, then update this.
     */
    public int longestConsecutive(int[] nums)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        // Hash all the array elements
        for (int i = 0; i < nums.length; i++)
        {
            S.add(nums[i]);
        }

        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<nums.length; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(nums[i]-1))
            {
                // Then check for next elements in the
                // sequence
                int j = nums[i];
                while (S.contains(j))
                    j++;

                // update  optimal length if this length
                // is more
                if (ans<j-nums[i])
                    ans = j-nums[i];
            }
        }
        return ans;
    }
}
