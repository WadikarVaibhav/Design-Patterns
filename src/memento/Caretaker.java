package memento;

import java.util.Stack;

public class Caretaker {
	
	Stack<EmployeeMemento> history = new Stack<>();
	
	public void save(Employee employee) {
		history.push(employee.save());
	}
	
	public void revert(Employee employee) {
		employee.revert(history.pop());
	}
}
