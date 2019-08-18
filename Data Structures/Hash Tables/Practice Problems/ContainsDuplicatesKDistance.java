import java.util.HashMap;

/**
 Given an unsorted array that may contain duplicates. Also given a number k which is smaller than size of array.
 Write a function that returns true if array contains duplicates within k distance.
 Examples:
 Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
 Output: false
 All duplicates are more than k distance away.

 Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
 Output: true
 1 is repeated at distance 3.

 Input: k = 3, arr[] = {1, 2, 3, 4, 5}
 Output: false

 Input: k = 3, arr[] = {1, 2, 3, 4, 4}
 Output: true
 */
public class ContainsDuplicatesKDistance
{
    public static boolean duplicates(int[] arr, int k)
    {
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], i);
            }
            else
            {
                int index = map.get(arr[i]);
                if((i - index) <= k)
                {
                    return true;
                }
                else
                {
                    map.put(arr[i], i);
                }
            }
        }
        return false;
    }
