package Strings;
import java.util.HashMap;
/*
 * Problem: Check whether two strings are isomorphic.
 *
 * Approach: Two HashMaps.
 * Use one map to maintain the mapping from str1 to str2
 * and another map to maintain the reverse mapping.
 *
 * Algorithm:
 * 1. Check whether both strings have equal lengths.
 *    - If not, print "Not Isomorphic" and stop.
 * 2. Create two HashMaps:
 *    - map1: Maps characters from str1 to str2.
 *    - map2: Maps characters from str2 to str1.
 * 3. Traverse both strings simultaneously.
 * 4. For every pair of characters:
 *    - Check whether an existing mapping in map1 conflicts.
 *    - Check whether an existing mapping in map2 conflicts.
 * 5. If either mapping conflicts, print "Not Isomorphic" and stop.
 * 6. Otherwise, update both maps.
 * 7. If the entire traversal completes, print "Isomorphic".
 *
 * Dry Run:
 * str1 = "egg"
 * str2 = "add"
 *
 * e -> a : Store e -> a and a -> e
 * g -> d : Store g -> d and d -> g
 * g -> d : Existing mappings are consistent.
 *
 * Output: Isomorphic
 *
 * Time Complexity: O(n) - Traverses both strings once.
 * Space Complexity: O(n) - Stores character mappings in two HashMaps.
 *
 * Note: Both strings must have a consistent one-to-one character mapping.
 */
public class DSA34 {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        if(str1.length() != str2.length())
        {
            System.out.println("Not Isomorphic");
            return;
        }
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        // map1: str1 → str2
        // map2: str2 → str1
        for(int i = 0 ;i < str1.length() ; i++)
        {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(map1.containsKey(c1) && map1.get(c1) != c2)
            {
                System.out.println("Not Isomorphic");
                return;
            }
            if(map2.containsKey(c2) && map2.get(c2) != c1)
            {
                System.out.println("Not Isomorphic");
                return;
            }
            map1.put(c1,c2);
            map2.put(c2,c1);
            
        }
        System.out.println("Isomorphic");

    }
    
}
