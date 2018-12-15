package openClosedPrinciple;

public abstract class Employee {
	
	private final String name;
	private final int id;
	private final int salary;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract double getBonus(int salary);
}
