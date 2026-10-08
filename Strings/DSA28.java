package String;
// aabbbcc --> a2b3c2
public class DSA28 {
    public static void main(String[] args) {
        String str ="aabbbccaa";
        String result = "";
        int i=0;
        while(i<str.length())
        {
            char current = str.charAt(i);
            int count=0;

            while(i<str.length() && str.charAt(i) == current)
            {
                count++;
                i++;
            }
            result = result+current;
            result = result+count;


        }
        System.out.println(result);
    }
    
}
