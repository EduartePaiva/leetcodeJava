package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private final TwoSum solution = new TwoSum();

    @Test
    void test1() {
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;
        int[] output = { 0, 1 };

        assertArrayEquals(solution.twoSum(nums, target), output);
    }

}
