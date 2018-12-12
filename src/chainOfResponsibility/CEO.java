package chainOfResponsibility;

public class CEO extends BoardMember {

	@Override
	public void organizeEvent(Event event) {
		System.out.println("CEO can approve anything");
	}

}
