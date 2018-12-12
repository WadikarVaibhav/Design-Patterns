package factory;

public class Main {

	public static void main(String[] args) {
		Website website = WebsiteFactory.getWebsite("blog");
		System.out.println(website.getPages());
		Website website2 = WebsiteFactory.getWebsite("shop");
		System.out.println(website2.getPages());
	}
}
