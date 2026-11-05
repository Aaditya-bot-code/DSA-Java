package Strings;
/*
 * Problem:
 * Find the first character in the string that occurs more than once.
 *
 * Approach:
 * 1. Create a frequency array of size 26.
 * 2. Traverse the string and count the frequency of each character.
 * 3. Traverse the string again in its original order.
 * 4. Print the first character whose frequency is greater than 1.
 * 5. If no such character exists, print a message.
 *
 * Algorithm:
 * - Count the frequency of every character.
 * - Check characters from left to right.
 * - Stop when a character with frequency greater than 1 is found.
 *
 * Dry Run:
 * Input: "abca"
 *
 * Frequencies:
 * a = 2, b = 1, c = 1
 *
 * Second traversal:
 * a -> frequency is 2
 * Therefore, the first repeating character is 'a'.
 *
 * Output: a
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) - Fixed-size frequency array of 26 elements.
 *
 * Note: Assumes all characters are lowercase English letters (a-z).
 */
public class DSA36 {
    public static void main(String[] args) {
         String str = "abca";
        int frequency[] = new int[26];
        for(int i=0 ; i<str.length() ; i++)
        {
            frequency[str.charAt(i) - 'a']++;
        }
        boolean status = false;
        for(int i=0 ; i<str.length(); i++)
        {
            if(frequency[str.charAt(i) - 'a'] > 1)
            {
                System.out.println(str.charAt(i));
                status = true;
                break;
            }
        }
        if(!status)
        {
            System.out.println("No character is repeating. ");
        }
    }
    
}
