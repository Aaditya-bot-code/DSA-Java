package String;

public class DSA14 {
    // first non-repeating character
    public static void main(String[] args) {
        String str = "aabbcdde";
        int frequency[] = new int[26];
        for(int i=0 ; i<str.length() ; i++)
        {
            frequency[str.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<str.length(); i++)
        {
            if(frequency[str.charAt(i) - 'a'] == 1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
        
    }
}
