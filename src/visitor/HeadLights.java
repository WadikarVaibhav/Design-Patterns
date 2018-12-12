package visitor;

public class HeadLights implements CarPart {

	@Override
	public void accept(CarPartVisitor visitor) {
		visitor.visit(this);
	}

}
