package prototype;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep constructor is being invoked...");
	}
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Sheep copy is being created...");
		
		Sheep sheepCopy = null;
		
		try {
			sheepCopy = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sheepCopy;
	}

}
