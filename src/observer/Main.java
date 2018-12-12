package observer;

public class Main {

	public static void main(String[] args) {
		PostOffice po = new PostOffice();
		
		Person vaibhav = new Person("Vaibhav", 1);
		Person madhura = new Person("Madhura", 2);
		
		po.subscribe(vaibhav);
		po.subscribe(madhura);
		
		Mail mail1 = new Mail(vaibhav, "How are you?");
		Mail mail2 = new Mail(madhura, "I am fine, how about you?");
		
		po.add(mail1);
		po.add(mail2);
	}

}
