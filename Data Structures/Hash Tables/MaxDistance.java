/**
 * Given an array with repeated elements, the task is to find the maximum distance two occurrences of an element.
 * Examples:
 * Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
 * Output: 10
 * // maximum distance for 2 is 11-1 = 10 
 * // maximum distance for 1 is 4-2 = 2 
 * // maximum distance for 4 is 10-5 = 5 
 */

import java.util.HashMap;

public class MaxDistance
{
    public static int maxDistance(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int highestNumber = 0;

        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], i);
            }
            else
            {
                int distance = i - map.get(arr[i]);
                if(distance > highestNumber)
                {
                    highestNumber = distance;
                }
            }
        }
        return highestNumber;
    }
}
