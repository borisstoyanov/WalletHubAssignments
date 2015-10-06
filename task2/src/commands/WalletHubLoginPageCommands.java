package commands;

import org.openqa.selenium.By;

import enums.PasswordsEnums;
import enums.UsernameEnums;
import browser.Browser;

public class WalletHubLoginPageCommands {
	private String username;
	private String password;

	public WalletHubLoginPageCommands(UsernameEnums firstMethodparam) {
		this.username = firstMethodparam.getUsername();
	}


	public WalletHubLoginPageCommands withPassword(PasswordsEnums password) {
		this.password = password.getPassword();
		return this;
	}


	public void login() {
		Browser.instance.findElement(By.name("username")).sendKeys(this.username);
		Browser.instance.findElement(By.name("password")).sendKeys(this.password);
		Browser.instance.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
