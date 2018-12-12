package interpreter;

public class Addition extends Expression {
	
	Expression num1;
	Expression num2;
	
	public Addition(Expression num1, Expression num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public int interpret() {
		return num1.interpret() + num2.interpret();
	}

}
