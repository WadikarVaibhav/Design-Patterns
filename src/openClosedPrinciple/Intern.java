package openClosedPrinciple;

public class Intern extends Employee {

	public Intern(String name, int id, int salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus(int salary) {
		return salary * 0.05;
	}

}
