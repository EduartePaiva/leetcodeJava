package leetcode;

import java.util.Stack;

public class MinStack {
    int minVal;
    Stack<Integer> stack;
    Stack<Integer> prefixMin;

    public MinStack() {
        this.minVal = Integer.MAX_VALUE;
        stack = new Stack<>();
        prefixMin = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minVal = Integer.min(minVal, val);
        prefixMin.push(minVal);
    }

    public void pop() {
        stack.pop();
        prefixMin.pop();

        if (prefixMin.isEmpty()) {
            minVal = Integer.MAX_VALUE;
        } else {
            this.minVal = prefixMin.peek();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal;
    }
}
