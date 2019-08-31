package com.practice;

import java.util.Stack;


public class InfixToPostfix
{
    public String infixToPostfix(String input)
    {
        String returnValue = "";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++)
        {
            char current = input.charAt(i);

            if(Character.isLetterOrDigit(current)) //Don't do anything with inputs
            {
                returnValue += current;
            }
            else if(current == '(') //Add this to the stack. Now look for closing parantheses.
            {
                stack.push(current);
            }
            //Anything inside must be evaluated first. Pop everything out. Parantheses not need.
            else if(current == ')')
            {
                while(stack.peek() != '(')
                {
                    returnValue += stack.pop();
                }
                stack.pop(); //Remove opening parantheses.
            }
            /*
                First, higher precedence operators need to be evaluated first, so pop those out.
                If precedence equal, we go from left to right in evaluation, so pop those out too.
             */
            else
            {
                while(!stack.empty() && precedence(stack.peek()) >= precedence(current))
                {
                    returnValue += stack.pop();
                }
                stack.push(current); //Push current value after precedence resolved.
            }
        }
        //Empty stack out.
        while(!stack.empty())
        {
            returnValue += stack.pop();
        }
        return returnValue;
    }

    public int precedence(char input)
    {
        if(input == '+' || input == '-')
        {
            return 1;
        }
        else if(input == '*' || input == '/')
        {
            return 2;
        }
        else if(input == '^')
        {
            return 3;
        }
        return -1;
    }
}
