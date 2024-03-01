//#7
import java.util.Stack;

public class InfixToPostfix {
    // method to return precedence of operators
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // actual method that converts infix expression to postfix expression
    public static String infixToPostfix(String exp) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // if the scanned character is an operand, add it to output
            if (Character.isLetterOrDigit(c))
                result += c;

                // if the scanned character is an '(', push it to the stack
            else if (c == '(')
                stack.push(c);

                // if the scanned character is an ')', pop and output from the stack until an '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            }

            // operator is found
            else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
        }

        // pop all the remaining operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    // example testing
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
