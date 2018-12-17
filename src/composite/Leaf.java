package composite;

public class Leaf implements Component {
	
	private final int cost;
	private final String name;

	public String getName() {
		return name;
	}

	public Leaf(String name, int cost) {
		super();
		this.cost = cost;
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public int getPrice() {
		return cost;
	}

	@Override
	public void addComponent(Component aComponent) {
		// TODO Auto-generated method stub
		
	}

}
