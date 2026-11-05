package Strings;

import java.util.HashSet;
/*
 * Problem:
 * Find the length of the longest consecutive sequence
 * in an unsorted array of integers.
 *
 * Approach:
 * Use a HashSet to achieve efficient lookup.
 *
 * 1. Insert all array elements into a HashSet.
 * 2. Traverse the elements of the HashSet.
 * 3. Check whether the current number is the beginning
 *    of a sequence by checking if num - 1 exists.
 * 4. If num - 1 does not exist, start counting the sequence.
 * 5. Keep checking whether the next consecutive number exists.
 * 6. Update the maximum sequence length.
 *
 * Algorithm:
 * - Create a HashSet and insert all array elements.
 * - Initialize maxLen to 0.
 * - For every number in the set:
 *   a. Check whether its previous number exists.
 *   b. If not, consider it the starting point.
 *   c. Count consecutive numbers using a while loop.
 *   d. Update maxLen.
 * - Print the maximum sequence length.
 *
 * Dry Run:
 * Input: [100, 200, 4, 3, 1, 2]
 *
 * HashSet: [100, 200, 4, 3, 1, 2]
 *
 * Starting point: 1
 * Sequence: 1 -> 2 -> 3 -> 4
 * Length: 4
 *
 * Starting point: 100
 * Sequence: 100
 * Length: 1
 *
 * Starting point: 200
 * Sequence: 200
 * Length: 1
 *
 * Output: Longest consecutive sequence length: 4
 *
 * Time Complexity: O(n) expected.
 * - Inserting elements takes O(n) expected time.
 * - Each element is visited a constant number of times
 *   across the sequence checks.
 *
 * Space Complexity: O(n) - HashSet stores the array elements.
 *
 * Note: Duplicate elements are automatically removed by
 * the HashSet. The sequence does not need to be sorted.
 */
public class DSA43 {
    public static void main(String[] args) {
        int[] nums = {100,200,4,3,1,2};
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        int maxLen = 0;

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                int current = num;
                int length = 1;
                while(set.contains(current+1))
                {
                    current++;
                    length++;
                }
                maxLen = Math.max(maxLen,length);
            }
        }

        System.out.println("Longest consecutive sequence length : "+maxLen);
    }
    
}
