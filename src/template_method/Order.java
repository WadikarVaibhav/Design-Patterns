package template_method;

public abstract class Order {
	
	public boolean isGift;

	public abstract void doCheckout();
	public abstract void doPayment();
	public abstract void doReceipt();
	public abstract void doDelivery();

	public final void processOrder() {
		doCheckout();
		doPayment();
		if (isGift) {
			
		} else {
			doReceipt();
		}
		doDelivery();
	}
	
	public final void wrapGift() {
		System.out.println("Gift wrapped...");
	}
	
}
