package command;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen"); 
		Light hallLight = new Light("Leaving");
		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		lights.add(hallLight);
		
		Command toggleBedroomLight = new ToggleSwitch(bedroomLight);
		Command toggleKitchenLight = new ToggleSwitch(kitchenLight);
		
		Command switchOffLights = new SwitchOffLights(lights);
		Command switchOnLights = new SwitchOnLights(lights);
		
		Switch aSwitch = new Switch();
		
		aSwitch.invoke(toggleBedroomLight);
		aSwitch.invoke(toggleKitchenLight);
		
		aSwitch.invoke(switchOffLights);
		aSwitch.invoke(switchOnLights);
		
	}

}
