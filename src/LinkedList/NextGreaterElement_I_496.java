package LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement_I_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>();
	        Stack<Integer> stack = new Stack<>();

	        // Build the next greater map for nums2
	        for (int num : nums2) {
	            while (!stack.isEmpty() && stack.peek() < num) {
	                map.put(stack.pop(), num);
	            }
	            stack.push(num);
	        }

	        // Fill result for nums1
	        int[] result = new int[nums1.length];
	        for (int i = 0; i < nums1.length; i++) {
	            result[i] = map.getOrDefault(nums1[i], -1);
	        }
	        return result;
	    }
}
