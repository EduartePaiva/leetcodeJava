package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarFleetTest {
    static final CarFleet s = new CarFleet();

    @Test
    void test1() {
        var target = 10;
        int[] position = { 1, 4 };
        int[] speed = { 3, 2 };
        int expected = 1;

        assertEquals(expected, s.carFleet(target, position, speed));
    }

    @Test
    void test2() {
        var target = 10;
        int[] position = { 4, 1, 0, 7 };
        int[] speed = { 2, 2, 1, 1 };
        int expected = 3;

        assertEquals(expected, s.carFleet(target, position, speed));
    }
}
