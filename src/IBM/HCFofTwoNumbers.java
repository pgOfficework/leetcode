package IBM;

public class HCFofTwoNumbers {

	public static void main(String[] args) {
		int num1 = 98;
		int num2 = 56;

		int min = Math.min(num1, num2);
		int res = 1;
		int j = 1;

		while (j < min / 2) {

			if (num1 % j == 0 & num2 % j == 0) {
				res = j;
			}
			j++;
		}

		System.out.println(res);

	}

}
