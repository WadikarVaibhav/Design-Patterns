package visitor;

public class Wheel implements CarPart {

	@Override
	public void accept(CarPartVisitor visitor) {
		visitor.visit(this);		
	}
	
}
