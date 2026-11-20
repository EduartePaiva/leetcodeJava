package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    static final ContainerWithMostWater s = new ContainerWithMostWater();

    @Test
    void testMaxArea() {
        int[] heights = { 2, 2, 2 };

        assertEquals(4, s.maxArea(heights));
    }

    @Test
    void testMaxArea2() {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };

        assertEquals(36, s.maxArea(heights));
    }
}
