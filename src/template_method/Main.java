package template_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person first = new Person(23, "Vaibhav");
		Person second = new Person(27, "Aarti");
		Person third = new Person(26, "Amol");
		Person fourth = new Person(21, "Manisha");
		
		List<Person> people = new ArrayList<>();
		
		people.add(third);
		people.add(second);
		people.add(first);
		people.add(fourth);
		
		System.out.println("list before sorting: ");
		for (Person person: people) {
			System.out.print(person.name+" ");
		}

		
		Collections.sort(people);
		
		System.out.println("\nlist after sorting: ");
		for (Person person: people) {
			System.out.print(person.name+" ");
		}
				
	}

}
