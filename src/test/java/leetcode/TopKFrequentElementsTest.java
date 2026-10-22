package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void test1() {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;
        int[] expected = { 2, 3 };

        var actual = solution.topKFrequent(nums, k);
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

}
