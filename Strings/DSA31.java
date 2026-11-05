package Strings;
/*
 * Problem: Find the length of the longest palindromic substring.
 *
 * Approach: Brute Force.
 * Generate all possible substrings and check whether each
 * substring is a palindrome using two pointers.
 *
 * Algorithm:
 * 1. Initialize max = 0.
 * 2. Use the outer loop to select the starting index.
 * 3. Use the inner loop to select the ending index.
 * 4. Extract the current substring.
 * 5. Initialize left = 0 and right = substring.length() - 1.
 * 6. Compare characters from both ends:
 *    - If they match, move both pointers towards the center.
 *    - Otherwise, mark the substring as not a palindrome.
 * 7. If the substring is a palindrome, update max if necessary.
 * 8. Print the maximum length.
 *
 * Dry Run:
 * Input: "babad"
 *
 * Palindromic substrings include:
 * "b", "a", "b", "a", "d", "bab", "aba"
 *
 * Longest palindromic substrings: "bab" or "aba"
 * Maximum length: 3
 *
 * Output: 3
 *
 * Time Complexity: O(n^3) - O(n^2) substrings are generated,
 *                  and each palindrome check can take O(n).
 * Space Complexity: O(n) - Stores the temporary substring.
 *
 * Note: This program returns the length, not the actual substring.
 */
public class DSA31 {
    public static void main(String[] args) {
        String str = "babad";
        int max = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j =i ; j < str.length() ; j++)
            {
                String substr = str.substring(i,j+1);
                int left =0;
                int right = substr.length()-1;
                boolean isPalindrome = true;
                while(left < right)
                {
                    if(substr.charAt(left) == substr.charAt(right))
                    {
                        left++;
                        right--;
                    }
                    else{
                        isPalindrome = false;
                        break;
                    }
                }
                if(isPalindrome){
                    if(max < substr.length())
                    {
                        max = substr.length();
                    }
                }
            }
        }
        System.out.println(max);
    }
    
}
