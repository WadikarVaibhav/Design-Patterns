package commandBulitIn;

public class Task implements Runnable {
	
	int num1;
	int num2;
	

	public Task(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() { //execute method
		System.out.println(num1*num2); //receiver
	}

}
