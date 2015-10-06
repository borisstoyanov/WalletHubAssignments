package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import browser.Browser;
import enums.PasswordsEnums;
import enums.UsernameEnums;
import pageobjects.WalletHubDashboardPage;
import pageobjects.WalletHubLoginPage;

public class WalletHubTests {

	@Before
	public void setup(){
		Browser.init();
		WalletHubLoginPage.goTo();
		WalletHubLoginPage
			.loginAs(UsernameEnums.REGULAR_USER)
			.withPassword(PasswordsEnums.REGULAR_USER_PASSWORD)
			.login();
		
		Assert.assertTrue(WalletHubDashboardPage.isAt());
	}
	
	@Test
	public void canLogin(){
		
	}
	
	
	@After
	public void tearDown(){
		Browser.quit();
	}
	
}
