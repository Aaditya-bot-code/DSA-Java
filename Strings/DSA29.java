package Strings;
/*
 * Problem: Find the length of the longest substring without
 * repeating characters.
 *
 * Approach: Brute Force. Generate substrings starting from each
 * index and stop extending a substring when a duplicate character
 * is found.
 *
 * Algorithm:
 * 1. Initialize max = 0.
 * 2. Use an outer loop to select the starting index.
 * 3. Create an empty current string for each starting index.
 * 4. Use an inner loop to extend the substring.
 * 5. Check whether the current character already exists in current.
 * 6. If it exists, stop extending that substring.
 * 7. Otherwise, append the character to current.
 * 8. Update max if the current substring is longer.
 * 9. Print max.
 *
 * Dry Run:
 * Input: "pwwkew"
 *
 * Starting at index 0:
 * p  -> length 1
 * pw -> length 2
 * Next character w is repeated, so stop.
 *
 * Starting at index 2:
 * w  -> length 1
 * wk -> length 2
 * wke -> length 3
 * Next character w is repeated, so stop.
 *
 * Longest substring: "wke"
 * Output: 3
 *
 * Time Complexity: O(n^3) - There are O(n^2) possible substrings,
 *                  and indexOf() can take O(n) time.
 * Space Complexity: O(n) - Stores the current substring.
 *
 * Note: This is a brute-force approach. A sliding-window approach
 * can solve this problem in O(n) time.
 */
public class DSA29 {
    public static void main(String[] args) {
    String str = "pwwkew";
    int max = 0;

    for(int i = 0; i < str.length(); i++)
    {
        String current = "";

        for(int j = i; j < str.length(); j++)
        {
            char ch = str.charAt(j);

        // duplicate check

            if(current.indexOf(ch)!=-1){
                break;
            }

        // add character

            current = current + ch;

        // update max

            if(max < current.length())
            {
                max = current.length();
            }

        }
    }

    System.out.println(max);
    }
    
}
