/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

 public class PlusOne
 {
    public int[] plusOne(int[] digits) 
    {
        int lastValue = digits[digits.length - 1];//Last value in array.
        int plusOne = lastValue + 1;
     
        if(plusOne <= 9)
        {
            digits[digits.length - 1] = plusOne;
            return digits;
        }
        else
        {
            int firstValue = digits[0];

            if(lastValue == 9)
            {
                if(firstValue == 9)
                {
                    int[] returnArray = new int[digits.length + 1];
                    returnArray[0] = 1;
    
                    for(int i = 1; i < returnArray.length; i++)
                    {
                        returnArray[i] = 0;
                    }
                    return returnArray;
                }
                else
                {
                    for(int i = digits.length - 1; i >= 0; i--){
                        if(digits[i] == 9){
                            digits[i] = 0;
                        }
                        else{
                            digits[i] = digits[i] + 1;
                            break;
                        }
                    }
                } 
            }
           
            return digits;
         }
    
    }
 }