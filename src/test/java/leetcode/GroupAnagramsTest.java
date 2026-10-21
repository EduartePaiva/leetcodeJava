package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {
    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void test1() {
        String[] input = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> expected = List.of(
                List.of("act", "cat"),
                List.of("hat"),
                List.of("pots", "stop", "tops"));
        var actual = normalizeListOfList(solution.groupAnagrams(input));

        assertEquals(expected, actual);
    }

    List<List<String>> normalizeListOfList(List<List<String>> lists) {
        List<List<String>> normalized = new ArrayList<>();

        for (List<String> group : lists) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            normalized.add(sortedGroup);
        }

        normalized.sort((a, b) -> String.join(",", a).compareTo(String.join(",", b)));

        return normalized;
    }

}
