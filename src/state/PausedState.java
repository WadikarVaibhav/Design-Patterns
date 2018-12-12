package state;

public class PausedState implements IState {

	@Override
	public void pressButton(Context context) {
		System.out.println("Tv is paused...");
	}

}
