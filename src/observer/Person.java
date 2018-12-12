package observer;

import java.util.List;

public class Person implements Observer {
	
	private final String name;
	private final int id;
	
	public Person(String name, int i) {
		super();
		this.name = name;
		this.id = i;
	}
	
	@Override
	public void getUpdates(Object obj) {
		if (obj instanceof PostOffice) {
			PostOffice po = (PostOffice) obj;
			checkMail(po.getMails());
		}
	}

	private void checkMail(List<Mail> mails) {
		for (Mail mail: mails) {
			if (id == mail.getReceiver().id) {
				System.out.println(name + ": " + mail.content);
			}
		}
	}
}
