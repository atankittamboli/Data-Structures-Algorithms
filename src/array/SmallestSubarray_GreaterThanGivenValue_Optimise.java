//Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
//Output: 3
//Explanation: Minimum length subarray is [4, 45, 6]


package array;

public class SmallestSubarray_GreaterThanGivenValue_Optimise {

	public static void main(String[] args) {

		int []array = {1, 4, 45, 6, 0, 19};
		int target = 51;
		
		int min_size = minLength(array, target);
		System.out.println(min_size);

	}
	
	public static int minLength(int [] array, int target) {
		 int i = 0, j = 0;
	        int sum = 0;
	        int ans = Integer.MAX_VALUE;

	        while (j < array.length) {

	            // Expand window until sum > x 
	            // or end of array reached
	            while (j < array.length && sum <= target) {
	                sum += array[j++];
	            }

	            // If we reached end of array and sum 
	            // still <= x, no valid subarray exists
	            if (j == array.length && sum <= target) break;

	            // Minimize window from start 
	            // while maintaining sum > x
	            while (i < j && sum - array[i] > target) {
	                sum -= array[i++];
	            }

	            ans = Math.min(ans, j - i);

	            // Remove current start 
	            // element and shift window
	            sum -= array[i];
	            i++;
	        }

	        // Return 0 if no valid subarray
	        // found, else return min length
	        if (ans == Integer.MAX_VALUE) return 0;
	        return ans;
	    
	}

}
