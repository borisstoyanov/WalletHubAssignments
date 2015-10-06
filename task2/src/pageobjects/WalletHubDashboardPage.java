package pageobjects;

import browser.Browser;

public class WalletHubDashboardPage {

	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("Boris Stoyanov (@boris1) on Wallet Hub");
	}

}
