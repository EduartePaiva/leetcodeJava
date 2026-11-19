package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ThreeSumTest {
    static final ThreeSum s = new ThreeSum();

    @Test
    void testThreeSum() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        assertEquals(expected, s.threeSum(nums));
    }
}
