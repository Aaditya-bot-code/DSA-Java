package String;
// Remove spaces
public class DSA21 {
    public static void main(String[] args) {
        String str = "hello world java";
        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                result = result + ch;
            }
            
        }
        System.out.println(result);
    }
}
