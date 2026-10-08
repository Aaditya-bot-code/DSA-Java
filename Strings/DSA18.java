package String;
//count vowels and consonants

public class DSA18 {
    public static void main(String[] args) {
        String str = "programming";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch== 'u')
            {
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels: "+vowels);        
        System.out.println("consonants: "+consonants);        

    }
    
}
