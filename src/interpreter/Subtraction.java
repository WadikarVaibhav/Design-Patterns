package interpreter;

public class Subtraction extends Expression {
	
	Expression num1;
	Expression num2;
	
	public Subtraction(Expression lhs, Expression rhs) {
		this.num1 = lhs;
		this.num2 = rhs;
	}

	@Override
	public int interpret() {
		return num1.interpret() - num2.interpret();
	}

}
