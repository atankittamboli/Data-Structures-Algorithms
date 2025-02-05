package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int [] nums = {1,1,1,3,3,4,3,2,4,2};
		Boolean result  = containsDuplicate(nums);
		System.out.println(result);
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> uniqueVal =  new HashSet<Integer>();
	    
		for(int i=0; i<nums.length; i++) {
			if(uniqueVal.contains(nums[i])) {
				return true;
			}
			uniqueVal.add(nums[i]);
		}		
	    return false;
	}
}
