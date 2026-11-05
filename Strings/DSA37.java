package Strings;
/*
 * Problem:
 * Remove all occurrences of a given character from a string.
 *
 * Approach:
 * 1. Take a string and a character as input.
 * 2. Create an empty result string.
 * 3. Traverse the original string character by character.
 * 4. Append a character to the result only if it is
 *    different from the character to be removed.
 * 5. Print the final result.
 *
 * Algorithm:
 * - Read the input string.
 * - Read the character to remove.
 * - Iterate through the string.
 * - Skip matching characters and append all other characters.
 *
 * Dry Run:
 * Input String: programming
 * Character to Remove: r
 *
 * Characters processed:
 * p -> p
 * r -> skipped
 * o -> po
 * g -> pog
 * r -> skipped
 * a -> poga
 * m -> pogam
 * m -> pogamm
 * i -> pogammi
 * n -> pogammin
 * g -> pogamming
 *
 * Output: pogamming
 *
 * Time Complexity: O(n^2) - Due to repeated string concatenation.
 * Space Complexity: O(n) - For storing the resulting string.
 *
 * Note: Removes every occurrence of the specified character.
 */
import java.util.*;
public class DSA37 {
    public static void main(String[] args) {
    String str;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter a String .\n");
    str = s.nextLine();

    String result ="";

    System.out.println("Enter character to remove>\n");
    char ch = s.nextLine().charAt(0);

    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i)!=ch)
        {
            result = result+ str.charAt(i);
        }
    }

    System.out.println(result);
    s.close();
    }
    
}
