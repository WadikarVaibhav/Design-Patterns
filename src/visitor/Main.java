package visitor;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.addPart(new Wheel());
		order.addPart(new Oil());
		order.addPart(new HeadLights());
		order.accept(new ShippingVisitor());
		order.accept(new DisplayVisitor());
	}
}