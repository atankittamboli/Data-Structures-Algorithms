//Input: aaab
//Output: ab
package string;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubString_UniqueCharacter {

	
	public static void main(String[] args) {
		String str  = "abcabcbb";
								
		System.out.println(lengthOfLongestSubstring(str));		
	}

	public static int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0, maxLength = 0;
		HashSet<Character> set = new HashSet<>();

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				maxLength = Math.max(maxLength, right - left + 1);
				right++; // Expand window
			} else {
				set.remove(s.charAt(left));
				left++; // Shrink window
			}
		}

		return maxLength;
	}
}
