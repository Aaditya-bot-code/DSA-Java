package String;
// longest substring palindrome
// Expand Around Center
// Time: O(n²)
// Space: O(1)
public class DSA32 {
    public static void main(String[] args) {
        String str = "babad";
        int max = 0;
        for(int i = 0 ; i <str.length() ; i++)
        {
            // odd palindrome
            int left = i;
            int right = i;
            while(left >= 0 && right < str.length()) {
                if( str.charAt(left) == str.charAt(right))
                {
                    left--;
                    right++;                
                }
                else{
                    break;
                }
            }
            int length = right - left - 1;
            if(max < length)
            {
                max = length;
            }
            // even palindrome
            left = i;
            right = i+1;
            while(left >= 0 && right < str.length()) {
                if( str.charAt(left) == str.charAt(right))
                {
                    left--;
                    right++;                
                }
                else{
                    break;
                }
                
            }
            length = right - left - 1;
            if(max < length)
            {
                max = length;
            }


        }
        System.out.println(max);
    }
    
}
