package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // union find problem????

        // start/end
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

        for (int n : nums) {
            int start = n;
            int end = getEndNode(start, table);

            table.put(start, end);

        }

        int max = 1;

        for (int start : table.keySet()) {
            int end = getEndNode(start, table);

            max = Integer.max((end - start) + 1, max);

        }

        return max;
    }

    private int getEndNode(int start, HashMap<Integer, Integer> table) {
        int cur = start;

        while (table.containsKey(cur)) {
            int nextValue = table.get(cur);
            if (nextValue == cur) {
                break;
            }
            table.put(cur, table.getOrDefault(nextValue, nextValue));

            cur = nextValue;
        }

        return cur;
    }
}
