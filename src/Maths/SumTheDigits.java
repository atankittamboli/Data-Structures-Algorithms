package Maths;

public class SumTheDigits {

	public static void main(String[] args) {
				
		System.out.println(sumOfDidgit(12));
	}
	
	public static int sumOfDidgit(int num) {
		int result = 0;
		if(num<9) {
			return num;
		}else {
			while(num>9) {
				
				result += num%10;
				num = num/10;
			}
			result = result+num;
		}
		return result;
	}
}
