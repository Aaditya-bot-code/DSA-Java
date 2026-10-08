package String;
import java.util.HashSet;
// longest substring without repeating characters
// Sliding window + HashSet
// complexity:
//  time : O(n)
//  space : O(n)
public class DSA30 {
    public static void main(String[] args) {
        String str = "pwwkew";
        HashSet<Character> set =  new HashSet<>();

        int left = 0;
        int max = 0;
        for(int right = 0 ; right < str.length() ; right++)
        {
            char ch = str.charAt(right);
            // check if current ch is already in window
            while(set.contains(ch))
            {
                // remove duplicate
                set.remove(str.charAt(left));
                left++;
            }
            // otherwise add to window
            set.add(ch);
            // current window length = right - left + 1
            max = Math.max(max,right - left + 1);
        }
        System.out.println(max);


    }
    
}
