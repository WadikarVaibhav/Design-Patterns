package openClosedPrinciple;

public class Main {

	public static void main(String[] args) {
		
		Employee manager = new PermanentEmployee("Vaibhav", 1, 10000);
		Employee intern = new Intern("Amey", 2, 5000);
		
		System.out.println(intern.getBonus(intern.getSalary()));
		
		System.out.println(manager.getBonus(manager.getSalary()));
		
	}

}
