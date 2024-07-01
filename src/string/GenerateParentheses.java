package string;

import java.util.ArrayList;
import java.util.List;

/* Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();

        helper(list, "", n, n);
        return list;

    }

    private void helper(List<String> list, String string, int left, int right) {

        if (left < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            list.add(string);
            return;
        }
        helper(list, string + "(", left - 1, right);
        helper(list, string + ")", left, right - 1);

    }

    public static void main(String[] args) {
        GenerateParentheses obj = new GenerateParentheses();
        List<String> list = obj.generateParenthesis(3);

        for (String string : list) {
            System.out.println(string);
        }

    }

}
