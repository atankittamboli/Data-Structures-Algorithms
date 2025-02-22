package string;

public class StringCompression_443 {

	public static void main(String[] args) {
		StringCompression_443 sol = new StringCompression_443();
        char[] chars1 = {'a','a','b','b','c','c','c'};
        System.out.println(sol.compress(chars1));  // Output: 6 (Modified: ['a','2','b','2','c','3'])

        char[] chars2 = {'a'};
        System.out.println(sol.compress(chars2));  // Output: 1 (Modified: ['a'])

        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(sol.compress(chars3));  // Output: 4 (Modified: ['a','b','1','2'])

	}
	
	 public int compress(char[] chars) {
	        int index = 0;  // Position to write
	        int i = 0;      // Pointer to traverse input

	        while (i < chars.length) {
	            char currentChar = chars[i];
	            int count = 0;

	            // Count occurrences of the current character
	            while (i < chars.length && chars[i] == currentChar) {
	                i++;
	                count++;
	            }

	            // Write the character to the array
	            chars[index++] = currentChar;

	            // If count > 1, convert to string and store digits separately
	            if (count > 1) {
	                for (char c : String.valueOf(count).toCharArray()) {
	                    chars[index++] = c;
	                }
	            }
	        }

	        return index;  // Return new length of the array
	    }

}
