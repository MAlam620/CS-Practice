/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */

public class RemoveDuplicates
{
    /**
     1). Assign the initial value to a variable.
     2). Create a varible keeping track of the index where replacements happen, with index starting at 1.
     3). As you iterate check if current value is equal to the initial value variable.
     4). If no, assign this value you are on to the index position, increment index by 1, and assign this value to 
     initial value variable.
     5). Total length will be the index.
     */
    public int removeDuplicates(int[] nums) 
    {
        /**
         * Time complexity is O(n), since entire input is iterated over once with a for loop.
         * Space complexity is O(1), since only replacement of values within the original arrays happen.
         * No new array is created.
         */
        if(nums.length < 1)
        {
            return 0;
        }

        int initialValue = nums[0];
        int index = 1;
       
        for(int i = 1; i < nums.length; i++)
        {
            if(!(nums[i] == initialValue))
            {
                nums[index] = nums[i];
                initialValue = nums[i];
                index++;
            }
        }
        return index;
    }
}
