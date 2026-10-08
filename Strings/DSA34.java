package String;
import java.util.HashMap;
// Isomorphic : 
//Complexity:
//  Time: O(n)
//  Space: O(n)
public class DSA34 {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        if(str1.length() != str2.length())
        {
            System.out.println("Not Isomorphic");
            return;
        }
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        // map1: str1 → str2
        // map2: str2 → str1
        for(int i = 0 ;i < str1.length() ; i++)
        {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(map1.containsKey(c1) && map1.get(c1) != c2)
            {
                System.out.println("Not Isomorphic");
                return;
            }
            if(map2.containsKey(c2) && map2.get(c2) != c1)
            {
                System.out.println("Not Isomorphic");
                return;
            }
            map1.put(c1,c2);
            map2.put(c2,c1);
            
        }
        System.out.println("Isomorphic");

    }
    
}
