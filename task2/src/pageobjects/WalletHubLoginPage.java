package pageobjects;

import commands.WalletHubLoginPageCommands;
import enums.UsernameEnums;
import browser.Browser;

public class WalletHubLoginPage {

	public static void goTo() {
		Browser.instance.get("https://wallethub.com/login/");
	}

	public static WalletHubLoginPageCommands loginAs(UsernameEnums username) {
		return new WalletHubLoginPageCommands(username);
	}

}
