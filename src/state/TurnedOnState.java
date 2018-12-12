package state;

public class TurnedOnState implements IState {

	@Override
	public void pressButton(Context context) {
		System.out.println("Tv is On...");
	}

}
