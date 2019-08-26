package com.practice;

import java.util.Stack;

public class ValidParantheses
{
    public static boolean isValid(String s)
    {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            String current = String.valueOf(s.charAt(i));
            if ("{".equals(current) || "[".equals(current) || "(".equals(current))
            {
                stack.push(current);
            }
            else if ("}".equals(current))
            {
                if(stack.empty())
                {
                    return false;
                }
                String stackValue = stack.pop();
                if (!"{".equals(stackValue))
                {
                    return false;
                }
            }
            else if ("]".equals(current))
            {
                if(stack.empty())
                {
                    return false;
                }
                String stackValue = stack.pop();
                if (!"[".equals(stackValue))
                {
                    return false;
                }
            }
            else if (")".equals(current))
            {
                if(stack.empty())
                {
                    return false;
                }
                String stackValue = stack.pop();
                if (!"(".equals(stackValue))
                {
                    return false;
                }
            }
        }
        if (!stack.empty())
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String test = "{[]}";
        System.out.println(isValid(test));
    }

}
