package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubstringsDistinctCharacters_1876 {
	public static void main(String[] args) {		
		String str = "aababcabc";
		System.out.println(getSubString(str));		
	}

	private static int getSubString(String str) {
		
		int windowSize = 3;
		int i=0;
		
		int result =0;
		String s = "";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		while(i<windowSize) {
			s += str.charAt(i);
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			i++;
		}
		if(map.size()==3) {
			result++;
		}
		for(int j=windowSize; j<str.length(); j++) {
			s += str.charAt(j);
			s = s.substring(j-windowSize+1, j+1);
			System.out.println("s:"+s);
			Map<Character,Integer> newMap = new HashMap<Character,Integer>();
			newMap.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			if(newMap.size()==3) {
				result++;
			}
		}
		
		return result;
	}
}
