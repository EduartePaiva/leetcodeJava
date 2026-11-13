package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        var s = new Stack<String>();

        for (String token : tokens) {
            int val1 = 0, val2 = 0;
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                val2 = Integer.parseInt(s.pop());
                val1 = Integer.parseInt(s.pop());
            }

            switch (token) {
                case "+":
                    s.push(Integer.toString(val1 + val2));
                    break;
                case "-":
                    s.push(Integer.toString(val1 - val2));
                    break;
                case "*":
                    s.push(Integer.toString(val1 * val2));
                    break;
                case "/":
                    s.push(Integer.toString(val1 / val2));
                    break;
                default:
                    s.push(token);
                    break;
            }

        }

        return Integer.parseInt(s.pop());
    }
}
