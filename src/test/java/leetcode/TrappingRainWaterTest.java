package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    static final TrappingRainWater s = new TrappingRainWater();

    @Test
    void testTrap() {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };

        assertEquals(9, s.trap(height));
    }
}
