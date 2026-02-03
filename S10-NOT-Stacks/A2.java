import java.util.*;

public class A2 {

    public static boolean isValid(String str) {

        char[] stack = new char[str.length()];
        int top = -1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {
                    return false;
                }

                char last = stack[top--];

                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter parentheses string:");
        String str = in.nextLine();

        if (isValid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
