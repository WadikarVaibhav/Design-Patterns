package decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding extra sauce...");
	}

	public String getDescription() {
		return pizza.getDescription() + ", tomato sauce";
	}
	
	public double getCost() {
		return pizza.getCost() + 0.5;
	}

	
	
}
