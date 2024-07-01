package string;

import java.math.BigInteger;

/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.*/
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();

        int[] n1 = new int[l1];
        int[] n2 = new int[l2];

        for (int i = 0; i < l1; i++) {
            n1[i] = num1.charAt(l1 - 1 - i) - '0';
            System.out.println(n1[i]);
        }

        for (int i = 0; i < l2; i++) {
            n2[i] = num2.charAt(l2 - 1 - i) - '0';
        }

        int[] result = new int[l1 + l2];

        for (int i = 0; i < l1; i++) {
            int carry = 0;
            for (int j = 0; j < l2; j++) {
                int product = n1[i] * n2[j] + carry + result[i + j];
                carry = product / 10;
                result[i + j] = product % 10;
            }
            result[i + l1] = carry;
        }

        StringBuilder sb = new StringBuilder();
        int i = result.length - 1;
        while (i > 0 && result[i] == 0) {
            i--;
        }
        while (i >= 0) {
            sb.append(result[i--]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        MultiplyStrings obj = new MultiplyStrings();
        System.out.println(obj.multiply("498828660196", "840477629533"));

    }

}
