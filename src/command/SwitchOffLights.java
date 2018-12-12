package command;
import java.util.List;

public class SwitchOffLights implements Command {

	private List<Light> lights;
	
	public SwitchOffLights(List<Light> lights) {
		this.lights = lights;
	}
	
	@Override
	public void execute() {
		for (Light light: lights) {
			if (light.isOn()) {
				light.switchItOff();				
			}
		}
	}

}
