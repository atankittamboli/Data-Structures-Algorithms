package string;

public class HackerRank_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputStr = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
		String str  = hackerrankInString(inputStr);
		System.out.println(str);
	}

	public static String hackerrankInString(String s) {
	    
		 String str = "hackerrank";
		    int i = 0; // Pointer for the "hackerrank" string

		    for (int j = 0; j < s.length(); j++) {
		        if (i < str.length() && str.charAt(i) == s.charAt(j)) {
		            i++; // Move the pointer for "hackerrank"
		        }
		        if (i == str.length()) { // Check if all characters of "hackerrank" are found
		            return "YES";
		        }
		    }

		    return "NO";
	}

}
