package chainOfResponsibility;

public class Director extends BoardMember {

	@Override
	public void organizeEvent(Event event) {
		if (event.getEvent() == Events.CONFERENCE) {
			System.out.println("Director can approve conferences");
		} else {
			successor.organizeEvent(event);
		}
	}

}
