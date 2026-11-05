package Strings;
/*
 * Problem: Count the number of letters, digits, and special characters
 * in a given string.
 *
 * Approach: Traverse the string and use Character.isLetter() and
 * Character.isDigit() to identify each character.
 *
 * Algorithm:
 * 1. Initialize letters, digits, and special_character to 0.
 * 2. Traverse the string character by character.
 * 3. If the character is a letter, increment letters.
 * 4. Else if it is a digit, increment digits.
 * 5. Otherwise, increment special_character.
 * 6. Print all three counts.
 *
 * Dry Run:
 * Input: "hello123#@"
 *
 * Letters: h, e, l, l, o = 5
 * Digits: 1, 2, 3 = 3
 * Special characters: #, @ = 2
 *
 * Output:
 * letters: 5
 * Digits: 3
 * special character: 2
 *
 * Time Complexity: O(n) - Traverses the string once.
 * Space Complexity: O(1) - Uses only three counter variables.
 *
 * Note: Spaces and punctuation are also counted as special characters.
 */
public class DSA19 {
    public static void main(String[] args) {
        String str = "hello123#@";
        int letters = 0;
        int digits = 0;
        int special_character = 0;
        for(int i = 0 ;i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                letters++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else{
                special_character++;
            }
        }
        System.out.println("letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("special character: "+special_character);
    }
    
}
