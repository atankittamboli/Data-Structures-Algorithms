package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {

	public static void main(String[] args) {
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));

	}

	 public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(candidates);  // Sort to handle duplicates
	        backtrack(result, new ArrayList<>(), candidates, target, 0);
	        return result;
	    }
	 
	  private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target, int start) {
	        if (target == 0) {
	            result.add(new ArrayList<>(tempList));
	            return;
	        }

	        for (int i = start; i < candidates.length; i++) {
	            // Skip duplicate elements
	            if (i > start && candidates[i] == candidates[i - 1]) continue;
	            if (candidates[i] > target) break;  // Stop if value exceeds target

	            tempList.add(candidates[i]);
	            backtrack(result, tempList, candidates, target - candidates[i], i + 1); // Move to next index
	            tempList.remove(tempList.size() - 1);  // Backtrack
	        }
	    }

}
