package state;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.pressButton();
		context.setContext(new TrunedOffState());
		context.pressButton();
		context.setContext(new PausedState());
		context.pressButton();
	}

}