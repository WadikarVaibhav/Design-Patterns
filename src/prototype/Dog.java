package prototype;

public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog constructor is being invoked");
	}

	@Override
	public Animal makeCopy() {
		
		System.out.println("Dog copy is being created...");
		
		Dog dogCopy = null;
		
		try {
			dogCopy = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return dogCopy;
	}

	@Override
	public String toString() {
		return "Dog [toString()=" + super.toString() + "]";
	}
	
	

}
