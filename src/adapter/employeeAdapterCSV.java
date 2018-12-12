package adapter;

public class employeeAdapterCSV implements Employee {
	
	private final EmployeesFromCSV employeesFromCSV;

	public employeeAdapterCSV(EmployeesFromCSV employeesFromCSV) {
		this.employeesFromCSV = employeesFromCSV;
	}

	@Override
	public String getId() {
		return employeesFromCSV.getEmpId();
	}

	@Override
	public String getName() {
		return employeesFromCSV.getFullname();
	}

	@Override
	public String getEmail() {
		return employeesFromCSV.getMail();
	}

	@Override
	public String getMobile() {
		return employeesFromCSV.getMobile();
	}

	@Override
	public String toString() {
		return "employeeAdapterCSV [employeesFromCSV=" + employeesFromCSV + "]";
	}

}
