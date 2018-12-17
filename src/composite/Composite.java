package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private final String name;
	
	List<Component> components = new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int getPrice() {
		int cost = 0;
		for (Component aComponent: components) {
			System.out.println("Caculating price for "+aComponent.getName());
			cost += aComponent.getPrice();
		}
		return cost;
	}

	@Override
	public void addComponent(Component aComponent) {
		components.add(aComponent);
	}

	@Override
	public String getName() {
		return name;
	}
	
}
