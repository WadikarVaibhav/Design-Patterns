package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(267);
		list.add(25676);
		list.add(2564);
		list.add(245);
		list.add(232);
		list.add(223);
		java.util.Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Students students = new Students();
		Iterator itr = students.createIterator();
		while (itr.hasNext()) {
				System.out.println(itr.next());
		}
	}

}
