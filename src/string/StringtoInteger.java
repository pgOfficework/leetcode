package string;

public class StringtoInteger {

	public static void main(String[] args) {
		StringtoInteger obj = new StringtoInteger();
		System.out.println(Integer.MIN_VALUE);

//		System.out.println(Integer.parseInt("92233720"));

		System.out.println(obj.myAtoi("9223372036854775808"));

	}

	private int myAtoi(String string) {
		if (string == null) {
			return 0;
		}
		long result = 0;
		int flag = 1;
		string = string.trim();
		if (string.equals("")) {
			return 0;
		}
		if (string.charAt(0) == '-') {
			flag = -1;
			string = string.substring(1);
		} else if (string.charAt(0) == '+') {
			string = string.substring(1);
		}
		string.intern();

		for (Character c : string.toCharArray()) {
			if (c >= 48 && c <= 57) {
				result = (result * 10) + Integer.parseInt(String.valueOf(c));
			} else {
				break;
			}
			if (result > Integer.MAX_VALUE) {
				break;
			}
			
		}

		result=flag * result;
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) result;

	}

}
