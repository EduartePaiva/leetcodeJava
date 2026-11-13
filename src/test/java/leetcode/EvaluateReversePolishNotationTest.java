package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {
    static final EvaluateReversePolishNotation s = new EvaluateReversePolishNotation();

    @Test
    void test1() {
        String input[] = { "1", "2", "+", "3", "*", "4", "-" };

        assertEquals(5, s.evalRPN(input));
    }

    @Test
    void test2() {
        String input[] = { "2", "1", "+", "3", "*" };

        assertEquals(9, s.evalRPN(input));
    }
}
