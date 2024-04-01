package IBM;

public class NthFibonacciNumber {
	public static void main(String[] args) {

		int n = 10;

		int num1 = 0;
		int num2 = 1;
		int res=0;
		
		for (int i = 1; i < n; i++) {
			res=num1+num2;
			num1=num2;
			num2=res;
		}
		System.out.println(res);
	}
}
