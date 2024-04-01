package test;
//How to check if two strings are rotations of each other? (solution)
//e.g. if the given String is "XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.
public class StringRotation {

	public static void main(String[] args) {

		String str1="XYZ";
		String str2="ZXY";
		
		System.out.println(checkRotation(str1,str2));

	}

	private static String checkRotation(String str1, String str2) {
		int i=0;
		int j=str2.length()-1;
		
		if(str1.charAt(j)==str2.charAt(i)) {
		
	}
		return str2;
	}

}
