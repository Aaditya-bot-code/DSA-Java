package Strings;
/*
 * Problem:
 * Find the length of the longest substring that can be made
 * of the same character by replacing at most k characters.
 *
 * Approach:
 * Use the Sliding Window technique with a frequency array.
 *
 * 1. Maintain two pointers: left and right.
 * 2. Expand the window by moving the right pointer.
 * 3. Store the frequency of each character.
 * 4. Maintain maxFreq, which represents the highest frequency
 *    of a character in the current window.
 * 5. Calculate the number of replacements required:
 *    window length - maxFreq.
 * 6. If replacements exceed k, shrink the window from the left.
 * 7. Update the maximum valid window length.
 *
 * Algorithm:
 * - Initialize left, maxFreq, and maxLen to 0.
 * - Traverse the string using the right pointer.
 * - Update character frequency and maxFreq.
 * - Shrink the window while replacements required exceed k.
 * - Update maxLen for every valid window.
 * - Print the maximum length.
 *
 * Dry Run:
 * Input: s = "AABABBA", k = 1
 *
 * A valid longest window is "AABA".
 * Frequency of A = 3
 * Frequency of B = 1
 * Window length = 4
 * Replacements required = 4 - 3 = 1
 *
 * Therefore, maximum length = 4.
 *
 * Output: Maximum length: 4
 *
 * Time Complexity: O(n) - Each character is added to and
 * removed from the sliding window at most once.
 *
 * Space Complexity: O(1) - Fixed-size frequency array
 * containing 26 elements.
 *
 * Note: Assumes the input contains only uppercase English
 * letters (A-Z) and k is non-negative.
 */
public class DSA40 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int freq[] = new int[26];
        int k = 1;
        for(int right = 0 ; right < s.length() ; right++)
        {
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            while((right - left + 1) - maxFreq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right - left +1);
        }
        System.out.println("Maximum length: "+maxLen);
    }
    
}
