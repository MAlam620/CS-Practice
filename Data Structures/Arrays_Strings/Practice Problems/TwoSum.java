/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

 public class TwoSum
 {
    /**
     * 1). First sort the array using Merge Sort.
     * 2). Create two indexes, one at the start and one at the end of the array.
     * 3). Sum the values in the given array at these indexes, then compare to the target.
     * 4). If value is less than target, increment by 1 the smaller index. Go back to step 3.
     * 5). If value is larger than target, decrement by 1 the larger index. Go back to step 3.
     * 6). If sum is found, return the indices. 
     * 7). If indices equal each other at any point, then the sum does not exist. 
     */

     /**
      * The merge sort has a time complexity of O(n log(n)) and space complexity of O(n). 
      The algorithm I used iterates over the entire given array once at most, which results
      in a time complexity of O(n). Therefore, total time complexity is O(n log(n) + n), which
      is simplified to O(n log(n)). For space complexity, only the return array of size 2 is created,
      which is negligible. Therefore, the space complexity remains at O(n). Can use hashmaps to optimize
      later to O(n).
      */
    public int[] twoSum(int[] nums, int target) 
    {
        int[] indices = new int[2];

        //Sort the given array using merge sort. O(nlog(n)). Space complexity is O(n)
        TwoSum obj = new TwoSum();
        obj.sort(nums, 0, nums.length - 1);

        int startIndex = 0;
        int endIndex = nums.length - 1;

        while(startIndex != endIndex)
        {
            int firstValue = nums[startIndex];
            int secondValue = nums[endIndex];
            int sum = firstValue + secondValue;

            if(sum == target)
            {   
                indices[0] = startIndex;
                indices[1] = endIndex;
                return indices;
            }
            else if(sum < target)
            {
                startIndex++;
            }
            else if(sum > target)
            {
                endIndex--;
            }
        }
        return indices;
    } 

    public void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
 }