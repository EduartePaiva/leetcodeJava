package leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    static final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void test1() {
        String s = "Was it a car or a cat I saw?";

        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void test2() {
        String s = "tab a cat";

        assertFalse(solution.isPalindrome(s));
    }
}
