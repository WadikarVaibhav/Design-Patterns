package state;

public class TrunedOffState implements IState {

	@Override
	public void pressButton(Context context) {
		System.out.println("Tv is off...");
	}

}
