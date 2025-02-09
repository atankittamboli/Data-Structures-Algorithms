package string;
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.

public class LengthofLastWord_58 {

	public static void main(String[] args) {
		String str  = "Hello World";
		System.out.println(calculateLength(str));
	}
	
	public static int calculateLength(String str) {
		str  = str.trim();
		
		return str.length()-str.lastIndexOf(" ")-1;
	}

}
