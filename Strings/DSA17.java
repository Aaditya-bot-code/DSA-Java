package Strings;
/*
 * Problem: Reverse a given string.
 *
 * Approach: Traverse the original string from right to left
 * and append each character to a new result string.
 *
 * Algorithm:
 * 1. Initialize an empty result string.
 * 2. Start a loop from str.length() - 1.
 * 3. Continue until the index becomes 0.
 * 4. Append each character to the result string.
 * 5. Print the reversed string.
 *
 * Dry Run:
 * Input: "hello"
 *
 * Step 1: o -> result = "o"
 * Step 2: l -> result = "ol"
 * Step 3: l -> result = "oll"
 * Step 4: e -> result = "olle"
 * Step 5: h -> result = "olleh"
 *
 * Output: "olleh"
 *
 * Time Complexity: O(n^2) - String concatenation creates new strings
 *                  during each iteration.
 * Space Complexity: O(n) - Stores the reversed string.
 */
public class DSA17 {

    public static void main(String[] args) {
        String str = "hello";
        String result = "";
        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            result = result + str.charAt(i);
        } 
        System.out.println(result);
    }
    
}
