package String;
//toggle case
public class DSA20 {
    public static void main(String[] args) {
        String str = "HeLLo";
        String result = "";
        for(int i = 0 ;i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                 ch = Character.toLowerCase(ch);
            } 
            else if(Character.isLowerCase(ch))
            {
                ch =Character.toUpperCase(ch);
            }
            result = result + ch;

                
        }
        System.out.println(result);
    }
    
}
