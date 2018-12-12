package template_method;

public class Person implements Comparable<Person> {
	
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		if (age > o.age) {
			return 1;
		} else if (age < o.age) {
			return -1;
		}
		return 0;
	}
}
