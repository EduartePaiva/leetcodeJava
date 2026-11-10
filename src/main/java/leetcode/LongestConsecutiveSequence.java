package leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // start/end
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 1;
        for (int n : set) {
            // check if it's start of sequence
            if (!set.contains(n - 1)) {
                int end = n;
                do {
                    end++;
                } while (set.contains(end));

                max = Math.max(max, end - n);
            }
        }

        return max;
    }

}
