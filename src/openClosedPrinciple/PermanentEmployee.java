package openClosedPrinciple;

public class PermanentEmployee extends Employee {

	public PermanentEmployee(String name, int id, int salary) {
		super(name, id, salary);
	}

	@Override
	public double getBonus(int salary) {
		return salary * 0.1;
	}


}
