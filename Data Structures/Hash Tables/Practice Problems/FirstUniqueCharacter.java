package com.hash.problems;

import java.util.*;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacter
{
    public static int firstUniqChar(String s)
    {
        if(s.length() < 1)
        {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();

        for(int i = 0; i < s.length(); i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                duplicates.put(i, i);
                duplicates.put(map.get(s.charAt(i)), map.get(s.charAt(i)));
            }
            else
            {
                map.put(s.charAt(i), i);
            }
        }
        int index = 0;

        for(int i = 0; i < duplicates.size(); i++)
        {
            if(duplicates.get(i) == null)
            {
                return index;
            }
            if (index == duplicates.get(i))
            {
                index++;
            }

        }

        if(index < s.length())
        {
            return index;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        String test = "leetcode";
        int result = firstUniqChar(test);
        System.out.println(result);
    }

}
