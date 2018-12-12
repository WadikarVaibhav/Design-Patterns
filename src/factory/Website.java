package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}
	
	public List<Page> getPages() {
		return this.pages;
	}

	abstract void createWebsite();
	
}
