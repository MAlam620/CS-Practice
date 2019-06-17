/**
 *Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

o, e, l, l, h
o, l, l, e, h

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

 public class ReverseString
 {
    
    /**
     1). Create a start index variable. Iterate backwards from the end. 
     2). Switch the value of the end variable with the start index.
     3). End variable will update with loop. Increment start variable manually.
     4). Kill loop when start and end variable cross each other.
     */
    public void reverseString(char[] s) 
    {
        /**
         * Time complexity is O(n) since all characters of the input array are analyzed and switched.
         * Space Complexity is O(1), since no new array is created, per the prompt.
         */
        int startIndex = 0;
        for(int i = s.length - 1; i >= 0; i--)
        {
            if(startIndex >= i)
            {
                break;
            }
            char temp = s[i];
            s[i] = s[startIndex];
            s[startIndex] = temp;
            startIndex++;
        }
    }
 }