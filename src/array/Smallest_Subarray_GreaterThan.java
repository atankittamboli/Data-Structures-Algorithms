package array;
//Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
//Output: 3
//Explanation: Minimum length subarray is [4, 45, 6]

public class Smallest_Subarray_GreaterThan {

	public static void main(String[] args) {
		int []array = {1, 4, 45, 6, 0, 19};
		int target = 51;
		
		int min_size = min(array, target);
		System.out.println(min_size);
	}
	
	public static int min(int [] array, int target) {
		int min_size =array.length;
		
		
		for(int i=0; i<array.length; i++) {
			int current =0;
			for(int j=i; j<array.length; j++) {
				current += array[j];
				if(target<current) {
					min_size = Math.min(min_size, j-i+1);
				}
			}
		}
		return min_size;
	}

}
