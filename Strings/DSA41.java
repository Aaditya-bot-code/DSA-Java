package String;

import java.util.HashMap;
// Word Pattern
public class DSA41 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s ="dog cat cat dog";
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
        {
            System.out.println("False");
            return;
        }

        for(int i = 0 ; i < words.length ; i++)
        {
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch) && !map1.get(ch).equals(words[i]))
            {
                System.out.println("False");
                return;
            }
            if(map2.containsKey(words[i]) && map2.get(words[i]) != ch)
            {
                System.out.println("False");
                return;
            }
            map1.put(ch,words[i]);
            map2.put(words[i],ch);
        }
        System.out.println("True");

    }
    
}
