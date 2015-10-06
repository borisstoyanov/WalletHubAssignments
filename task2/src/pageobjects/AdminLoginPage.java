package pageobjects;

import commands.AdminLoginPageCommands;
import enums.UsernameEnums;
import browser.Browser;

public class AdminLoginPage {

	public static void goTo() {
		Browser.instance.get("https://31.222.187.92:444/account/login");
	}

	public static AdminLoginPageCommands loginAs(UsernameEnums username) {
		return new AdminLoginPageCommands(username);
	}

}
