//Input: strs = ["eat","tea","tan","ate","nat","bat"]

//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};

		System.out.println(groupAnagrams(strs));		
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> listOfMap = new HashMap<String, List<String>>();
        for(String str : strs){
            char[] ch  = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            listOfMap.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(listOfMap.values());
    }
}
