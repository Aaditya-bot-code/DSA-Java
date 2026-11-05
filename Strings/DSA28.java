package Strings;
/*
 * Problem: Compress a string by replacing consecutive repeated
 * characters with the character followed by its count.
 *
 * Approach: Use a while loop to identify groups of consecutive
 * identical characters and count their occurrences.
 *
 * Algorithm:
 * 1. Initialize an empty result string and set i = 0.
 * 2. While i is less than the string length:
 *    - Store the current character.
 *    - Initialize count = 0.
 *    - Count consecutive occurrences of that character.
 *    - Append the character and its count to the result.
 * 3. Print the compressed string.
 *
 * Dry Run:
 * Input: "aabbbccaa"
 *
 * a -> count = 2
 * b -> count = 3
 * c -> count = 2
 * a -> count = 2
 *
 * Output: "a2b3c2a2"
 *
 * Time Complexity: O(n^2) - The traversal is O(n), but repeated
 *                  string concatenation can take additional time.
 * Space Complexity: O(n) - Stores the compressed result.
 *
 * Note: Only consecutive occurrences are grouped together.
 * The same character appearing in separate groups is counted separately.
 */
public class DSA28 {
    public static void main(String[] args) {
        String str ="aabbbccaa";
        String result = "";
        int i=0;
        while(i<str.length())
        {
            char current = str.charAt(i);
            int count=0;

            while(i<str.length() && str.charAt(i) == current)
            {
                count++;
                i++;
            }
            result = result+current;
            result = result+count;


        }
        System.out.println(result);
    }
    
}
