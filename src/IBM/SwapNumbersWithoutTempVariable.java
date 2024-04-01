package IBM;

public class SwapNumbersWithoutTempVariable {

	public static void main(String[] args) {
		int x = 10, y = 5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x-"+x+" y-"+y);

	}

}
