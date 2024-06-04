package string;

//#2414
public class LongestContinuousSubstring {


    private static int longestContinuousSubstring(String s) {
        int result = 1;
        int len = 1;

        char[] c = s.toCharArray();

        for (int i = 1; i < c.length; i++) {

            if (c[i] - c[i - 1] == 1) {
                len++;
            } else {
                len = 1;
            }
            result = Math.max(result, len);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abcde"));
    }
}
