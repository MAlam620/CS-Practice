/**
 * You take two elements at a time and compare them. If the item on the left is bigger
 * than the item on the right, swap the two. Go through the array by comparing two at
 * a time, and you will put the largest item in the array at the end. Now loop through again
 * and repeat, ignoring the last item since it's already sorted. Essentially, you compare adjacent values,
 * and swap if necessary. This is a nested loop, so
 * the time complexity is O(n^2).
 *
 * Almost never use, for education only.
 */

public class BubbleSort
{
    public static int[] bubbleSort(int[] array)
    {
        int length = array.length;
        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] input ={99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        input = bubbleSort(input);

        for(int i = 0; i < input.length; i++)
        {
            System.out.println(input[i]);
        }
    }
}
