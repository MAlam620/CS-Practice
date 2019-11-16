package com.practice;
//Given a string find its first uppercase letter. No case for no upper case in string.
public class FirstUpperCase
{
    public static char firstUpper(String input)
    {
        if(Character.isUpperCase(input.charAt(0)))
        {
            return input.charAt(0);
        }
        else
        {
            return firstUpper(input.substring(1));
        }
    }

    public static void main(String[] args)
    {
        System.out.println(firstUpper("geeksforgeeKs"));
    }
}
