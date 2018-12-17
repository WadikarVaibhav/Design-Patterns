package template_method;

public class Main {

	public static void main(String[] args) {
		
		Order anOrder = new OnlineOrder();
		anOrder.processOrder();
		System.out.println("----");
		Order anOrder2 = new StoreOrder();
		anOrder2.processOrder();
	}

}
