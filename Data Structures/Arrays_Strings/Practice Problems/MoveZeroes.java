public class MoveZeroes
{
    /**
     * 1). Create an index variable that references the last element of the given array.
     * 2). If last element is already 0, loop backwards until a non-zero element is found, and then assign that index to this variable.
     * 3). Using a for loop, iterate from the start of the array, until a 0 is found. If a 0 is found, switch the value at the current index
     * with the index created in step 1, and decrement the end index by 1. Again, if this is non-zero, repeat step 2.
     * 4). When the end index crosses with the for loop index, that means we have iterated over the entire array, so the algorithm should conclude.
     */
    public void moveZeroes(int[] nums)
    {
        int lastIndex = nums.length - 1;

        if(nums[lastIndex] == 0)
        {
            for(int i = lastIndex - 1; i >= 0; i--)
            {
                if(nums[i] != 0)
                {
                    lastIndex = i;
                    break;
                }
            }
        }

        for(int i = 0; i < lastIndex; i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[lastIndex];
                nums[lastIndex] = 0;
                lastIndex--;

                if(nums[lastIndex] == 0)
                {
                    for(int j = lastIndex - 1; j >= 0; j--)
                    {
                        if(j == i)
                        {
                            return;
                        }
                        if(nums[j] != 0)
                        {
                            lastIndex = j;
                            break;
                        }
                    }
                }
            }
        }

    }   

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}