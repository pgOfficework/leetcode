package practice;

public class N06TechNumber {
	public static void main(String[] args) {
		int number = 1312;
		int num1 = number;
		int digit = 0;

		while (num1 > 0) {
			num1 = num1 / 10;
			digit++;
		}
		num1 = number;
		int num2 = 0;
		int rem = 1;

		if (digit % 2 == 0) {
			digit = digit / 2;

			for (int i = 0; i <= digit / 2; i++) {
				rem = rem * 10;
			}
			num2 = num1 % rem;
			num1 = num1 / rem;

			if ((num1 + num2) * (num1 + num2) == number) {
				System.out.println("Tech Number");
			} else {
				System.out.println("Not Tech Number");
			}
		}

	}

}
