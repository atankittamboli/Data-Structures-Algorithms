package array;
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

public class RotateArray_189 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rightRotate(nums, k);
		System.out.println(nums.toString());

	}

	public static void rightRotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		reverse(arr, 0, n - 1); // Step 1: Reverse whole array
		reverse(arr, 0, k - 1); // Step 2: Reverse first k elements
		reverse(arr, k, n - 1); // Step 3: Reverse remaining elements
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
