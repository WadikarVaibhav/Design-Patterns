package abstract_factory;

public class USAFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case HATCHBACK:
			car = new Hatchback(model, Location.USA);
			break;
		case SEDAN:
			car = new Sedan(model, Location.USA);
			break;
		case XUV:
			car = new XUV(model, Location.USA);
			break;
		default:
			break;
		}
		return car;
	}
}
