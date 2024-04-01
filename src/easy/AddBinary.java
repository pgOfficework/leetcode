/*Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

package easy;

public class AddBinary {

	public static void main(String[] args) {
		System.out.println("result = " + addBinary("11", "1"));

	}

	public static String addBinary(String a, String b) {
		int borrow = 0;
		System.out.println(a == b);
		String a1 = (a.length() >= b.length()) ? b : a;
		String b1 = (a.length() >= b.length()) ? a : b;
		System.out.println(a.length());
		String result = "";
		int i = 0;

		for (i = a1.length() - 1; i >= 0; i--) {
			System.out.println("i=" + i);
			int num1 = Character.getNumericValue(a1.charAt(i));
			int num2 = Character.getNumericValue(b1.charAt(i));

				if (num1 + num2 + borrow == 1) {
					result = 1 + result;
					borrow = 0;
				} else if (num1 + num2 + borrow == 2) {
					result = 0 + result;
					borrow = 1;
				} else if (num1+num2+borrow==3) {
					result=1+result;
					borrow=1;
				} 
				else {
					result = 0 + result;
					borrow = 0;
				}
		}
		
		
			
			for (int j=b1.length()-a1.length()-1; j >=0; j--) {
				System.out.println("b "+borrow);
				if(borrow==1) {
				int num2 = Character.getNumericValue(b1.charAt(j));
				if(num2+borrow==2) {
					result=0+result;
					borrow=1;
				}
				else if (num2+borrow==1) {
					result=1+result;
					borrow=0;
				}else {
					result = 0 + result;
					borrow = 0;
				}
			}
		}
			if(borrow==1) {
				result=borrow+result;
			}

		System.out.println(borrow);
		return result.toString();

	}

}
