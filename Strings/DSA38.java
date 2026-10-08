package String;
// permutation of a String
public class DSA38 {
    public static void main(String[] args) {
       String str = "abc"; 
       permutation(str,"");
    }
    static void permutation(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++)
        {
        // choose character
        char ch = str.charAt(i);
        // create remaining string
        String remaining = str.substring(0,i)+ str.substring(i+1);
        // recursive call
        permutation(remaining,ans+ch);
        }
    }
    
}
