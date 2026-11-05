package Strings;
/*
 * Problem: Remove spaces from a given string.
 *
 * Approach: Traverse the string character by character and append
 * only those characters that are not spaces to the result string.
 *
 * Algorithm:
 * 1. Initialize an empty result string.
 * 2. Traverse the original string.
 * 3. Check whether the current character is not a space.
 * 4. If it is not a space, append it to the result.
 * 5. Print the final result.
 *
 * Dry Run:
 * Input: "hello world java"
 *
 * Spaces are skipped while all other characters are appended.
 *
 * Output: "helloworldjava"
 *
 * Time Complexity: O(n^2) - Repeated string concatenation creates
 *                  new strings during each iteration.
 * Space Complexity: O(n) - Stores the resulting string.
 *
 * Note: This implementation removes ordinary space characters (' '),
 * but does not remove tabs or other whitespace characters.
 */
public class DSA21 {
    public static void main(String[] args) {
        String str = "hello world java";
        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                result = result + ch;
            }
            
        }
        System.out.println(result);
    }
}
