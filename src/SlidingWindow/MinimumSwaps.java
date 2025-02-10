package SlidingWindow;

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 12, 10, 3, 14, 10, 5};
		int B = 8;

		System.out.println(getIndex(A, B));
	}

	private static double getIndex(int [] A, int B){
		
		int n = A.length;
        int count = 0;
        
        // Count elements <= B
        for (int num : A) {
            if (num <= B) count++;
        }
        
        // If count is 0 or 1, no swaps needed
        if (count == 0 || count == 1) return 0;
        
        // Find max elements <= B in any subarray of size 'count'
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] > B) bad++;
        }
        
        int minSwaps = bad;
        
        // Sliding window approach
        for (int i = count; i < n; i++) {
            if (A[i - count] > B) bad--;
            if (A[i] > B) bad++;
            
            minSwaps = Math.min(minSwaps, bad);
        }
        
        return minSwaps;
	}
}