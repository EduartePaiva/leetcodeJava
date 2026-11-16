package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {
    static final LargestRectangleInHistogram s = new LargestRectangleInHistogram();

    @Test
    void test1() {
        int[] heights = { 7, 1, 7, 2, 2, 4 };

        assertEquals(8, s.largestRectangleArea(heights));
    }
}
