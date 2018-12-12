package prototype;

public class Main {

	public static void main(String[] args) {
		CloneFactory cloneFactory = new CloneFactory();
		Animal sheep = new Sheep();
		Animal dog = new Dog();
		System.out.println(sheep);
		System.out.println(dog);
		
		Animal sheepCopy = cloneFactory.makeCopy(sheep);
		Animal dogCopy = cloneFactory.makeCopy(dog);
		System.out.println(sheepCopy);
		System.out.println(dogCopy);
		
	}

}
