package learning;
//Input  : arr[] = {100, 200, 300, 400}, k = 2
//Output : 700

public class Sliding_Window {

	public static void main(String[] args) {
//		Time Complexity: O(n)
		
		int [] array = {100, 200, 300, 400,500, 600};
		int k= 2;

		int max_sum = maxSum(array, k);
		System.out.println(max_sum);
	}

	public static int maxSum(int [] array, int k) {
		if(array.length<=k) {
			return -1;
		}
		int max_sum = 0;
		
		for(int i=0; i<k; i++) {
			max_sum += array[i];
		}
		
		int window_sum = max_sum;
		for(int j =k; j<array.length; j++) {
			 window_sum += array[j] - array[j - k];
	         max_sum = Math.max(max_sum, window_sum);			
		}
		
		return max_sum;
	}
}
