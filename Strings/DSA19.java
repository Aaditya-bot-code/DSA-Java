package String;
//count letters ,digits and special characters
public class DSA19 {
    public static void main(String[] args) {
        String str = "hello123#@";
        int letters = 0;
        int digits = 0;
        int special_character = 0;
        for(int i = 0 ;i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                letters++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else{
                special_character++;
            }
        }
        System.out.println("letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("special character: "+special_character);
    }
    
}
