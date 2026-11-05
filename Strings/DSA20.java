package Strings;
/*
 * Problem: Toggle the case of every alphabetic character in a string.
 *
 * Approach: Traverse the string and use Character.isUpperCase() and
 * Character.isLowerCase() to identify and change the case of each character.
 *
 * Algorithm:
 * 1. Initialize an empty result string.
 * 2. Traverse the original string character by character.
 * 3. If the character is uppercase, convert it to lowercase.
 * 4. If the character is lowercase, convert it to uppercase.
 * 5. Append the modified character to the result.
 * 6. Print the final string.
 *
 * Dry Run:
 * Input: "HeLLo"
 *
 * H -> h
 * e -> E
 * L -> l
 * L -> l
 * o -> O
 *
 * Output: "hEllO"
 *
 * Time Complexity: O(n^2) - Repeated string concatenation creates
 *                  new strings during each iteration.
 * Space Complexity: O(n) - Stores the resulting string.
 *
 * Note: Non-alphabetic characters remain unchanged.
 */
public class DSA20 {
    public static void main(String[] args) {
        String str = "HeLLo";
        String result = "";
        for(int i = 0 ;i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                 ch = Character.toLowerCase(ch);
            } 
            else if(Character.isLowerCase(ch))
            {
                ch =Character.toUpperCase(ch);
            }
            result = result + ch;

                
        }
        System.out.println(result);
    }
    
}
