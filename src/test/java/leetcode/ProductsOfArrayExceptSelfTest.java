package leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductsOfArrayExceptSelfTest {
    private final ProductsOfArrayExceptSelf solution = new ProductsOfArrayExceptSelf();

    @Test
    void test1() {
        var input = new int[] { 1, 2, 4, 6 };
        var expected = new int[] { 48, 24, 12, 8 };

        assertArrayEquals(expected, solution.productExceptSelf(input));
    }
}
