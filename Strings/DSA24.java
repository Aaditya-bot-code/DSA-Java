package Strings;
/*
 * Problem: Find the longest word in a given sentence.
 *
 * Approach: Split the sentence into individual words and compare
 * their lengths to find the longest word.
 *
 * Algorithm:
 * 1. Split the sentence using split(" ").
 * 2. Initialize the longest word and its length using the first word.
 * 3. Traverse the remaining words.
 * 4. If the current word is longer than the longest word:
 *    - Update the longest length.
 *    - Update the longest word.
 * 5. Print the longest word.
 *
 * Dry Run:
 * Input: "java is powerful"
 *
 * Words: java, is, powerful
 * java     -> length 4
 * is       -> length 2
 * powerful -> length 8
 *
 * Longest word: powerful
 *
 * Output: Longest String: powerful
 *
 * Time Complexity: O(n + L) - Splitting and traversing the sentence,
 *                  where n is the sentence length and L is the total
 *                  length of the words.
 * Space Complexity: O(n) - Stores the array of words.
 *
 * Note: If multiple words have the same maximum length, this program
 * returns the first one. Assumes the sentence contains at least one word.
 */
public class DSA24 {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] words = str.split(" ");
        int longest = words[0].length();
        String longest_string =words[0];
        for(int i = 1 ; i < words.length ; i++)
        {
            if(longest < words[i].length())
            {
                longest = words[i].length();
                longest_string = words[i];
            }
        }
        System.out.println("Longest String: "+longest_string);

    }
}
