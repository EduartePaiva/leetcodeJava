package leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    final static ValidParentheses s = new ValidParentheses();

    @Test
    void test1() {
        assertFalse(s.isValid("[(])"));
    }

    @Test
    void test2() {
        assertTrue(s.isValid("([{}])"));
    }

    @Test
    void test3() {
        assertFalse(s.isValid("(])"));
    }
}
