package visitor;

public class Oil implements CarPart {

	@Override
	public void accept(CarPartVisitor visitor) {
		visitor.visit(this);
	}

}
