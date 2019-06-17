/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class MoveZeroes
{
   /**
    1). Create a variable called startIndex starting at 0.
    2). Check if the value at this index in the array is 0. If it isn't, move the index and i up by one, and repeat 
    this process until a 0 value is found.
    3). Iterate through the array now and see if non-zero is found.
    4). If non-zero found, switch the values at startIndex with i, assign startIndex to i, then go back to step 2.
    */
    
    /**
     * Time complexity is constant O(n), since the entire array is iterated over once only. Space Complexity is O(1),
     * since no new data structure is created for this algorithm.
     */
    public void moveZeroes(int[] nums)
    {
        int startIndex = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[startIndex] != 0)
            {
                startIndex++;
                continue;
            }
            else
            {
                if(nums[i] != 0 && startIndex != i)
                {
                    nums[startIndex] = nums[i];
                    nums[i] = 0;
                    startIndex++;
                }
            }
        }
    }
}