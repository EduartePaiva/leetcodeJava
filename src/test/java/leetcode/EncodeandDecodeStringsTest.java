package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class EncodeandDecodeStringsTest {
    private final EncodeandDecodeStrings solution = new EncodeandDecodeStrings();

    @Test
    void testEncode() {
        List<String> input = List.of("hello", "world");
        String expected = "5:hello5:world";
        String actual = solution.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    void testDecode() {
        String input = "5:hello5:world";
        List<String> expected = List.of("hello", "world");
        List<String> actual = solution.decode(input);

        assertEquals(expected, actual);
    }
}
