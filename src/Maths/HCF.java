package Maths;

//Input 1:-15 105 Output 1:-15
//
//Input 2:- 24 36 Output 2:-12
public class HCF {

	public static void main(String[] args) {
				
		System.out.println(hcf(24, 36));
		
	}

	public static int hcf(int a, int b) {

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
