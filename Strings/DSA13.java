package String;

public class DSA13 {
    //frequency count
    public static void main(String[] args) {
        String str = "programming";
        int[] frequency = new int[26];
        for(int i = 0 ;i < str.length() ; i++)
        {
            int index = str.charAt(i)-'a';
            frequency[index]++;
        }
        for(int i = 0 ; i < frequency.length ; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.println((char)(i + 'a')  + "->" + frequency[i]);
            }
        }
        
    }
}
