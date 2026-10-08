package String;
// Common prefix in multiple String.
// Complexity
// Time: O(n × m) approximately
// Space: O(m) for the prefix/string operations
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
