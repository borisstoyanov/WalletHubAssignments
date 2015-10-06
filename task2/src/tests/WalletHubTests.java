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
import pageobjects.WalletHubProfilePage;
import pageobjects.WalletHubTestInsuranceCompanyPage;
import pageobjects.WalletHubWriteReviewPage;

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
		
		WalletHubTestInsuranceCompanyPage.Goto();
		Assert.assertTrue(WalletHubTestInsuranceCompanyPage.isAt());

	}
	
	@Test
	public void canLogin() throws Exception{
		WalletHubWriteReviewPage review = WalletHubTestInsuranceCompanyPage.rateCompany("5");
		
		Assert.assertTrue(WalletHubWriteReviewPage.isAt());
		
		review.changePolicy("Health");
		
		String reviewText = review.writeFullReviewAndSubmit();
		
		WalletHubProfilePage profile = new WalletHubProfilePage();
		
		WalletHubProfilePage.Goto();
		
		Assert.assertTrue(WalletHubProfilePage.isAt());
		
		profile.clickReviewsAndVerifyReview(reviewText);
		
		profile.clickActivityAndVerifyActivity();

		
		
		
		
	}
	
	
	@After
	public void tearDown(){
		Browser.quit();
	}
	
}
