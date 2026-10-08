package String;
// longest substring palindrome using bruteforce
// complexity :
// Generate all substrings → O(n²)
// Check each substring → O(n)
// Overall: O(n³)

public class DSA31 {
    public static void main(String[] args) {
        String str = "babad";
        int max = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j =i ; j < str.length() ; j++)
            {
                String substr = str.substring(i,j+1);
                int left =0;
                int right = substr.length()-1;
                boolean isPalindrome = true;
                while(left < right)
                {
                    if(substr.charAt(left) == substr.charAt(right))
                    {
                        left++;
                        right--;
                    }
                    else{
                        isPalindrome = false;
                        break;
                    }
                }
                if(isPalindrome){
                    if(max < substr.length())
                    {
                        max = substr.length();
                    }
                }
            }
        }
        System.out.println(max);
    }
    
}
