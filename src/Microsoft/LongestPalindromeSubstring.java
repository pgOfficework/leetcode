package Microsoft;

public class LongestPalindromeSubstring {

	public static int start = 0;
	public static int end = 0;

	private static void palindrome(char[] ch, int i) {
		int a = i;
		int b = i;
		int n = ch.length;
		if (i >= n - 1)
			return;
		while (b < n - 1 && ch[b] == ch[b + 1]) {
			b++;
		}
		i = b;
		while (a > 0 && b < n - 1 && ch[a - 1] == ch[b + 1]) {
			a--;
			b++;
		}
		if ((end - start) < (b - a)) {
			end = b;
			start = a;
		}
		palindrome(ch, i + 1);
	}

	public static String longestPalindrome(String s) {
		char[] ch = s.toCharArray();

		palindrome(ch, 0);
		return s.substring(start, end + 1);

	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abaab"));
	}
}
