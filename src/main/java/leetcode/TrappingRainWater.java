package leetcode;

public class TrappingRainWater {
    public int trap(int[] height) {
        int[] maxHeightFromRight = new int[height.length];
        int lastIdx = height.length - 1;
        maxHeightFromRight[lastIdx] = height[lastIdx];

        for (int i = lastIdx - 1; i >= 0; i--) {
            maxHeightFromRight[i] = Integer.max(height[i], maxHeightFromRight[i + 1]);
        }

        int maxHeightLeft = height[0];
        int waterAmount = 0;

        for (int i = 1; i < height.length - 1; i++) {
            waterAmount += Integer.max(0, Integer.min(maxHeightLeft, maxHeightFromRight[i]) - height[i]);
            maxHeightLeft = Integer.max(maxHeightLeft, height[i]);
        }

        return waterAmount;
    }
}