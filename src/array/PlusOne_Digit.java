package array;

import java.util.Arrays;

public class PlusOne_Digit {

	public static void main(String[] args) {
		int[] digits = {8,7,9};
		int [] array = plusOne(digits);
		System.out.println(Arrays.toString(array));
	}

	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			 digits[i] = 0;
		}

		int[] newDigits = new int[digits.length + 1];
	    newDigits[0] = 1; // First digit should be 1, others default to 0
	    return newDigits;       
    }
}
