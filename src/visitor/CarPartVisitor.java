package visitor;

public interface CarPartVisitor {

	void visit(Oil oil);

	void visit(HeadLights headLights);

	void visit(Wheel wheel);

	void visit(Order order);

}
