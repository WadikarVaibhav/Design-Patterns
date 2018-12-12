package decorator;

public class ExtraCheez extends ToppingDecorator {

	public ExtraCheez(Pizza pizza) {
		super(pizza);
		System.out.println("Adding extra cheez...");
	}

	public String getDescription() {
		return pizza.getDescription() + ", cheez";
	}
	
	public double getCost() {
		return pizza.getCost() + 1.2;
	}

}
