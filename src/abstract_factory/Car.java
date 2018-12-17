package abstract_factory;

public abstract class Car {
	
	CarType model = null; 
    Location location = null; 

	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

}
