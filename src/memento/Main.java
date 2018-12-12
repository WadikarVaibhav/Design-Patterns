package memento;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Caretaker caretaker = new Caretaker();

		employee.setName("Vaibhav");
		employee.setPhone("6196065063");
		
		System.out.println(employee);
		
		caretaker.save(employee);
		employee.setName("Manisha");
		
		caretaker.save(employee);
		System.out.println(employee);
		
		employee.setName("Parth");
		caretaker.revert(employee);
		System.out.println(employee);		
	}
}
