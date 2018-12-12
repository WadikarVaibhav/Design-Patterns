package interpreter;

public class Number extends Expression {

	int num;
	
	public Number(int num) {
		super();
		this.num = num;
	}

	@Override
	public int interpret() {
		return num;
	}

}
