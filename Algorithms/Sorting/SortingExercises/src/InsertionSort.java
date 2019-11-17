/**
 * This sort is good when the list is already almost sorted. You can almost
 * get linear time for this. The strategy is the same one you use when sorting
 * cards in your hand.
 *
 * 1). Work left to right.
 * 2). Examine each item and compare it to the items on the left.
 * 3). Insert the item in the correct position in the array.
 *
 * Easy to implement. Use when data is already mostly sorted.
 */
public class InsertionSort
{
    public static int[] insertionSort(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int key = array[i];
            int j = i - 1;

            /*
            Move elements of array[0...i - 1], that are greater than the key,
            to one position ahead of their current position
             */

            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
