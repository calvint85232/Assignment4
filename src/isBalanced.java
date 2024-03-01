//#4
import java.util.Stack;

public class isBalanced {
    public static String isBalanced(String s) {
        // create a new stack
        Stack<Character> stack = new Stack<Character>();

        // iterate over the string
        for (int i = 0; i < s.length(); ++i) {
            char x = s.charAt(i);

            // if the scanned character is an opening bracket, push it to the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            }
            // if the scanned character is a closing bracket
            else if (x == ')' || x == ']' || x == '}') {

                // if stack is empty, return "NO"
                if (stack.isEmpty())
                    return "NO";

                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return "NO";
                        break;
                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return "NO";
                        break;
                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return "NO";
                        break;
                }
            }
        }

        // if stack is empty, return "YES". if else then return "NO".
        return (stack.isEmpty()) ? "YES" : "NO";
    }
        //test exmaples
    public static void main(String[] args) {
        // Test the function with some inputs
        System.out.println(isBalanced("{[()]}"));  // Output: YES
        System.out.println(isBalanced("{[(])}"));  // Output: NO
        System.out.println(isBalanced("{{[[(())]]}}"));  // Output: YES
    }
}
