package array;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		  int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0}; // Output: [1,0,0,2,3,0,0,4]
	        duplicateZeros(arr1);
	        System.out.println(Arrays.toString(arr1));

	        int[] arr2 = {1, 2, 3}; // Output: [1,2,3]
	        duplicateZeros(arr2);
	        System.out.println(Arrays.toString(arr2));

	}

	public static void duplicateZeros(int[] arr) {
        int zeroCount = 0, n = arr.length;
        
        // Count the number of zeros (to determine final shift)
        for (int num : arr) {
            if (num == 0) zeroCount++;
        }

        // Process from the end
        for (int i = n - 1, j = n + zeroCount - 1; i >= 0; i--, j--) {
            if (j < n) arr[j] = arr[i]; // Shift element if within bounds
            
            if (arr[i] == 0) { // If zero, duplicate it
                j--;
                if (j < n) arr[j] = 0;
            }
        }
	}
}
