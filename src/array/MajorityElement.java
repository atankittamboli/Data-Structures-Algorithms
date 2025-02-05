package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		int result  = majorityElement(nums);
		System.out.println(result);
	}
	
	public static int majorityElement(int[] nums) {		
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			if(map.get(nums[i])>nums.length/2) {
				return nums[i];
			}
		}		
		return -1;
    }
}
