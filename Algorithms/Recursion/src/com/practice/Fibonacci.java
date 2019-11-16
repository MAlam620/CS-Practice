package com.practice;

public class Fibonacci
{
    public static int fibonaccitIterative(int n)
    {
        int previousFirst = 1;
        int previousSecond = 1;

        if(n == 0)
        {
            return 0;
        }
        else if(n == 1 || n == 2)
        {
            return 1;
        }
        else
        {
            for(int i = 2; i < n; i++)
            {
                int current = previousFirst + previousSecond;
                previousSecond = previousFirst;
                previousFirst = current;
            }
            return previousFirst;
        }
    }

    public static int fibonacciRecursive(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

}
