package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring76 {

	public static void main(String[] args) {
		MinimumWindowSubstring76 sol = new MinimumWindowSubstring76();
        System.out.println(sol.minWindow("ADOBECODEBANC", "ABC")); // Output: "BANC"
        System.out.println(sol.minWindow("a", "a")); // Output: "a"
        System.out.println(sol.minWindow("a", "aa")); // Output: ""
	}

	 public String minWindow(String s, String t) {
	        if (s.length() < t.length()) return "";

	        HashMap<Character, Integer> charCountT = new HashMap<>();
	        for (char c : t.toCharArray()) {
	            charCountT.put(c, charCountT.getOrDefault(c, 0) + 1);
	        }

	        int required = charCountT.size();
	        int left = 0, right = 0, formed = 0;
	        int[] ans = {-1, 0, 0};

	        HashMap<Character, Integer> windowCounts = new HashMap<>();

	        while (right < s.length()) {
	            char c = s.charAt(right);
	            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

	            if (charCountT.containsKey(c) && windowCounts.get(c).intValue() == charCountT.get(c).intValue()) {
	                formed++;
	            }

	            while (left <= right && formed == required) {
	                c = s.charAt(left);
	                if (ans[0] == -1 || right - left + 1 < ans[0]) {
	                    ans[0] = right - left + 1;
	                    ans[1] = left;
	                    ans[2] = right;
	                }

	                windowCounts.put(c, windowCounts.get(c) - 1);
	                if (charCountT.containsKey(c) && windowCounts.get(c) < charCountT.get(c)) {
	                    formed--;
	                }
	                left++;
	            }
	            right++;
	        }

	        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	    }
}
