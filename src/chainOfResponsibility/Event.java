package chainOfResponsibility;

public class Event {
	
	private Events events;
	private double budget;
	
	public Event(Events events, double amount) {
		this.events = events;
		this.budget = amount;
	}
	
	public Events getEvent() {
		return events;
	}
	
	public double getAmount() {
		return budget;
	}

}
