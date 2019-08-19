/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

length = 7

Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */

/**
 * Algorithm:
 * 1). Loop over array, starting at k at and going to end, adding these values to a temp array.
 * 2). Loop again, and store the current value in temp variable, and replace with 
 */
 public class RotateArray
 {
    public void rotate(int[] nums, int k) 
    {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = a[i];
        }
    }
    
    public static void main(String[] args)
    {
        RotateArray test = new RotateArray();
        int[] temp = {1,2,3,4,5,6,7};
        test.rotate(temp, 3);
    }
 }