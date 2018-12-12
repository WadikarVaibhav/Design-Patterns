package interpreter;

import java.util.*;

public class Evaluator {
	
	public static Expression parse(String text) {
		Stack<Expression> stack = new Stack<>();
		
		String[] tokens = text.split(" ");
		
		for (String token: tokens) {
			Expression lhs = null;
			Expression rhs = null;
			switch (token) {
			case "+":
				rhs = stack.pop();
				lhs = stack.pop();
				stack.push(new Addition(lhs, rhs));
				break;
			case "-":
				rhs = stack.pop();
				lhs = stack.pop();
				stack.push(new Subtraction(lhs, rhs));
				break;
			default:
				int num = Integer.parseInt(token);
				stack.push(new Number(num));
				break;
			}
		}
		return stack.pop();
	}

}
