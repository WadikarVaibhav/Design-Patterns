package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployees() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employeesFromBD = new EmployeesFromDB("1", "vaibhavwadikar8@gmail.com", "Vaibhav", "6196065063");
		
		employees.add(employeesFromBD);
		
		EmployeesFromCSV employeesFromCSV = new EmployeesFromCSV("1, Sukrut, sjoshi@gmail.com, 8723889976");
		
		Employee employeeAdapterCSV = new employeeAdapterCSV(employeesFromCSV);
		
		employees.add(employeeAdapterCSV);
		
		return employees;
	}

}
