package IBM;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 213;

		int commonDivisor = 1;

		int min = Math.min(num1, num2);

		for (int i = 2; i < min; i++) {
			if (num1 % i == 0 & num2 % i == 0) {
				commonDivisor = i;
			}
		}

		System.out.println((num1 * num2) / commonDivisor);

	}

}
