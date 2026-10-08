package String;
import java.util.Stack;
// Balanced Paranthesis
public class DSA39 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "{[(])}";
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[')
            {
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch == ']')
            {
                if(stack.isEmpty())
                {
                    System.out.println(" not balanced");
                    return;
                }
                if((stack.peek() == '(' && ch == ')') ||
                (stack.peek() == '[' && ch == ']') ||
                (stack.peek() == '{' && ch == '}'))
                {
                    stack.pop();
                }
                else{
                    System.out.println(" not balanced");
                    return;

                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
    
}
