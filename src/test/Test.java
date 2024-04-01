package test;

public class Test {

	static int i=1111;
	static int j=0;
	static {
		i=i-- - --i;
	}
	{
		j=i++ + ++i;
		
	}
	public static void main(String[] args) {
		System.out.println(j);

	}

}
