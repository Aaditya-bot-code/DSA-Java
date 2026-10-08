package String;
//Anagram
public class DSA22 {
    public static void main(String[] args) {
        String str1 = "listen";        
        String str2 = "silent";
        int[] frequency = new int[26];
        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
            return ;
        }
        for(int i=0;i<str1.length();i++)
        {
                int index = str1.charAt(i)-'a';
                frequency[index]++;
        }
        for(int i=0 ; i<str2.length() ; i++)
        {
                int index = str2.charAt(i) - 'a';
                if(frequency[index] == 0)
                {
                    System.out.println("Not Anagram");
                    return ;
                }
                else{
                    frequency[index]--;
                }
        } 
        boolean status=true;
        for(int i=0 ; i<frequency.length ; i++)
        {
            if(frequency[i]>0)
            {
                status = false;
                break;
            }
        }  
        if(status == true)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println(" Not Anagram");
 
        }

    }

}
