package visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements CarPart {

	List<CarPart> parts = new ArrayList<>();

	public void addPart(CarPart part) {
		parts.add(part);
	}

	@Override
	public void accept(CarPartVisitor visitor) {
		for (CarPart part : parts) {
			part.accept(visitor);
		}
		visitor.visit(this);
	}

}
