package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {
    static final LongestConsecutiveSequence s = new LongestConsecutiveSequence();

    @Test
    void test1() {
        int nums[] = { 2, 20, 4, 10, 3, 4, 5 };

        assertEquals(4, s.longestConsecutive(nums));
    }

    @Test
    void test2() {
        int nums[] = { 0, 3, 2, 5, 4, 6, 1, 1 };

        assertEquals(7, s.longestConsecutive(nums));
    }
}
