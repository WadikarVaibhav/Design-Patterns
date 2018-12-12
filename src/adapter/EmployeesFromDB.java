package adapter;

public class EmployeesFromDB implements Employee {
	
	private final String id;
	private final String email;
	private final String name;
	private final String phone;
	
	@Override
	public String toString() {
		return "EmployeesFromDB [id=" + id + ", email=" + email + ", name=" + name + ", phone=" + phone + "]";
	}

	public EmployeesFromDB(String id, String email, String name, String phone) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getMobile() {
		return phone;
	}

}
