//Input: aaab
//Output: ab
package string;

import java.util.Arrays;

public class LongestSubString_UniqueCharacter {

	static final int MAX_CHARS = 256;
	
	public static void main(String[] args) {
		String str  = "aabcbcdbca";
						
		String result  = longestSubString(str);
		
		System.out.println(result);		
	}

	public static String longestSubString(String str) {
		
		
		int length = str.length();
		
		if(length<1) {
			return "invalid String";
		}
		
		int dist_count = 0;
		boolean[] visited = new boolean[MAX_CHARS];
		Arrays.fill(visited, false);
		 
		for(int i=0; i<length; i++) {
			if(visited[str.charAt(i)]==false) {
				visited[str.charAt(i)]=true;
				dist_count++;
			}
		}
		
		int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;
        
        int[] curr_count = new int[MAX_CHARS];
        
        
        for (int j = 0; j <length; j++) {
        	curr_count[str.charAt(j)]++;
        	
        	if (curr_count[str.charAt(j)] == 1)
                count++;
        	
        	// if all the characters are matched
            if (count == dist_count) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of
                // times than its occurrence in pattern, if
                // yes then remove it from starting and also
                // remove the useless characters.
                while (curr_count[str.charAt(start)] > 1) {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
                
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index,
                             start_index + min_len);
	}
}
