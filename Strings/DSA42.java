package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Group Anagram
// Complexity
// For n words with average length k:
// - Time: O(n × k log k)
// - Space: O(n × k)

public class DSA42 {
    public static void main(String[] args) {
    String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"}; 
    
    HashMap<String , ArrayList<String>> map = new HashMap<>();

    for(String word : words)
    {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        if(!map.containsKey(key))
        {
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(word);
    }

    System.out.println(map.values());

    }
    
}
