package learning;

public class Sliding_Window_Brute_Force {

	public static void main(String[] args) {
		//Time complexity: O(k*n) as it contains two nested loops.		
		
		int [] array = {100, 200, 300, 400,500, 600};
		int k= 2;
		int max = Integer.MIN_VALUE;
		// System.out.println(max); output:- -2147483648

		 for (int i = 0; i <=array.length - k; i++) {
	            int sum = 0;
	            // Sum up the elements in the current window
	            for (int j = i; j < i + k; j++) {
	                sum += array[j];
	            }
	            // Update maxSum if needed
	            max = Math.max(max, sum);
	        }		
		 System.out.println(max);
	}

}
