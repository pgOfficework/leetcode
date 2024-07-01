package string;

//392
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty())
            return true;
        if (t.isEmpty())
            return false;
        int i = 0;
        int j = 0;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }
}
