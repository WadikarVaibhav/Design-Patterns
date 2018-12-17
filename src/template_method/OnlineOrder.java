package template_method;

public class OnlineOrder extends Order {

	@Override
	public void doCheckout() {
		System.out.println("Online order checked out");
	}

	@Override
	public void doPayment() {
		System.out.println("Online order payment done");
	}

	@Override
	public void doReceipt() {
		System.out.println("Online order receipt mailed");
	}

	@Override
	public void doDelivery() {
		System.out.println("Online order delivered");
	}

}
