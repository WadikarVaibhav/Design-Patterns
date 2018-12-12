package interpreter;

public class Main {

	public static void main(String[] args) {
		String expression = "3 31 4 + -";
		Expression result = Evaluator.parse(expression);
		System.out.println(result.interpret());
	}

}
