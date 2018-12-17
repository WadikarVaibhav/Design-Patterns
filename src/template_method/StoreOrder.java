package template_method;

public class StoreOrder extends Order {

	@Override
	public void doCheckout() {
		System.out.println("Store order checked out");
	}

	@Override
	public void doPayment() {
		System.out.println("Store order payment done");
	}

	@Override
	public void doReceipt() {
		System.out.println("Store order receipt mailed");
	}

	@Override
	public void doDelivery() {
		System.out.println("Store order delivered");
	}

}
