package Strings;
/*
 * Problem: Remove duplicate characters from a string.
 *
 * Approach: Traverse the string and build a result string.
 * Before adding each character, check whether it already exists
 * in the result using indexOf().
 *
 * Algorithm:
 * 1. Initialize an empty result string.
 * 2. Traverse the original string character by character.
 * 3. Check whether the current character exists in result.
 * 4. If it does not exist, append it to result.
 * 5. Print the final result.
 *
 * Dry Run:
 * Input: "programming"
 *
 * Characters processed:
 * p -> progamin (after all characters are processed)
 *
 * Final unique characters: p, r, o, g, a, m, i, n
 * Output: progamin
 *
 * Time Complexity: O(n^2) - indexOf() and string concatenation
 *                  can take linear time in each iteration.
 * Space Complexity: O(n) - stores the resulting string.
 *
 * Note: Preserves the first occurrence of each character.
 */
public class DSA16 {
    
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(result.indexOf(str.charAt(i)) ==-1)
            {
                result = result+ str.charAt(i);
            }
            
        }
        System.out.println(result);
    }
    
}
