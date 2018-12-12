package adapter;

public class EmployeesFromCSV {
	
	private final String empId;
	private final String mail;
	private final String fullname;
	private final String mobile;

	public EmployeesFromCSV(String employeeInfo) {
		String[] empInfo = employeeInfo.split(",");
		this.empId = empInfo[0];
		this.mail = empInfo[2];
		this.fullname = empInfo[1];
		this.mobile = empInfo[3];
	}

	public String getEmpId() {
		return empId;
	}

	public String getMail() {
		return mail;
	}

	public String getFullname() {
		return fullname;
	}

	public String getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return "EmployeesFromCSV [empId=" + empId + ", mail=" + mail + ", fullname=" + fullname + ", mobile=" + mobile
				+ "]";
	}
	
}
