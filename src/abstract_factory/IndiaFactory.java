package abstract_factory;

public class IndiaFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case HATCHBACK:
			car = new Hatchback(model, Location.INDIA);
			break;
		case SEDAN:
			car = new Sedan(model, Location.INDIA);
			break;
		case XUV:
			car = new XUV(model, Location.INDIA);
			break;
		default:
			break;
		}
		return car;
	}
}
