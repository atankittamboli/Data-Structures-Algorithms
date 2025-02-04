package array;

public class RemoveDuplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}
	
	
	public static int removeDuplicates(int[] nums) {		
		  int i=0;
	        for(int j=1;j<nums.length;j++){
	            if(nums[i]!=nums[j]){
	                i++;
	                nums[i]=nums[j];
	            }
	        }
	        return i+1;	    
    }

}
