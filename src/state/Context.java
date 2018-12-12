package state;

public class Context {
	private IState state;
	
	public Context() {
		this.state = new TurnedOnState();
	}
	
	public void setContext(IState state) {
		this.state = state;
	}
	
	public void pressButton() {
		state.pressButton(this);
	}
}
