/*
Given two sorted integer arrays, merge them into a new array,
such that this new array is also sorted. 
*/

/**
 * 1). Create a for loop that iterates over the length of the return array.
 * 2). Start with two indexes that start at the first value of each array respectively.
 * 3). Now create an index to loop over the entire return array. 
 * 4). Compare the values at both indices of the input arrays, and see which one is smaller. 
 * 5). Add the value of the smaller index to the return array. 
 * 6). Increment the index of the array where the index was smaller, and the index of the return array.
 * 7). If it's a tie, add both values to the return array. Increment input array indices by 1, and return's by 2.
 * 8). Put in a check for seeing if an index has reached the end of an array.
 */

 /**
  * Time complexity here is O(n + m), where n and m correspond to the lengths of
  the two input arrays. The loop will iterate through the lenght of the returnArray,
  which is equal to n + m. The space complexity is O(n + m) as well, since we create
  a new array of size n + m to return from the method.
  */
public class MergeSortedArrays
{
    public static int[] merge(int[] array1, int[] array2)
    {
        int[] returnArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < returnArray.length; i++)
        {
            if(index1 == array1.length || index2 == array2.length)
            {
                if(index1 == array1.length)
                {
                    returnArray[i] = array2[index2];
                    index2++;
                }
                else if(index2 == array2.length)
                {
                    returnArray[i] = array1[index1];
                    index1++;
                }
            }
            else
            {
                if(array1[index1] < array2[index2])
                {
                    returnArray[i] = array1[index1];
                    index1++;
                }
                else if(array1[index1] > array2[index2])
                {
                  returnArray[i] = array2[index2];
                 index2++;
                }
                else if(array1[index1] == array2[index2])
                {
                    returnArray[i] = array1[index1];
                    returnArray[i + 1] = array2[index2];
                    index1++;
                    index2++;
                    i++;
                }
            }
            
        }
        return returnArray;
    }

    public static void main(String[] args)
    {
        int []array1 = {0,3,4,31};
        int []array2 = {4,6,30};
        int []newArray = merge(array1,array2);
        System.out.print("[");
        for(int i = 0; i < newArray.length; i++)
        {
            if(i == newArray.length - 1)
            {
                System.out.print(newArray[i]);
            }
            else
            {
                System.out.print(newArray[i] + ", ");
            } 
        }
        System.out.print("]");
    }
}