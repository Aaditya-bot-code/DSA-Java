package Strings;

/*
 * Problem: Find the first non-repeating character in a string.
 *
 * Approach:
 * Use a frequency array of size 26 to count the occurrences
 * of each lowercase English letter.
 * Traverse the string again to find the first character
 * whose frequency is exactly 1.
 *
 * Algorithm:
 * 1. Create an integer array of size 26.
 * 2. Traverse the string and calculate the frequency of each character.
 * 3. Traverse the string again from left to right.
 * 4. Check whether the current character has frequency 1.
 * 5. Print the first such character and stop the traversal.
 *
 * Dry Run:
 * Input: "aabbcdde"
 *
 * Frequencies:
 * a -> 2
 * b -> 2
 * c -> 1
 * d -> 2
 * e -> 1
 *
 * Second traversal:
 * a -> repeating
 * a -> repeating
 * b -> repeating
 * b -> repeating
 * c -> non-repeating
 *
 * Output: c
 *
 * Time Complexity: O(n + 26) = O(n)
 * Space Complexity: O(26) = O(1)
 *
 * Note: This implementation supports lowercase English letters (a-z).
 */

public class DSA14 {
    
    public static void main(String[] args) {
        String str = "aabbcdde";
        int frequency[] = new int[26];
        for(int i=0 ; i<str.length() ; i++)
        {
            frequency[str.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<str.length(); i++)
        {
            if(frequency[str.charAt(i) - 'a'] == 1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
        
    }
}
