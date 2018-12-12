package bridge2;

public class Main {

	public static void main(String[] args) {
		
		Color blue = new Blue();
		
		Color red = new Red();
		
		Circle redCircle = new Circle(red);
		
		redCircle.applyColor();
		
	}

}
