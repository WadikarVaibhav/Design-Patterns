package bridge2;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("applying "+color+ " color");
	}

}
