package Strings;
/*
 * Problem: Find the length of the longest palindromic substring.
 *
 * Approach: Expand Around Center.
 * Consider every character and every gap between two characters
 * as a possible palindrome center. Expand outwards while the
 * characters on both sides match.
 *
 * Algorithm:
 * 1. Initialize max = 0.
 * 2. Traverse the string using the center index i.
 *
 * 3. Check odd-length palindromes:
 *    - Set left = i and right = i.
 *    - Expand while both pointers are within bounds and
 *      the characters match.
 *    - Calculate the palindrome length.
 *    - Update max if necessary.
 *
 * 4. Check even-length palindromes:
 *    - Set left = i and right = i + 1.
 *    - Expand while both pointers are within bounds and
 *      the characters match.
 *    - Calculate the palindrome length.
 *    - Update max if necessary.
 *
 * 5. Print the maximum length.
 *
 * Dry Run:
 * Input: "babad"
 *
 * Odd-length palindrome:
 * Center at index 1 -> "bab", length = 3
 *
 * Even-length palindrome:
 * No longer even-length palindrome is found.
 *
 * Longest palindromic substrings: "bab" or "aba"
 * Maximum length: 3
 *
 * Output: 3
 *
 * Time Complexity: O(n^2) - Each of the n possible centers
 *                  can expand up to O(n) positions.
 * Space Complexity: O(1) - Uses only a few variables.
 *
 * Note: This program returns the length, not the actual substring.
 */
public class DSA32 {
    public static void main(String[] args) {
        String str = "babad";
        int max = 0;
        for(int i = 0 ; i <str.length() ; i++)
        {
            // odd palindrome
            int left = i;
            int right = i;
            while(left >= 0 && right < str.length()) {
                if( str.charAt(left) == str.charAt(right))
                {
                    left--;
                    right++;                
                }
                else{
                    break;
                }
            }
            int length = right - left - 1;
            if(max < length)
            {
                max = length;
            }
            // even palindrome
            left = i;
            right = i+1;
            while(left >= 0 && right < str.length()) {
                if( str.charAt(left) == str.charAt(right))
                {
                    left--;
                    right++;                
                }
                else{
                    break;
                }
                
            }
            length = right - left - 1;
            if(max < length)
            {
                max = length;
            }


        }
        System.out.println(max);
    }
    
}
