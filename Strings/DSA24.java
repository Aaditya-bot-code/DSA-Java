package String;
//Longest word
public class DSA24 {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] words = str.split(" ");
        int longest = words[0].length();
        String longest_string =words[0];
        for(int i = 1 ; i < words.length ; i++)
        {
            if(longest < words[i].length())
            {
                longest = words[i].length();
                longest_string = words[i];
            }
        }
        System.out.println("Longest String: "+longest_string);

    }
}
