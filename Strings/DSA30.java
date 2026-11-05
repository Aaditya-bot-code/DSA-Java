package Strings;
import java.util.HashSet;
/*
 * Problem: Find the length of the longest substring without
 * repeating characters.
 *
 * Approach: Sliding Window + HashSet.
 * Maintain a window containing only unique characters.
 * Expand the window using right and shrink it using left
 * whenever a duplicate character is found.
 *
 * Algorithm:
 * 1. Create a HashSet to store unique characters.
 * 2. Initialize left = 0 and max = 0.
 * 3. Traverse the string using the right pointer.
 * 4. Check whether the current character already exists in the set.
 * 5. If it exists:
 *    - Remove the character at the left pointer.
 *    - Increment left.
 *    - Repeat until the duplicate is removed.
 * 6. Add the current character to the set.
 * 7. Calculate the current window length.
 * 8. Update max if the current window is longer.
 * 9. Print max.
 *
 * Dry Run:
 * Input: "pwwkew"
 *
 * p   -> window = "p", max = 1
 * pw  -> window = "pw", max = 2
 * w   -> duplicate found, remove characters from left
 * pw  -> window = "w", max = 2
 * k   -> window = "wk", max = 2
 * e   -> window = "wke", max = 3
 * w   -> duplicate found, shrink window
 *
 * Longest substring: "wke"
 * Output: 3
 *
 * Time Complexity: O(n) - Each character is added to and removed
 *                  from the HashSet at most once.
 * Space Complexity: O(min(n, k)) - Stores unique characters,
 *                   where k is the character-set size.
 *
 * Note: This is more efficient than the brute-force approach
 * implemented in DSA29.
 */
public class DSA30 {
    public static void main(String[] args) {
        String str = "pwwkew";
        HashSet<Character> set =  new HashSet<>();

        int left = 0;
        int max = 0;
        for(int right = 0 ; right < str.length() ; right++)
        {
            char ch = str.charAt(right);
            // check if current ch is already in window
            while(set.contains(ch))
            {
                // remove duplicate
                set.remove(str.charAt(left));
                left++;
            }
            // otherwise add to window
            set.add(ch);
            // current window length = right - left + 1
            max = Math.max(max,right - left + 1);
        }
        System.out.println(max);


    }
    
}
