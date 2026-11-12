package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();

                if ((c == ']' && top == '[') ||
                        (c == '}' && top == '{') ||
                        (c == ')' && top == '(')) {
                    stack.pop();
                    continue;
                }

            }
            stack.push(c);

        }

        return stack.isEmpty();
    }
}
