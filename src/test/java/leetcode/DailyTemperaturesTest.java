package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {
    final static DailyTemperatures s = new DailyTemperatures();

    @Test
    void test1() {
        int[] temperatures = { 30, 38, 30, 36, 35, 40, 28 };

        int[] expected = { 1, 4, 1, 2, 1, 0, 0 };

        assertArrayEquals(expected, s.dailyTemperatures(temperatures));
    }
}
