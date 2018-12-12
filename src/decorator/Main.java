package decorator;

public class Main {

	public static void main(String[] args) {
		
		Pizza plainPizza = new PlainPizza();
		
		Pizza extraCheez = new ExtraCheez(plainPizza);
		
		Pizza extraSauce = new TomatoSauce(extraCheez);
		
		System.out.println(extraCheez.getCost());
		
		System.out.println(extraSauce.getCost());
		
		System.out.println(extraSauce.getDescription());
		
	}

}
