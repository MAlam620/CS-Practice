package com.practice;

public class StringLength
{
    public static int stringLength(String input)
    {
        if(input.equals(""))
        {
            return 0;
        }
        else
        {
            return (1 + stringLength(input.substring(1)));
        }
    }

    public static void main(String[] args)
    {
        System.out.println(stringLength("Hello"));
    }
}
