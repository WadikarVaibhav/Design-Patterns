package builder;

public class Main {

	public static void main(String[] args) {
		
		LunchOrder.Builder lunchOrderBuilder = new LunchOrder.Builder();
		
		lunchOrderBuilder.bread("Wheat").curry("Paneer").meat("Turkey").salt("Tata");
		
		LunchOrder lunchOrder = new LunchOrder(lunchOrderBuilder);
		
		//LunchOrder lunchOrder = lunchOrderBuilder.build();
		
		System.out.println(lunchOrder.getBread());

		System.out.println(lunchOrder.getCurry());
		
		System.out.println(lunchOrder.getSalt());
		
		System.out.println(lunchOrder.getMeat());
		
	}

}
