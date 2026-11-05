package Strings;
import java.util.Stack;
/*
 * Problem:
 * Check whether the brackets in a string are balanced.
 *
 * Approach:
 * Use a Stack to keep track of opening brackets.
 *
 * 1. Traverse the string character by character.
 * 2. Push opening brackets (, {, [ onto the stack.
 * 3. When a closing bracket is encountered:
 *    - Check whether the stack is empty.
 *    - Compare the closing bracket with the top of the stack.
 *    - If they match, pop the opening bracket.
 *    - Otherwise, the string is not balanced.
 * 4. After traversal, check whether the stack is empty.
 *
 * Algorithm:
 * - Create an empty stack.
 * - Push every opening bracket.
 * - Match every closing bracket with the top element.
 * - If a mismatch occurs, return not balanced.
 * - If the stack is empty after traversal, print Balanced.
 *
 * Dry Run:
 * Input: "{[(])}"
 *
 * '{' -> Push
 * '[' -> Push
 * '(' -> Push
 * ']' -> Does not match '('
 *
 * Output: not balanced
 *
 * Time Complexity: O(n) - Each character is processed once.
 * Space Complexity: O(n) - In the worst case, all characters
 * can be opening brackets and stored in the stack.
 *
 * Note: This implementation ignores characters other than
 * brackets. It checks (), {}, and [].
 */
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
