package SlidingWindow;

import java.util.ArrayList;

public class SubarrayWithGivenSumAndLength {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(4);
		A.add(3);
		A.add(2);
		A.add(6);
		A.add(1);

		int B = 3;
		int C = 11;
		
		System.out.println(check(A, B, C));
	}
	
	private static int check(ArrayList<Integer> A, int B, int C) { if (A.size() < B) return 0; // Edge case: If array size is smaller than B

    int windowSum = 0;

    for (int i = 0; i < B; i++) {
        windowSum += A.get(i);
    }

    if (windowSum == C) return 1;

    for (int i = B; i < A.size(); i++) {
        windowSum += A.get(i);       
        windowSum -= A.get(i - B);   
        
        if (windowSum == C) return 1;
    }

    return 0; 
    }
}
