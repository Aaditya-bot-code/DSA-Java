package String;

public class DSA15 {
    //palindrome
    public static void main(String[] args) {
        String str = "ABCDCBA";
        int left=0;
        int right=str.length()-1;
        boolean status=true;
            while(left < right)
            {
                if(str.charAt(left) == str.charAt(right))
                {
                    right--;
                    left++;
                }
                else{
                    status = false;
                    break;
                }
            }
            if(status == true)
            {
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");

            }
        
    }
    
}
