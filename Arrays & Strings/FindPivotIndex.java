/**
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

public class FindPivotIndex{

    public int pivotIndex(int[] nums){
        
        int arraySize = nums.length;
        //If the size of the array is equal to 0,1, or 2, can't have a pivot with a number both on left and right of pivot.
        if(arraySize < 3){
            return -1;
        }
        int[] leftArray = new int[arraySize];
        int[] rightArray = new int[arraySize];
        leftArray[0] = 0;
        rightArray[arraySize - 1] = 0;
        int sum = 0;
        int currentNumber = 0;

        //Build array with values of each index being summation of all right-hand entries.
        for(int i = arraySize - 2; i >= 0; i--){

            if(i == arraySize - 2){
                currentNumber = nums[i]; 
                sum = nums[arraySize - 1];
                rightArray[i] = sum;
            }
            else{
                sum += currentNumber;
                rightArray[i] = sum;
                currentNumber = nums[i];
            }
        }

        //Build array with values of each index being summation of all left-hand entries.
        for(int i = 1; i < arraySize; i++){
            //Only one element on the left, so simple assignment
            if(i == 1){
                currentNumber = nums[i];
                sum = nums[0];
                leftArray[i] = sum;
            }
            else{
                sum += currentNumber;
                leftArray[i] = sum;
                currentNumber = nums[i];
            }
        }

        //Run comparison here. If index values are same, we found our index, from left-most index.
        for(int i = 0; i < arraySize; i++){
            if(leftArray[i] == rightArray[i]){
                return i;
            }
        }
        return -1;
    }
}