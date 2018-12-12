package observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
	
	List<Mail> mails = new ArrayList<>();
	
	List<Observer> people = new ArrayList<>();
	
	public void add(Mail aMail) {
		mails.add(aMail);
		notifyObservers();
	}
	
	public List<Mail> getMails() {
		return mails;
	}

	@Override
	public void subscribe(Observer observer) {
		people.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		people.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: people) {
			observer.getUpdates(this);
		}
	}
	
}
