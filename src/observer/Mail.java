package observer;

public class Mail {
	
	Person receiver;
	String content;
	
	public Mail(Person receiver, String content) {
		super();
		this.receiver = receiver;
		this.content = content;
	}

	public Person getReceiver() {
		return receiver;
	}

	public String getContent() {
		return content;
	}
}
