package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ContainsDuplicateTest {
    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void test1() {
        assertTrue(solution.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void test2() {
        assertFalse(solution.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }
}