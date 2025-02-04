package array;

public class Search_Insert_Position {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 5;
		int result  = searchInsert(nums, target);
		System.out.println(result);
	}
	
	public static int searchInsert(int[] nums, int target) {

        if(nums.length==0){
            return 0;
        }

             
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

}
