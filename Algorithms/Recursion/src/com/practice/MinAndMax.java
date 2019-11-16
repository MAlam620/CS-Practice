package com.practice;
import java.lang.*;
public class MinAndMax
{
    public static int getMin(int[] arr, int index, int min)
    {
        if(index == arr.length - 1)
        {
            return Math.min(arr[0], min);
        }
        else
        {
            return getMin(arr, index + 1, Math.min(arr[index], min));
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, -1, 5, 32, 2, 0};
        System.out.println(getMin(arr, 0, arr.length));
    }
}
