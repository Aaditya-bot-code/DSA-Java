package Strings;
/*
 * Problem: Check whether a given string is a palindrome.
 *
 * Approach: Use two pointers, one starting at the beginning and the other
 * at the end. Compare the characters and move both pointers towards the
 * center. If any pair does not match, the string is not a palindrome.
 *
 * Algorithm:
 * 1. Initialize left = 0 and right = str.length() - 1.
 * 2. Set status = true.
 * 3. While left < right:
 *    - If both characters match, increment left and decrement right.
 *    - Otherwise, set status = false and stop.
 * 4. Print whether the string is a palindrome.
 *
 * Dry Run:
 * String: "ABCDCBA"
 *
 * Step 1: A == A
 * Step 2: B == B
 * Step 3: C == C
 * Step 4: D is the middle character; comparison loop ends.
 *
 * Result: palindrome
 *
 * Time Complexity: O(n) - Each character is compared at most once.
 * Space Complexity: O(1) - Only two pointers and one boolean variable are used.
 *
 * Note: This implementation is case-sensitive.
 */
public class DSA15 {
    
    public static void main(String[] args) {
        String str = "ABCDCBA";
        int left=0;
        int right=str.length()-1;
        boolean status=true;
            while(left < right)
            {
                if(str.charAt(left) == str.charAt(right))
                {
                    right--;
                    left++;
                }
                else{
                    status = false;
                    break;
                }
            }
            if(status == true)
            {
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");

            }
        
    }
    
}
