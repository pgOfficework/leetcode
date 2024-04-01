package easy;

/* Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself. */
public class BinaryStringAddition {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
         System.out.println(getResult(a, b));
    }

    public static String getResult(String a, String b) {

        StringBuilder res = new StringBuilder();
        String rem = "0";
        if (a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--) {
            int con;
            // System.out.print("j-" + (j));
            // System.out.print(" i-" + i);
            // System.out.print(" ");

            if (j < 0) {
                b = rem;
                rem = "0";
                j = 0;
                // System.out.print(" if ");
                con = a.charAt(i) + b.charAt(0) + rem.charAt(0);
                // System.out.println("a-" + a.charAt(i) + " b-" + b.charAt(0) + " rem-" + rem.charAt(0) + " con-" + con);
            } else {
                // System.out.print(" else ");
                con = a.charAt(i) + b.charAt(j) + rem.charAt(0);
                // System.out.println("a-" + a.charAt(i) + " b-" + b.charAt(0) + " rem-" + rem.charAt(0) + " con-" + con);
            }
            int num1=a.charAt(i);

            if (num1=='0' && b.charAt(j) == '0' && rem.charAt(0) == '0') {
                res = res.append("0");;
                rem = "0";
            } else if (num1=='1' && b.charAt(j) == '0' && rem.charAt(0) == '0') {
                res = res.append("1");;
                rem = "0";
            } else if (num1=='0' && b.charAt(j) == '1' && rem.charAt(0) == '0') {
                res = res.append("1");;
                rem = "0";
            } else if (num1=='0' && b.charAt(j) == '0' && rem.charAt(0) == '1') {
                res = res.append("1");;
                rem = "0";
            } //
            else if (num1=='1' && b.charAt(j) == '1' && rem.charAt(0) == '0') {
                res = res.append("0");;
                rem = "1";
            } else if (num1=='0' && b.charAt(j) == '1' && rem.charAt(0) == '1') {
                res = res.append("0");;
                rem = "1";
            } else if (num1=='1' && b.charAt(j) == '0' && rem.charAt(0) == '1') {
                res = res.append("0");;
                rem = "1";
            } else if (num1=='1' && b.charAt(j) == '1' && rem.charAt(0) == '1') {
                res = res.append("1");;
                rem = "1";
            }
        }
        if (rem.equals("1")) {
            res = res.append("1");;
        }

        return res.reverse().toString();
    }
}
