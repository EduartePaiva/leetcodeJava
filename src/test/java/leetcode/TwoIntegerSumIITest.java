package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoIntegerSumIITest {
    static final TwoIntegerSumII s = new TwoIntegerSumII();

    @Test
    void test1() {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        int[] expected = { 1, 2 };

        assertArrayEquals(expected, s.twoSum(numbers, target));
    }
}
