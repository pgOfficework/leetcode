import java.util.Deque;
import java.util.LinkedList;

public class BalancedBrackets {
    public static void main(String[] args) {

        // Write your code here

        String s = "()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}";

        if (null == s || ((s.length() % 2) != 0)) {
            System.out.println("No1");
        } else {
            char[] ch = s.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    System.out.println("No2");
                }
            }
        }

        // char[] ch = s.toCharArray();

        Deque<Character> deque = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
                //		System.out.println("sss " + deque);
            } else {
                if (!deque.isEmpty() && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']') || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    System.out.println("No");
                }
            }
        }
        if (deque.isEmpty()) {
            System.out.println("YES");
        }

//		
//		System.out.println(stringLength);
//
//		if (stringLength % 2 != 0)
//			System.out.println("No1");
//
//		for (int i = 0; i < stringLength / 2-1; i++) {
//			if (ch[i] != ch[stringLength-1 - i]) {
//				System.out.println("No "+ch[i]+ch[stringLength-1 - i]);
//				
//			}
//		}
//		System.out.println("YES");

        // Write your code here

    }
}
