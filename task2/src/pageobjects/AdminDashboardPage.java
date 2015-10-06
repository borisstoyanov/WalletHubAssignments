package pageobjects;

import browser.Browser;

public class AdminDashboardPage {

	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("Dashboard");
	}

}
