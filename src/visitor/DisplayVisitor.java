package visitor;

public class DisplayVisitor implements CarPartVisitor {

	@Override
	public void visit(Oil oil) {
		System.out.println("Oil is received.");
	}

	@Override
	public void visit(HeadLights headLights) {
		System.out.println("Headlights are received.");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheel is received.");
	}

	@Override
	public void visit(Order order) {
		System.out.println("Complete order is received.");
	}

}
