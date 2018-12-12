package factory;

public class Shop extends Website {

	@Override
	void createWebsite() {
		pages.add(new CartPage());
	}

}
