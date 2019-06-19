/**
 * Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true

Example 2:

Input: [1,2,3,4]
Output: false

Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true


 */

public class ContainsDuplicate
{
    /**
        1). Sort the array in ascending order. 
        2). Iterate through the array, checking the previous value with the one you're on. If they're the same, duplicate exists, so return true.
     */

     /**
        Time Complexity: Sorting takes O(n log n) and the loop takes O(n). The dominant term will be the sorting, so you can simplify the complexity
        to O(n log n).

        Space Complexit: O(1), since we didn't create a new data structure. 
      */
    public boolean sortMethod(int[] nums) 
    {
        Arrays.sort(nums);

        if(nums.length < 2)
        {
            return false;
        }
        int current = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            if(current == nums[i])
            {
                return true;
            }
            current = nums[i];
        }

        return false;
    }   
}