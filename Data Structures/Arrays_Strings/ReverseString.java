/**
 * Create a function that reverses a string:
 * "Hi My name is Andrei" should be:
 * "ierdnA si eman yM iH"
 */

 public class ReverseString
 {
    /**
     * Detail: Time complexity is O(n), since the input
     * is looped over once. Space complexity is O(n), since
     * a new string is created with length equal to the input.
     */
    public static String reverse(String input)
    {
        //Check for null, or single letter string
        if(input.length() < 1)
        {
            return "Please give me a valid string.";
        }
        else if(input.length() == 1)
        {
            return input;
        }
        String returnString = "";

        for(int i = input.length() - 1; i >= 0; i--)
        {
            returnString += input.charAt(i);
        }
        return returnString;
    }

    public static void main(String [] args){
        String test = "Hi My name is Andrei";
        String newString = reverse(test);
        System.out.print(newString);
    }
 }