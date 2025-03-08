package array;

public class DivideTwoIntegers_29 {

	public static void main(String[] args) {
		 int dividend = 10, divisor = 3;
	     System.out.println(divide(dividend, divisor)); // Output: 3
	}

	public static int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert both numbers to long to prevent overflow
        long num = Math.abs((long) dividend);
        long den = Math.abs((long) divisor);
        int result = 0;
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1; // Determine sign of result

        while (num >= den) {
            long temp = den, multiple = 1;
            while (num >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            num -= temp;
            result += multiple;
        }

        return sign * result;
    }
}
