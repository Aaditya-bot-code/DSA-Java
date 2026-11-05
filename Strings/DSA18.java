package Strings;
/*
 * Problem: Count the number of vowels and consonants in a string.
 *
 * Approach: Traverse the string character by character and check
 * whether each character is a vowel or a consonant.
 *
 * Algorithm:
 * 1. Initialize vowels and consonants to 0.
 * 2. Traverse the string.
 * 3. Check whether the current character is a, e, i, o, or u.
 * 4. If it is a vowel, increment vowels.
 * 5. Otherwise, increment consonants.
 * 6. Print both counts.
 *
 * Dry Run:
 * Input: "programming"
 *
 * Vowels: o, a, i = 3
 * Consonants: p, r, g, r, m, m, n, g = 8
 *
 * Output:
 * vowels: 3
 * consonants: 8
 *
 * Time Complexity: O(n) - Traverses the string once.
 * Space Complexity: O(1) - Uses only two counter variables.
 *
 * Note: This implementation assumes lowercase alphabetic input.
 * It treats every non-vowel character as a consonant.
 */

public class DSA18 {
    public static void main(String[] args) {
        String str = "programming";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch== 'u')
            {
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels: "+vowels);        
        System.out.println("consonants: "+consonants);        

    }
    
}
