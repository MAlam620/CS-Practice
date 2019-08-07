/** PROMPT
Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000]

Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.

Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
 */

 /**----------------------------------------------SOLUTION ----------------------------------------------
  
  * The strategy is to build 2 arrays, one left, and one right. At each index of the given array, compute the sum of values on the left hand side,
  up until that point, and put this sum at the corresponding index in the left array. Do the same with the right array. The first value of the left
  array will be 0, since nothing is to the left of this index. Same with the end value of the right array. After you've built the arrays, just loop 
  one more time, and check each index of both arrays and see if the values at both indices equal each other. If yes, you have your index. If loop is done,
  and no match is found, then your answer is -1.

  * 1). When constructing the left array, the first entry is 0, since nothing is on the left side. Same with the right array, but the end index.
    2). Build left array - Start by having a currentSum variable, that keeps track of the sum of all numbers to the left of the current index you're on.
    The currentSum initally is assigned nums[0], since we start at index 1, and there's only nums[0] to the left of that. 
    3). Now loop over nums, starting at index 1. Assign the current index the value in currentSum. After, update currentSum by whatever number currenSum is right now,
    plues the value at the index you're on in nums right now, to prepare for the next iteration. 
    4). Do the same for the right array, but now in reverse order. 
    5). Compare values at each index of each array, and if the values at the index equal each other, you have your answer. 
    6). If no matches found, return -1.
  */
  public class FindPivot2
  {
      public static int pivotIndex(int[] nums)
      {
          //If the size of the array is equal to 0,1, or 2, can't have a pivot with a number both on left and right of pivot.
          if(nums.length < 3)
          {
              return -1;
          }
          int[] leftArray = new int[nums.length];
          int[] rightArray = new int[nums.length];
          int pivot = -1;
          
          leftArray[0] = 0;
          rightArray[rightArray.length - 1] = 0;
          
          int currentSum = nums[0];
          
          //Building left array
          for(int i = 1; i < nums.length; i++)
          {
              leftArray[i] = currentSum;
              currentSum += nums[i];
          }
          
          currentSum = nums[nums.length - 1]; //Reassign current sum but for the right hand side.

          //Building Right array.
          for(int i = nums.length - 2; i >= 0; i--)
          {
              rightArray[i] = currentSum;
              currentSum += nums[i];
          }
          
          //Making Comparison.
          for(int i = 0; i < nums.length; i++)
          {
              if(rightArray[i] == leftArray[i])
              {
                  pivot = i;
                  return pivot;
              }
          }
  
          return pivot;
      }
  
      public static void main(String[] args)
      {
          int[] test = {1, 7, 3, 6, 5, 6};
          int result = pivotIndex(test);
        
          System.out.println(result);
          
      }
  
  }
