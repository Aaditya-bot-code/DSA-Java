package Strings;
/*
 * Problem: Find the longest common prefix among an array of strings.
 *
 * Approach: Horizontal Scanning.
 * Assume the first string is the common prefix. Compare it with
 * every other string and keep shortening it until the current
 * string starts with that prefix.
 *
 * Algorithm:
 * 1. Initialize prefix with the first string.
 * 2. Traverse the remaining strings.
 * 3. For each string:
 *    - Check whether it starts with the current prefix.
 *    - If not, remove the last character from prefix.
 *    - Repeat until a common prefix is found.
 * 4. Continue until all strings have been checked.
 * 5. Print the final prefix.
 *
 * Dry Run:
 * Input: {"flower", "flow", "flight"}
 *
 * Initial prefix = "flower"
 *
 * Compare with "flow":
 * flower -> flow
 *
 * Compare with "flight":
 * flow -> flo -> fl
 *
 * Final common prefix: "fl"
 *
 * Output: fl
 *
 * Time Complexity: O(n * m) - In the worst case, each of the n
 *                  strings may require checking up to m characters.
 * Space Complexity: O(m) - Stores the prefix string, where m is
 *                   the length of the first string.
 *
 * Note: Assumes the input array contains at least one string.
 * If there is no common prefix, an empty string is returned.
 */
public class DSA35 {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String prefix = strs[0];
        for(int i=1 ; i<strs.length ; i++)
        {
            String current = strs[i];
            while(!current.startsWith(prefix))
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
    
}
