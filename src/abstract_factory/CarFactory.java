package abstract_factory;

public class CarFactory {

	public static Car buildCar(CarType type, Location country) {

		Car car = null;
		switch (country) {
		
		case USA:
			car = USAFactory.buildCar(type);
			break;

		case INDIA:
			car = IndiaFactory.buildCar(type);
			break;
			
		case UK:
			car = UKFactory.buildCar(type);
			break;

		default:
			car = UKFactory.buildCar(type);

		}

		return car;

	}

}
