package com.practice;

import java.util.Stack;

public class BackspaceStringCompare
{
    public static boolean backspaceCompare(String S, String T)
    {
        Stack<String> stringS = new Stack<>();
        Stack<String> stringT = new Stack<>();

        for(int i = 0; i < S.length(); i++)
        {
            if("#".equals(String.valueOf(S.charAt(i))))
            {
                if(!stringS.empty())
                {
                    System.out.println("Popping " + stringS.pop());
                }

            }
            else
            {
                System.out.println("Pushing: " + S.charAt(i));
                stringS.push(String.valueOf(S.charAt(i)));
            }
        }

        for(int i = 0; i < T.length(); i++)
        {
            if("#".equals(String.valueOf(T.charAt(i))))
            {
                if(!stringT.empty())
                {
                    System.out.println("Popping " + stringT.pop());
                }

            }
            else
            {
                System.out.println("Pushing: " + T.charAt(i));
                stringT.push(String.valueOf(T.charAt(i)));
            }
        }

        if(stringS.empty() && stringT.empty())
        {
            return true;
        }
        else if(stringS.size() != stringT.size())
        {
            return false;
        }

        while(!stringS.empty())
        {
            if(!stringS.pop().equals(stringT.pop()))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String S = "a#c";
        String T = "b";
        System.out.println(backspaceCompare(S, T));
    }

}
