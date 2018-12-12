package command;

//Receiver
public class Light {

	private boolean state;
	private String room;

	public Light(String room) {
		this.room = room;
		this.state = false;
	}

	public boolean isOn() {
		return state;
	}

	private void on() {
		state = true;
		System.out.println("Lights switched on: " + room);
	}

	private void off() {
		state = false;
		System.out.println("Lights switched off: " + room);
	}

	public void switchItOn() {
		on();
		state = true;
	}

	public void switchItOff() {
		off();
		state = false;
	}

	public void toggle() {
		if (state) {
			off();
			state = false;
		} else {
			on();
			state = true;
		}
	}

}
