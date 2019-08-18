package com.hash.problems;

import java.util.*;

/**
 * Given an array A of integers, return the number of (contiguous, non-empty) subarrays that have a sum divisible by K.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [4,5,0,-2,-3,1], K = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by K = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 */
public class SubarraySumsDivisbleByK
{
    /**
     *Build a partial sum array. This is an array which sums up all array values up until
     * the current index. Notice that in order to get the sum of a particular subarray, you
     * can use subtraction to get it.
     *
     * givenArray = {2, 5, 1, 3, 4, 8} K = 3
     *
     * sumArray = {2, 7, 8, 11, 15, 23}
     *
     * If we want the sum of givenArray[2 - 5], we simply need to subtract givenArray[0-5] by givenArray[0-1].
     * With our sumArray, this is sumArray[5] - sumArray[1].
     *
     * For our problem, we want divisible by K, which in other words means the remainder after division is 0.
     * Modify the sumArray, by using modulo operator on each entry, dividing each number by K. Now, sumArray is
     * really a remainderArray.
     *
     * remainderArray = {2, 1, 2, 2, 0, 2}
     *
     * Now, you want to see where the remainder is 0, which means the value is divisible by K. We see a 0 in our array,
     * which means that the sum of values until that index will be divisible by 3 (0 - 4). First check is to see if 0 is
     * present. We also use our trick of subtraction from above, by looking at remainders that equal each other. If we
     * take a right remainder, and subtract away the same remainder from the left, the subarray in the middle will have
     * a remainder of 0. For example, remainderArray[2] - remainderArray[0] gives us 0. So, remainderArray[1-2] is a
     * valid subarray.
     */
    public int subarraysDivByK(int[] A, int K)
    {
        if (A == null || A.length == 0)
        {
            return 0;
        }

        Map<Integer, Integer> modToCount = new HashMap<>();
        int result = 0;
        modToCount.put(0, 1);
        int prefixSum = 0;


        for (int i = 0; i < A.length; i++)
        {
            prefixSum = (prefixSum + A[i]) % K;
            if (prefixSum < 0) //If prefixSum is a negative value, have to adjust modulo operator.
            {
                prefixSum += K;
            }
            int count = modToCount.getOrDefault(prefixSum, 0);
            result += count;
            modToCount.put(prefixSum, count + 1);
        }

        return result;

    }

    public static void main(String[] args)
    {
        int sum = 0;
        int []test = {-1, -9, -4, 0};
        for(int i = 0; i < test.length; i++)
        {
            sum += test[i];
            int remainder = ((sum % 9) + 9) % 9;
            System.out.println(remainder);
        }
    }

}
