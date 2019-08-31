package com.practice;

import java.util.Stack;

public class PostFixToInfix
{
    public static String postFixToInfix(String input)
    {
        String returnValue = "";
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);

            if(Character.isLetterOrDigit(current))
            {
                stack.push(String.valueOf(current));
            }
            else
            {
                String value2 = stack.pop();
                String value1 = stack.pop();
                String pushValue = "(" + value1 + " " + current +" " + value2 + ")";
                stack.push(pushValue);
            }
        }
        while (!stack.empty())
        {
            returnValue += stack.pop();
        }
        return returnValue;
    }

    public static void main(String [] args)
    {
        String test = "abcd^e-fgh*+^*+i-";
        System.out.println(postFixToInfix(test));
    }


}
