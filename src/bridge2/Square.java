package bridge2;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("applying "+color+ " color");		
	}

}
