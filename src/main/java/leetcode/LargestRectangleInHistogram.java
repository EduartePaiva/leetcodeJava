package leetcode;

import java.util.Stack;

record Rectangle(int height, int index) {
}

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        // the biggest rectangle with height n is something

        var stack = new Stack<Rectangle>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int h = heights[i];

            if (stack.isEmpty()) {
                stack.push(new Rectangle(h, i));
                continue;
            }

            while (!stack.isEmpty() && stack.peek().height() > h) {
                var topRectangle = stack.pop();
                maxArea = Integer.max(maxArea, (i - topRectangle.index() * topRectangle.height()));
            }

        }

        return maxArea;
    }
}
