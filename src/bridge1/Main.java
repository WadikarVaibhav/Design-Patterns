package bridge1;

public class Main {

	public static void main(String[] args) {
		Circle blueCircle = new BlueCircle();
		Square redSquare = new RedSquare();
		blueCircle.applyColor();
		redSquare.applyColor();
	}

}
