package Strings;

/*
 * Problem: Count the frequency of each character in a string.
 *
 * Approach:
 * Use an integer array of size 26 to store the frequency of
 * lowercase English letters. Calculate the index by subtracting
 * 'a' from each character.
 *
 * Algorithm:
 * 1. Create an integer array of size 26 initialized to zero.
 * 2. Traverse the string character by character.
 * 3. Calculate the character's index using ch - 'a'.
 * 4. Increment the frequency at that index.
 * 5. Traverse the frequency array and print characters
 *    whose frequency is greater than zero.
 *
 * Dry Run:
 * Input: "programming"
 *
 * Character frequencies:
 * a -> 1
 * g -> 2
 * i -> 1
 * m -> 2
 * n -> 1
 * o -> 1
 * p -> 1
 * r -> 2
 *
 * Time Complexity: O(n + 26) = O(n)
 * Space Complexity: O(26) = O(1)
 *
 * Note: This implementation supports lowercase English letters (a-z).
 */

public class DSA13 {
    
    public static void main(String[] args) {
        String str = "programming";
        int[] frequency = new int[26];
        for(int i = 0 ;i < str.length() ; i++)
        {
            int index = str.charAt(i)-'a';
            frequency[index]++;
        }
        for(int i = 0 ; i < frequency.length ; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.println((char)(i + 'a')  + "->" + frequency[i]);
            }
        }
        
    }
}
