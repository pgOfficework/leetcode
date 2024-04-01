package easy;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<Character>(); //{[()]}
		 for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			case '{':
				stack.push(c);
				break;
			case ')':
				if(stack.isEmpty() || (stack.pop())!='(') {
					return false;
				}
				break;
			case ']':
				if((stack.pop())!='[') {
					return false;
				}
				break;
			case '}':
				if(stack.pop()!='{') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();

	}

}
