package String;

public class DSA44 {
    public static void main(String[] args) {
        String input[] = {"running","jogging","walking"};
        String suffix = input[0];
        for(int i = 1 ; i < input.length ; i++)
        {
            String current = input[i];
            while(!current.endsWith(suffix))
            {
                suffix = suffix.substring(1);
            }
        }
        System.out.println(suffix);
    }
    
}
