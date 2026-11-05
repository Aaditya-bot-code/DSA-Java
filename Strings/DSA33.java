package Strings;
/*
 * Problem: Check whether one string is a subsequence of another string.
 *
 * Approach: Two Pointers.
 * Use one pointer for each string. Move through the second string
 * and match characters of the first string in their original order.
 *
 * Algorithm:
 * 1. Check whether str1 is longer than str2.
 *    - If yes, print "Not a subsequence" and stop.
 * 2. Initialize i = 0 and j = 0.
 * 3. Traverse both strings while i and j are within their limits.
 * 4. If str1.charAt(i) matches str2.charAt(j):
 *    - Increment both pointers.
 * 5. Otherwise:
 *    - Increment only j.
 * 6. After traversal, check whether i == str1.length().
 * 7. If true, str1 is a subsequence; otherwise, it is not.
 *
 * Dry Run:
 * str1 = "abc"
 * str2 = "ahbgdc"
 *
 * a matches a -> i = 1, j = 1
 * h does not match b -> j = 2
 * b matches b -> i = 2, j = 3
 * g does not match c -> j = 4
 * d does not match c -> j = 5
 * c matches c -> i = 3, j = 6
 *
 * All characters of str1 are matched in order.
 *
 * Output: subsequence
 *
 * Time Complexity: O(n + m) - Each string is traversed at most once,
 *                  where n and m are their respective lengths.
 * Space Complexity: O(1) - Uses only two pointers.
 *
 * Note: Characters must appear in the same relative order,
 * but they do not need to be consecutive.
 */
public class DSA33 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        if(str1.length() > str2.length())
        {
            System.out.println("Not a subsequence");
            return;
        }
        int i = 0;
        int j = 0;
        while(i < str1.length() && j < str2.length())
        {
            if(str1.charAt(i) == str2.charAt(j))
            {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i == str1.length())
        {
            System.out.println("subsequence");
        }
        else{
            System.out.println("Not a subsequence");
        }
    }
    
}
