package com.company;
import java.lang.*;
public class ReverseString
{
    public static void reverseString(String str)
    {
         if(str.length() == 0)
         {
             return;
         }
         else
         {
             System.out.print(str.charAt(str.length() - 1));
             reverseString(str.substring(0, str.length() - 1));
         }
    }

    public static String recursionString(String str)
    {
        if(str.length() <= 1)
        {
            return str;
        }
        else
        {
            return recursionString(str.substring(1, str.length())) + str.charAt(0);
        }
    }

    public static void main(String[] args)
    {
        reverseString("Hello World!");
    }

}
