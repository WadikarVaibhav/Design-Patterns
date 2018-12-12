package proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String URL) {
		System.out.println("Connected to "+URL);
	}

}
