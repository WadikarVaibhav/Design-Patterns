package visitor;

public interface CarPart {
	public void accept(CarPartVisitor visitor);
}
