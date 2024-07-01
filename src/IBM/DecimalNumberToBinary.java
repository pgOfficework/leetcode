package IBM;

import java.util.Iterator;
import java.util.Stack;

public class DecimalNumberToBinary {

    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        while (num != 0) {
            System.out.println(num);
            result = result * 10 + (num % 2);

            stack.push(num % 2);
            num = num / 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());

        }

    }

}
