package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Problem:
 * Group all anagrams together from an array of strings.
 *
 * Approach:
 * Use a HashMap where:
 * Key   -> Sorted version of a word.
 * Value -> ArrayList containing all words with that key.
 *
 * 1. Traverse each word in the input array.
 * 2. Convert the word into a character array.
 * 3. Sort the character array.
 * 4. Convert the sorted array into a string to use as a key.
 * 5. If the key does not exist, create a new ArrayList.
 * 6. Add the original word to the corresponding list.
 * 7. Print all grouped anagrams using map.values().
 *
 * Algorithm:
 * - Create an empty HashMap.
 * - For every word:
 *   a. Convert it into a character array.
 *   b. Sort the array.
 *   c. Generate the sorted string as the key.
 *   d. Store the original word under that key.
 * - Print the HashMap values.
 *
 * Dry Run:
 * Input:
 * ["eat", "tea", "tan", "ate", "nat", "bat"]
 *
 * Sorted keys:
 * eat -> aet
 * tea -> aet
 * tan -> ant
 * ate -> aet
 * nat -> ant
 * bat -> abt
 *
 * Groups:
 * aet -> [eat, tea, ate]
 * ant -> [tan, nat]
 * abt -> [bat]
 *
 * Output:
 * [[eat, tea, ate], [tan, nat], [bat]]
 *
 * Time Complexity: O(n * k log k)
 * - n = Number of words.
 * - k = Average length of each word.
 * - Each word is sorted in O(k log k) time.
 *
 * Space Complexity: O(n * k)
 * - Stores the grouped words and HashMap entries.
 *
 * Note: The order of groups printed by HashMap is not guaranteed.
 */
public class DSA42 {
    public static void main(String[] args) {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"}; 
    
    HashMap<String , ArrayList<String>> map = new HashMap<>();

    for(String word : words)
    {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if(!map.containsKey(key))
        {
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(word);
    }

    System.out.println(map.values());

    }
    
}
