package leetcode;

import java.util.Stack;

public class LargestRectangleInHistogram {
    record Rectangle(int height, int index) {
    }

    public int largestRectangleArea(int[] heights) {
        var stack = new Stack<Rectangle>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int h = heights[i];
            int curIndex = i;

            while (!stack.isEmpty() && stack.peek().height() > h) {
                var topRectangle = stack.pop();
                maxArea = Integer.max(maxArea, ((i - topRectangle.index()) * topRectangle.height()));
                curIndex = topRectangle.index();
            }

            stack.push(new Rectangle(h, curIndex));

        }

        while (!stack.isEmpty()) {
            var topRectangle = stack.pop();
            maxArea = Integer.max(maxArea, ((heights.length - topRectangle.index()) * topRectangle.height()));
        }

        return maxArea;
    }
}
