package leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void test1() {
        String s = "racecar";
        String t = "carrace";

        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    void test2() {
        String s = "jar";
        String t = "jam";

        assertFalse(solution.isAnagram(s, t));
    }

    @Test
    void test3() {
        String s = "x";
        String t = "x";

        assertTrue(solution.isAnagram(s, t));
    }

}
