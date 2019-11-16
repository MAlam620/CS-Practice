package com.practice;

/**
 * Given a string, count total number of consonants in it. A consonant is a English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, g, ..
 */
public class CountConsonants
{
    // Function to check for consonant
    public static boolean isConsonant(char ch)
    {
        // To handle lower case
        ch = Character.toUpperCase(ch);

        return !(ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U') && ch >= 65 && ch <= 90;
    }

    public static int countConsonants(String input)
    {
        if (input.length() == 1)
        {
            if(isConsonant(input.charAt(0)))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            char current = input.charAt(0);
            if(isConsonant(current))
            {
                return (1 + countConsonants(input.substring(1)));
            }
            else
            {
                return(0 + countConsonants(input.substring(1)));
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "abc de";
        System.out.println(countConsonants(str));
    }
}
