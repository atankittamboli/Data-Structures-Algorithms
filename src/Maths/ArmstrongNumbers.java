package Maths;

import java.util.Scanner;

/*
If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
Example Input

Input 1:

 5
Input 2:

 200


Example Output

Output 1:

1
Output 2:

1
153


Example Explanation

Explanation 1:

1 is an armstrong number.
Explanation 2:

1 and 153 are armstrong number under 200.
*/

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		for (int j = 1; j <= limit; j++) {

			int num = j, n, sum = 0;
			while (num != 0) {
				n = num % 10;
				sum = sum + (n * n * n);
				num = num / 10;
			}
			if (sum == j) {
				System.out.println(j);
			}
		}
	}
}
