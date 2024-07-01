package string;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();

        while (i < j) {
            int left = s.charAt(i);
            if ((left < 97 || left > 122) && (left < 48 || left > 57)) {
                i++;
                continue;
            }
            int right = s.charAt(j);
            if ((right < 97 || right > 122) && (right < 48 || right > 57)) {
                j--;
                continue;
            }
            if (left != right)
                return false;
            i++;
            j--;

        }

        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(ValidPalindrome.isPalindrome("0A man, a plan, a canal: Panama0"));
        System.out.println(System.currentTimeMillis() - start);
    }
}
