package chainOfResponsibility;

public class VP extends BoardMember {

	@Override
	public void organizeEvent(Event event) {
		if (event.getEvent() == Events.PURCHASE) {
			if (event.getAmount() < 1500) {
				System.out.println("VP can approve purchases below 1500");
			} else {
				successor.organizeEvent(event);
			}
		}
	}
}
