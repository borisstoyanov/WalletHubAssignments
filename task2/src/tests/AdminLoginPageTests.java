package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import enums.PasswordsEnums;
import enums.UsernameEnums;
import pageobjects.AdminDashboardPage;
import pageobjects.AdminLoginPage;
import browser.Browser;

public class AdminLoginPageTests {

	@Before
	public void setup(){
		Browser.init();
	}
	
	@Test
	public void canLogin(){
		AdminLoginPage.goTo();
		AdminLoginPage
			.loginAs(UsernameEnums.MODERATOR)
			.withPassword(PasswordsEnums.MODERATOR_PASSWORD)
			.login();
		
		Assert.assertTrue(AdminDashboardPage.isAt());
	}
	
	@Test 
	public void canCreateProductInBackend(){
//		AdminLoginPage.goTo();
//		AdminLoginPage
//			.loginAs(UsernameEnums.MODERATOR)
//			.withPassword(PasswordsEnums.MODERATOR_PASSWORD)
//			.login();
//		
		//TODO: AdminDashboardPage.openProductsCategory();
	}
	
	@After
	public void tearDown(){
		Browser.quit();
	}
	
}
