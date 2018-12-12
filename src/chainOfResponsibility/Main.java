package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Director nitsure = new Director();
		VP gokhale = new VP();
		CEO gary = new CEO();
		
		nitsure.setSuccessor(gokhale);
		gokhale.setSuccessor(gary);
		
		Event event = new Event(Events.CONFERENCE, 500);
		nitsure.organizeEvent(event);
		
		event = new Event(Events.PURCHASE, 2500);
		nitsure.organizeEvent(event);

		event = new Event(Events.PURCHASE, 500);
		nitsure.organizeEvent(event);
	}

}
