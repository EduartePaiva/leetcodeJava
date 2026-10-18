package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class P0217_ContainsDuplicateTest {
    private final P0217_ContainsDuplicate solution = new P0217_ContainsDuplicate();

    @Test
    void test1() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
    @Test
    void test2() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}