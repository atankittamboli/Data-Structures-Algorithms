package string;

public class StringtoInteger_8 {

	public static void main(String[] args) {
		StringtoInteger_8 sol = new StringtoInteger_8();
	        System.out.println(sol.myAtoi("42"));             // Output: 42
	        System.out.println(sol.myAtoi("   -42"));         // Output: -42
	        System.out.println(sol.myAtoi("4193 with words"));// Output: 4193
	        System.out.println(sol.myAtoi("words 987"));      // Output: 0
	        System.out.println(sol.myAtoi("-91283472332"));   // Output: -2147483648 (Integer.MIN_VALUE)
	   

	}

	public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // Step 1: Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check sign (+ or -)
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert number and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

}
