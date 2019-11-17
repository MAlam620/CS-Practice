/**
 * You keep track of two indices. One keeps track of the minimum value so far in the data,
 * and the second is what index you are through your iteration. You go through the entire
 * array, and swap the position of the first element with the position of the minimal value.
 * You do this over and over again through the array, and get the array sorted. Again, this is
 * a nested loop, so time complexity is O(n^2).
 *
 * Only for education.
 */

import java.lang.*;
public class SelectionSort
{
    public static int[] selectionSort(int[] input)
    {
        int length = input.length;
        for(int i = 0; i < length; i++)
        {
            int minIndex = i;
            for(int j = i; j < length; j++)
            {
                if(input[j] < input[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] input ={99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        printArray(selectionSort(input));
    }
}
