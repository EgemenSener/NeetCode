import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
				if(c == '(')
					stack.push(')');
				else if(c=='[')
					stack.push(']');
				else if(c == '{')
					stack.push('}');
				else if(stack.isEmpty() || stack.pop() != c)
						return false;
		}
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		String s = "()[]{}";
		ValidParentheses validParentheses = new ValidParentheses();
		System.out.println(validParentheses.isValid(s));

	}

}
