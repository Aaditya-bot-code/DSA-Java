package String;
//Sub-String
// Complexity

// There are approximately n² substrings, so:

// Time: O(n²) for generating/traversing the substrings
// Space: O(1) extra space if we print them directly (ignoring the temporary substring objects/output)

public class DSA23 {
    public static void main(String[] args) {
        String str = "abc";
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i ; j < str.length() ; j++)
            {
                System.out.println(str.substring(i,j+1));
            }
        }
    }
    
}
