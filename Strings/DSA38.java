package Strings;
/*
 * Problem:
 * Generate and print all possible permutations of a string.
 *
 * Approach:
 * Use recursion to generate permutations.
 * At each recursive call:
 * 1. Select one character from the remaining string.
 * 2. Add the selected character to the answer.
 * 3. Remove the selected character from the remaining string.
 * 4. Recursively generate permutations using the remaining characters.
 *
 * Base Case:
 * When the remaining string becomes empty, print the generated
 * permutation and return.
 *
 * Algorithm:
 * - Start with the original string and an empty answer.
 * - Iterate through every character in the remaining string.
 * - Choose one character.
 * - Create a new string without the chosen character.
 * - Make a recursive call with the updated answer.
 * - Continue until all characters have been selected.
 *
 * Dry Run:
 * Input: "abc"
 *
 * Choose 'a' -> remaining "bc"
 *   Choose 'b' -> remaining "c" -> abc
 *   Choose 'c' -> remaining "b" -> acb
 *
 * Choose 'b' -> remaining "ac"
 *   Choose 'a' -> remaining "c" -> bac
 *   Choose 'c' -> remaining "a" -> bca
 *
 * Choose 'c' -> remaining "ab"
 *   Choose 'a' -> remaining "b" -> cab
 *   Choose 'b' -> remaining "a" -> cba
 *
 * Output:
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 * Time Complexity: O(n * n!) - There are n! permutations,
 * and constructing/printing each permutation takes O(n) time.
 *
 * Space Complexity: O(n^2) - Recursive call stack and
 * intermediate strings, excluding output storage.
 *
 * Note: Assumes all characters are distinct for exactly n!
 * unique permutations. Duplicate characters may produce
 * repeated permutations.
 */
public class DSA38 {
    public static void main(String[] args) {
       String str = "abc"; 
       permutation(str,"");
    }
    static void permutation(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++)
        {
        // choose character
        char ch = str.charAt(i);
        // create remaining string
        String remaining = str.substring(0,i)+ str.substring(i+1);
        // recursive call
        permutation(remaining,ans+ch);
        }
    }
    
}
