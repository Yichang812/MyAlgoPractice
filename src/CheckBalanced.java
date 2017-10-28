import java.util.*;
public class CheckBalanced {
	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();
		for(int n = 0; n < input.length(); n++) {
			char c = input.charAt(n);
			switch(c) {
			case '{':
			case '[':
			case '(':
				stack.push(c);
				break;
			case '}':
				if(stack.isEmpty() || stack.pop() != '{') return false;
				break;
			case ']':
				if(stack.isEmpty() || stack.pop() != '[') return false;
				break;
			case ')':
				if(stack.isEmpty() || stack.pop() != '(') return false;
				break;
			}
		}
		return stack.isEmpty();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Is {([ balanced? " + isBalanced("{(["));
		System.out.println("Is ] balanced? " + isBalanced("]"));
		System.out.println("Is balanced? " + isBalanced(""));
		System.out.println("Is {{[]()}} balanced? " + isBalanced("{{[]()}}"));
	}
}
