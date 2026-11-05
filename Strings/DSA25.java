package Strings;
/*
 * Problem: Count the number of words in a given string.
 *
 * Approach: Use the split() method to divide the string into
 * individual words and count the resulting array elements.
 *
 * Algorithm:
 * 1. Take the input string.
 * 2. Split the string using the space character (" ").
 * 3. Store the resulting words in a string array.
 * 4. Use the array's length property to count the words.
 * 5. Print the total number of words.
 *
 * Dry Run:
 * Input: "java is powerful"
 *
 * Words: java, is, powerful
 * Array length: 3
 *
 * Output: No of words : 3
 *
 * Time Complexity: O(n) - Splitting requires traversing the string.
 * Space Complexity: O(n) - Stores the resulting array of words.
 *
 * Note: This implementation assumes words are separated by single
 * spaces. Multiple consecutive spaces or leading/trailing spaces
 * may affect the count.
 */
public class DSA25 {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] words = str.split(" ");
        System.out.println( "No of words : "+words.length);
        
    }
    
}
