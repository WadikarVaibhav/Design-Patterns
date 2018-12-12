package command;
import java.util.List;

public class SwitchOnLights implements Command {
	
	List<Light> lights;
	
	public SwitchOnLights(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light: lights) {
			if (!light.isOn())
				light.switchItOn();
		}
	}

}
