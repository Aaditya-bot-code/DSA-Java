package String;

public class DSA17 {
    // Reverse of string
    public static void main(String[] args) {
        String str = "hello";
        String result = "";
        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            result = result + str.charAt(i);
        } 
        System.out.println(result);
    }
    
}
