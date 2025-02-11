package SlidingWindow;

public class NumberofSubstringsContainingAllThreeCharacters_1358 {

	public static void main(String[] args) {
		String s = "aaabcabc";
		System.out.println(numberOfSubstrings(s));
	}

	public static int numberOfSubstrings(String s) {
		int left = 0, count = 0;
        int[] freq = new int[3]; // To count occurrences of 'a', 'b', 'c'

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++; // Include current character

            // Check if we have at least one 'a', 'b', and 'c' in the window
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right; // Add all substrings that start at `left`
                freq[s.charAt(left) - 'a']--; // Shrink the window
                left++;
            }
        }
        return count;
    }
}
