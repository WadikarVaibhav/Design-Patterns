package memento;

//Memento pattern generally used to provide an object with a roll-back functionality
//Restores an object to previous state
//Doesn't violates encapsulation  

public class Employee {

	private String name;
	private String phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(name, phone);
	}

	public void revert(EmployeeMemento employee) {
		this.name = employee.getName();
		this.phone = employee.getPhone();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + "]";
	}

}
