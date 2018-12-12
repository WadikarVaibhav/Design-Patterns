package visitor;

public class ShippingVisitor implements CarPartVisitor {
	
	double shippingCost = 0;

	@Override
	public void visit(Oil oil) {
		shippingCost += 9;
		System.out.println("Oil costs $9.");
	}

	@Override
	public void visit(HeadLights headLights) {
		shippingCost += 12;
		System.out.println("HeadLights cost $12.");
	}

	@Override
	public void visit(Wheel wheel) {
		shippingCost += 15;
		System.out.println("Wheel costs $15.");
	}

	@Override
	public void visit(Order order) {
		System.out.println("Total Shipping Chanrges: "+shippingCost);
	}

}
