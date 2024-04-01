package test;

//How to print the duplicate characters from the given String?
public class StringPringDuplicateCharacters {

	public static void main(String[] args) {
		String str = "prathamesh";
		System.out.println(getDuplicate(str));

	}

	private static String getDuplicate(String str) {
		String s = new String();
		int l = str.length();

		for (int i = 0; i < l; i++) {
			char c = str.charAt(i);
			for (int j = i+1; j < l; j++) {
				if (str.charAt(j) == c) {
					if (s.indexOf(c) < 0) {
						s += c;
					}
				}
			}
		}
		return s;
	}

}
