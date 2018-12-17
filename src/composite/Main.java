package composite;

public class Main {

	public static void main(String[] args) {
		
		Component ram = new Leaf("RAM", 5000);
		Component hdd = new Leaf("Hard Disk", 4000);
		
		Component mouse = new Leaf("Mouse", 300);
		Component keyBoard = new Leaf("Key Board", 1000);
		
		Component motherBoard = new Composite("Monther Board");
		Component removables = new Composite("Removable Devices");
		
		Component laptop = new Composite("Laptop");
		
		laptop.addComponent(removables);
		laptop.addComponent(motherBoard);
		
		motherBoard.addComponent(ram);
		motherBoard.addComponent(hdd);
		
		removables.addComponent(keyBoard);
		removables.addComponent(mouse);
		
		//System.out.println(mouse.getPrice());
		
		//System.out.println(removables.getPrice());
		
		System.out.println(laptop.getPrice());
		
		
	}

}
