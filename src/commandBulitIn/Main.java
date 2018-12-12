package commandBulitIn;

public class Main {

	public static void main(String[] args) {
		Task task1 = new Task(23,3); //encapsulate request
		Thread thread1 = new Thread(task1);
		thread1.start();
	}

}
