package String;
// First repeating character
// Complexity
// Time: O(n)
// Space: O(1) → frequency array has fixed size 26.
public class DSA36 {
    public static void main(String[] args) {
         String str = "abca";
        int frequency[] = new int[26];
        for(int i=0 ; i<str.length() ; i++)
        {
            frequency[str.charAt(i) - 'a']++;
        }
        boolean status = false;
        for(int i=0 ; i<str.length(); i++)
        {
            if(frequency[str.charAt(i) - 'a'] > 1)
            {
                System.out.println(str.charAt(i));
                status = true;
                break;
            }
        }
        if(!status)
        {
            System.out.println("No character is repeating. ");
        }
    }
    
}
