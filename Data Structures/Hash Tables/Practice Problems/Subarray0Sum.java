package com.hash.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
 * Examples :
 *
 * Input: {4, 2, -3, 1, 6}
 * Output: true
 * There is a subarray with zero sum from index 1 to 3.
 *
 * Input: {4, 2, 0, 1, 6}
 * Output: true
 * There is a subarray with zero sum from index 2 to 2.
 *
 * Input: {-3, 2, 3, 1, 6}
 * Output: false
 * There is no subarray with zero sum.
 */
public class Subarray0Sum
{
    /**
     * Add sum seen so far in an array in a set. If a sum repeats itself, that means the array contains
     * a subarray whose sum is 0. This means that the sum of the array between these repetitions is 0, hence
     * we return true. For example, take this array:
     * {4, 2, -3, 1, 6}
     * The sums at the current point are:
     * {4, 6, 3, 4, 6}
     * We also return 0 if the current index element is itself 0, or the current sum we're keeping track of is 0.
     */
    public boolean subarray(int[] nums)
    {
        int currentSum = nums[0];
        Set<Integer> sums = new HashSet<>();
        sums.add(currentSum);
        for(int i = 1; i < nums.length; i++)
        {
            currentSum += nums[i];
            if(sums.contains(currentSum) || nums[i] == 0 || currentSum == 0)
            {
                return true;
            }

        }

        return false;
    }

}
