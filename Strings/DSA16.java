package String;

public class DSA16 {
    //Remove Duplicate
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(result.indexOf(str.charAt(i)) ==-1)
            {
                result = result+ str.charAt(i);
            }
            
        }
        System.out.println(result);
    }
    
}
