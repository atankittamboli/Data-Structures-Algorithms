package array;

public class Remove_Element {

	public static void main(String[] args) {
		
		int [] nums = {3,2,2,3};
		int val = 3;
		int result  = removeElement(nums, val);
		System.out.println(result);
	}
	
	public static int removeElement(int[] nums, int val) {
        
        if(nums.length==0){
            return 0;
        }

        int result =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }

}
