package singleton;

public class Counter {
	
	public static Counter counter = null;
	
	private Counter() {
		
	}
	
	protected static Counter getInstace() {
		if (counter == null) {
			return new Counter();
		}
		return counter;
	}

}
