/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
[24, 12, 4, 0]
[0,  1,  2, 6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */

 public class ProductExceptSelf
 {
     /**
      * 1). Create two arrays for left side and right side of size input array.
        2). For the right array, start at the end index but minus one, since there's nothing on the right of the end. For the end
        value, assign 1 as a placeholder. The end value will have 1 as a placeholder. Assign the last value to a product variable. 
        The current index of right array that you are on is assigned this variable.As you iterate backwards, multiple the current 
        value you're on with this variable after assigning. 
        4). Do this for the left array, but in reverse order. 
        5). Now multiply values at each index for the left and right array, which will be your product array.
      */

      /**
       * Space complexity is O(n) for leftArray and O(n) for rightArray, which simplifies to O(n).
       * There are 3 total for loops that iterate over the input length, which is a complexit of O(3n),
       * which simplifies to O(n).
       */
      public int[] productExceptSelf(int[] nums) 
      {
          int[] returnArray = new int[nums.length];
          int[] rightArray = new int[nums.length];
          int[] leftArray = new int[nums.length];
  
          rightArray[nums.length - 1] = 1;
          leftArray[0] = 1;
          int currentProduct = nums[nums.length - 1];
  
          for(int i = nums.length - 2; i >= 0; i--)
          {
              rightArray[i] = currentProduct;
              currentProduct = currentProduct * nums[i];
          }
  
          currentProduct = nums[0];
  
          for(int i = 1; i < nums.length; i++)
          {
            leftArray[i] = currentProduct;
            currentProduct = currentProduct * nums[i];
          }
  
          for(int i = 0; i < returnArray.length; i++)
          {
            returnArray[i] = leftArray[i] * rightArray[i];
          }
          return returnArray;
      }

      /**
       * Space complexity is reduced to O(n), since only the return array is created. This can be considered O(1),
       * since the problem states the return array doens't count towards space complexity. The time complexity is now
       * O(2n) as well, since only 2 for loops are utilized, but this still simplifies to O(n).
       */
      public int[] inPlace(int[] nums)
      {
        int[] returnArray = new int[nums.length];
        returnArray[nums.length - 1] = 1;
        int currentProduct = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--)
        {
            returnArray[i] = currentProduct;
            currentProduct = currentProduct * nums[i];
        }
   
        currentProduct = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            returnArray[i] = returnArray[i] * currentProduct;
            currentProduct = currentProduct * nums[i];
        }
        return returnArray;
      }

    public static void main(String[] args)
    {
      ProductExceptSelf test = new ProductExceptSelf();
      int[] array = {1,2,3,4};
      int []returnArray = test.inPlace(array);

      for(int i = 0; i < returnArray.length; i++)
      {
        System.out.print(returnArray[i] + " ");
      }
    }
 }