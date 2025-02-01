package learning;

public class Sliding_Window {

	public static void main(String[] args) {
//		Time Complexity: O(n)
		
		int [] array = {100, 200, 300, 400,500, 600};
		int k= 2;

		if(array.length<=k) {
			return;
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
		
		System.out.println(max_sum);
	}

}
