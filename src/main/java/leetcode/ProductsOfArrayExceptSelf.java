package leetcode;

public class ProductsOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var output = new int[nums.length];
        var leftRight = new int[nums.length];
        var rightLeft = new int[nums.length];

        leftRight[0] = nums[0];
        rightLeft[nums.length - 1] = nums[nums.length - 1];

        for (var i = 1; i < nums.length; i++) {
            leftRight[i] = nums[i] * leftRight[i - 1];
        }
        for (var i = nums.length - 2; i >= 0; i--) {
            rightLeft[i] = nums[i] * rightLeft[i + 1];
        }

        output[0] = rightLeft[1];
        output[nums.length - 1] = leftRight[nums.length - 2];

        for (var i = 1; i < nums.length - 1; i++) {
            output[i] = leftRight[i - 1] * rightLeft[i + 1];
        }

        return output;
    }
}
