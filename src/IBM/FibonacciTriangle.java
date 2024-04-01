package IBM;

import java.util.Iterator;

public class FibonacciTriangle {

	public static void main(String[] args) {
		int n=5;
		
		int num1=0;
		int num2=1;
		int res;
		System.out.println(1);
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				res=num1+num2;
				System.out.print(res+ " ");
				num1=num2;
				num2=res;
			}
			System.out.println();
		}
		
		

	}

}
