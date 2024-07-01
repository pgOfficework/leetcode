package coderbyte;

import java.util.*;
import java.io.*;

public class Bracket_Matcher {

    public static String BracketMatcher(String str) {
        Stack<Character> stack = new Stack<>();


        for (Character c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return "0";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "1";
        }

        return "0";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }

}
