package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int expectedI = -nums[i];

            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                if (nums[j] + nums[k] == expectedI) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < expectedI) {
                    j++;
                } else {
                    k--;
                }

            }

        }

        return res.stream().toList();
    }
}
