package array;

import java.util.Stack;

public class LongestValidParentheses_32 {

	public static void main(String[] args) {
		String s = "(()))())(";
        System.out.println(longestValidParentheses(s)); // Output: 4

	}

	public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base case to handle edge cases
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop(); // Pop previous '(' index
                if (stack.isEmpty()) {
                    stack.push(i); // Push current index to act as base
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}
