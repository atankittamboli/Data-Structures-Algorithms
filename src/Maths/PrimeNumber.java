package Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 10;				
		System.out.println(isItPrime(num));
		allPrimeNumber(num);
					
	}
	
	private static String isItPrime(int num) {
		 if (num <= 1) return "No"; 
		 if (num == 2) return "Yes";
		 if (num % 2 == 0) return "No";
		 
		for(int i=3; i<Math.sqrt(num);  i+=2) {
			if(num%i==0) {
				return "No";
			}
		}
		return "Yes";
	}

	private static void allPrimeNumber(int num) {

		if(num>=2) {
			System.out.println("2");
		}
		for (int i = 3; i <= num; i += 2) { // Skip even numbers after 2
			boolean isPrime = true;

			// Check divisibility up to sqrt(i)
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break; // Exit early if not prime
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
		}

	}
}
