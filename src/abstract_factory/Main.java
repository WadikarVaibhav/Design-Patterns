package abstract_factory;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.INDIA));
		
	}

}
