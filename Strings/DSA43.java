package String;

import java.util.HashSet;
// Longest consecutive sequence in a array of numbers
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
