package command;

public class ToggleSwitch implements Command {
	
	private Light light;
	
	public ToggleSwitch(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.toggle();
	}
}
