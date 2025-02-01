package Sliding_Window;

public class Brute_Force_Approach {

	public static void main(String[] args) {
		
		int [] array = {100, 200, 300, 400,500, 600};
		int k= 3;
		int max = Integer.MIN_VALUE;

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
