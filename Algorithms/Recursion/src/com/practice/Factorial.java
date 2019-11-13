package com.practice;

public class Factorial
{
    public static int findFactorialRecursive(int number)
    {
        if(number == 1)
        {
            return number;
        }
        else
        {
            return (number * findFactorialRecursive(number - 1));
        }
    }

    public static void main(String[] args)
    {
        System.out.println(findFactorialRecursive(5));
    }

}
