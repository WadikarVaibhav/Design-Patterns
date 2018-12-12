package decorator;

public class PlainPizza implements Pizza {
	
	public PlainPizza() {
		System.out.println("Plain Pizza taken...");
	}

	@Override
	public String getDescription() {
		return "bread";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
