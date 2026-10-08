package String;
// longest substring without repeating characters
// Bruteforce method
// complexity:
//  time : O(n^2)
//  space : O(n)

public class DSA29 {
    public static void main(String[] args) {
    String str = "pwwkew";
    int max = 0;

    for(int i = 0; i < str.length(); i++)
    {
        String current = "";

        for(int j = i; j < str.length(); j++)
        {
            char ch = str.charAt(j);

        // duplicate check

            if(current.indexOf(ch)!=-1){
                break;
            }

        // add character

            current = current + ch;

        // update max

            if(max < current.length())
            {
                max = current.length();
            }

        }
    }

    System.out.println(max);
    }
    
}
