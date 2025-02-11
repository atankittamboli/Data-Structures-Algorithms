package SlidingWindow;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(minSubArrayLen(target, nums));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Expand the window

            while (sum >= target) { // Try to shrink the window
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left]; // Remove leftmost element
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
	}
}
