package String;
// Remove character
//Complexity
// Time: O(n)
// Space: O(n) for the result.
import java.util.*;
public class DSA37 {
    public static void main(String[] args) {
    String str;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter a String .\n");
    str = s.nextLine();

    String result ="";

    System.out.println("Enter character to remove>\n");
    char ch = s.nextLine().charAt(0);

    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i)!=ch)
        {
            result = result+ str.charAt(i);
        }
    }

    System.out.println(result);
    s.close();
    }
    
}
