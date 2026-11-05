package Strings;
/*
 * Problem:
 * Find the longest common suffix shared by all strings
 * in an array.
 *
 * Approach:
 * Use the first string as the initial suffix candidate.
 *
 * 1. Initialize suffix with the first string.
 * 2. Traverse the remaining strings one by one.
 * 3. Check whether the current string ends with the suffix.
 * 4. If it does not, remove the first character from suffix.
 * 5. Repeat until the current string ends with the suffix.
 * 6. Print the final common suffix.
 *
 * Algorithm:
 * - Take the first string as the initial suffix.
 * - Compare it with every remaining string.
 * - Keep shortening the suffix from the beginning
 *   until it matches the ending of the current string.
 * - Print the final suffix.
 *
 * Dry Run:
 * Input: ["running", "jogging", "walking"]
 *
 * Initial suffix = "running"
 *
 * Compare with "jogging":
 * running -> unning -> nning -> ning -> ing
 *
 * Compare with "walking":
 * "walking" ends with "ing".
 *
 * Final Output: ing
 *
 * Time Complexity: O(n * m^2) worst case.
 * - n = Number of strings.
 * - m = Maximum length of a string.
 * - Repeated suffix shortening and endsWith() comparisons
 *   can take O(m^2) time per string.
 *
 * Space Complexity: O(m) - For storing the suffix string.
 *
 * Note: Assumes the input array contains at least one string.
 * If no common suffix exists, the result is an empty string.
 */
public class DSA44 {
    public static void main(String[] args) {
        String input[] = {"running","jogging","walking"};
        String suffix = input[0];
        for(int i = 1 ; i < input.length ; i++)
        {
            String current = input[i];
            while(!current.endsWith(suffix))
            {
                suffix = suffix.substring(1);
            }
        }
        System.out.println(suffix);
    }
    
}
