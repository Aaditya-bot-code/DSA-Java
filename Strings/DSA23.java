package Strings;
/*
 * Problem: Generate and print all possible non-empty substrings
 * of a given string.
 *
 * Approach: Use two nested loops. The outer loop selects the
 * starting index, and the inner loop selects the ending index.
 * Use substring() to extract each substring.
 *
 * Algorithm:
 * 1. Traverse the string using the outer loop (i).
 * 2. Start the inner loop (j) from i.
 * 3. Extract the substring from index i to j + 1.
 * 4. Print the extracted substring.
 * 5. Repeat until all starting and ending index combinations
 *    have been processed.
 *
 * Dry Run:
 * Input: "abc"
 *
 * i = 0: a, ab, abc
 * i = 1: b, bc
 * i = 2: c
 *
 * Total substrings: 6
 *
 * Time Complexity: O(n^3) - There are O(n^2) substrings,
 *                  and creating/printing each can take O(n) time.
 * Space Complexity: O(n) auxiliary space in the worst case
 *                   for the temporary substring.
 *
 * Note: The number of non-empty substrings is n * (n + 1) / 2.
 */
public class DSA23 {
    public static void main(String[] args) {
        String str = "abc";
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i ; j < str.length() ; j++)
            {
                System.out.println(str.substring(i,j+1));
            }
        }
    }
    
}
