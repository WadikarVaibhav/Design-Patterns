package abstract_factory;

public class UKFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case HATCHBACK:
			car = new Hatchback(model, Location.UK);
			break;
		case SEDAN:
			car = new Sedan(model, Location.UK);
			break;
		case XUV:
			car = new XUV(model, Location.UK);
			break;
		default:
			break;
		}
		return car;
	}


}
