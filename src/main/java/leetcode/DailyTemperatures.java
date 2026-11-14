package leetcode;

import java.util.Stack;

public class DailyTemperatures {
    private record TemperatureIndex(int temperature, int index) {
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<TemperatureIndex> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            int curTemp = temperatures[i];
            while (!stack.isEmpty() && stack.peek().temperature <= curTemp) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                res[i] = stack.peek().index - i;
            }

            stack.push(new TemperatureIndex(curTemp, i));
        }

        return res;
    }
}
