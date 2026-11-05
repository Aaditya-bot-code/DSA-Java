package Strings;
/*
 * Problem: Check whether two strings are anagrams of each other.
 *
 * Approach: Use a frequency array of size 26 to count characters
 * in the first string. Then traverse the second string and decrease
 * the corresponding frequencies.
 *
 * Algorithm:
 * 1. Check whether both strings have equal lengths.
 * 2. If lengths differ, print "Not Anagram" and stop.
 * 3. Create a frequency array of size 26.
 * 4. Traverse the first string and increment the frequency
 *    of each character.
 * 5. Traverse the second string and decrement the frequency
 *    of each character.
 * 6. If a character's frequency is already zero, the strings
 *    are not anagrams.
 * 7. Check whether all frequency values are zero.
 * 8. If all are zero, print "Anagram"; otherwise, print "Not Anagram".
 *
 * Dry Run:
 * String 1: "listen"
 * String 2: "silent"
 *
 * Both strings have 6 characters.
 * Frequencies are increased using "listen".
 * Characters from "silent" decrease the corresponding frequencies.
 * All frequency values become zero.
 *
 * Output: Anagram
 *
 * Time Complexity: O(n + 26) = O(n)
 * Space Complexity: O(26) = O(1)
 *
 * Note: This implementation supports only lowercase English letters
 * (a-z). It is case-sensitive and does not ignore spaces.
 */
public class DSA22 {
    public static void main(String[] args) {
        String str1 = "listen";        
        String str2 = "silent";
        int[] frequency = new int[26];
        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
            return ;
        }
        for(int i=0;i<str1.length();i++)
        {
                int index = str1.charAt(i)-'a';
                frequency[index]++;
        }
        for(int i=0 ; i<str2.length() ; i++)
        {
                int index = str2.charAt(i) - 'a';
                if(frequency[index] == 0)
                {
                    System.out.println("Not Anagram");
                    return ;
                }
                else{
                    frequency[index]--;
                }
        } 
        boolean status=true;
        for(int i=0 ; i<frequency.length ; i++)
        {
            if(frequency[i]>0)
            {
                status = false;
                break;
            }
        }  
        if(status == true)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println(" Not Anagram");
 
        }

    }

}
