package lambda;

public class LambdaTest1 {

	public static void main(String[] args) {
		Car car=(source,destination)->"car booked form "+source+" to "+destination;
		System.out.println( car.book("mumbai","Goa"));
	}

}
