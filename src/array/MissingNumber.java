package array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {9,6,4,2,3,5,7,0,1};
			
		System.out.println(missingNumber(nums));
		
	}

	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumExpected  = n*(n+1)/2;
        int realSum  = 0;

        for(int num : nums){
            realSum += num;
        } 
        return sumExpected- realSum;
    }
}
