package string;

public class ReverseWordsString_151 {

	public static void main(String[] args) {
		ReverseWordsString_151 sol = new ReverseWordsString_151();
	        System.out.println(sol.reverseWords("  the sky is  blue  ")); // Output: "blue is sky the"
	        System.out.println(sol.reverseWords(" hello world ")); // Output: "world hello"
	        System.out.println(sol.reverseWords("a good   example")); // Output: "example good a"
	  

	}
	
	public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by spaces, removing extra spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }


}
