package command;


//Invoker
public class Switch {
	public void invoke(Command command) {
		command.execute();
	}
}
