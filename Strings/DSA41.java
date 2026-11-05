package Strings;

import java.util.HashMap;
/*
 * Problem:
 * Check whether a string of words follows a given character pattern.
 *
 * Approach:
 * Use two HashMaps to maintain a bidirectional mapping.
 *
 * 1. Map each pattern character to its corresponding word.
 * 2. Map each word back to its corresponding pattern character.
 * 3. Split the input string into individual words.
 * 4. If the number of words differs from the pattern length,
 *    return false.
 * 5. Traverse the pattern and words together.
 * 6. Check whether existing mappings are consistent.
 * 7. If a mismatch occurs, return false.
 * 8. If all mappings are valid, return true.
 *
 * Algorithm:
 * - Create two HashMaps:
 *   map1: Character -> String
 *   map2: String -> Character
 * - Check whether the word count equals the pattern length.
 * - For every position:
 *   a. Check whether the character maps to a different word.
 *   b. Check whether the word maps to a different character.
 *   c. If either condition fails, print False.
 *   d. Otherwise, update both maps.
 * - Print True if all positions satisfy the pattern.
 *
 * Dry Run:
 * Pattern: "abba"
 * String: "dog cat cat dog"
 *
 * a -> dog
 * b -> cat
 * b -> cat (valid existing mapping)
 * a -> dog (valid existing mapping)
 *
 * Both mappings remain consistent.
 *
 * Output: True
 *
 * Time Complexity: O(n) expected - Each word is processed once
 * with average O(1) HashMap operations.
 *
 * Space Complexity: O(n) - For storing mappings and words.
 *
 * Note: Assumes words are separated by single spaces.
 * Both mappings are required to ensure a one-to-one relationship.
 */
public class DSA41 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s ="dog cat cat dog";
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
        {
            System.out.println("False");
            return;
        }

        for(int i = 0 ; i < words.length ; i++)
        {
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch) && !map1.get(ch).equals(words[i]))
            {
                System.out.println("False");
                return;
            }
            if(map2.containsKey(words[i]) && map2.get(words[i]) != ch)
            {
                System.out.println("False");
                return;
            }
            map1.put(ch,words[i]);
            map2.put(words[i],ch);
        }
        System.out.println("True");

    }
    
}
