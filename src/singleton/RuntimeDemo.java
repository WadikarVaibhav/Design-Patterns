package singleton;

public class RuntimeDemo {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		runtime.gc();
		
		Runtime runtime2 = Runtime.getRuntime();
		
		runtime2.gc();
		
		System.out.println(runtime);
		
		System.out.println(runtime2);
		
	}

}
