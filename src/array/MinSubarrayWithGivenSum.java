package array;

public class MinSubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1, 4};
		int target = 0;
		getSubArray(arr, target);
	}
	
	private static int[] getSubArray(int [] arr, int target) {
		int [] newArray = null ;
		int i=0;
		while(i<=arr.length) {
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int j=i;
			while(j<arr.length && sum<=target) {
				sum += arr[j];
				if(target==sum) {
					System.out.println(i+" "+j);
					min = Math.min(min, j - i);
					break;
				}
				j++;
			}			
			i++;
		}
		
		return newArray;		
	}

}
