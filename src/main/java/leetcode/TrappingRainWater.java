package leetcode;

public class TrappingRainWater {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1, waterAmount = 0;
        int leftMax = height[i], rightMax = height[j];

        while (i < j) {
            if (leftMax < rightMax) {
                i++;
                leftMax = Integer.max(leftMax, height[i]);
                waterAmount += leftMax - height[i];
            } else {
                j--;
                rightMax = Integer.max(rightMax, height[j]);
                waterAmount += rightMax - height[j];
            }
        }

        return waterAmount;
    }
}