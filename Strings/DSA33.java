package String;
//  string : sequence of another string ?
public class DSA33 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        if(str1.length() > str2.length())
        {
            System.out.println("Not a subsequence");
            return;
        }
        int i = 0;
        int j = 0;
        while(i < str1.length() && j < str2.length())
        {
            if(str1.charAt(i) == str2.charAt(j))
            {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i == str1.length())
        {
            System.out.println("subsequence");
        }
        else{
            System.out.println("Not a subsequence");
        }
    }
    
}
