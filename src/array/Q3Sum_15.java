package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3Sum_15 {

	public static void main(String[] args) {
		 int[] nums = {-1, 0, 1, 2, -1, -4};
	        System.out.println(threeSum(nums));

	}

	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Need a larger sum, move left pointer to the right
                } else {
                    right--; // Need a smaller sum, move right pointer to the left
                }
            }
        }
        return result;
    }

}
