package string;

public class SeprateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		separateNumbers("1234");
	}

	public static void separateNumbers(String s) {
		
        if (s.length() < 2) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i <= s.length() / 2; i++) {
            String firstNumberStr = s.substring(0, i);
            long firstNumber = Long.parseLong(firstNumberStr);
            StringBuilder sequence = new StringBuilder(firstNumberStr);

            long nextNumber = firstNumber;
            while (sequence.length() < s.length()) {
                nextNumber++;
                sequence.append(nextNumber);
            }

            if (sequence.toString().equals(s)) {
                System.out.println("YES " + firstNumber);
                return;
            }
        }

        System.out.println("NO");
    }
}
