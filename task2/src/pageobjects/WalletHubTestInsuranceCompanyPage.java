package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.junit.Assert;
import browser.Browser;

public class WalletHubTestInsuranceCompanyPage {

	public static void Goto() {
		Browser.instance.get("http://wallethub.com/profile/test_insurance_company/");
		
	}

	public static boolean isAt() {
		return Browser.instance.getTitle().startsWith("Test Insurance Company");
		
	}

	public static WalletHubWriteReviewPage rateCompany(String rate) throws Exception {
		
		Actions action = new Actions(Browser.instance);
		
		//Hovers at the rating options to activate the rating 
		WebElement ratingbar = Browser.instance.findElement(By.xpath("//span[@class='wh-rating rating_5']"));
		action.moveToElement(ratingbar).moveToElement(Browser.instance.findElement(By.xpath("//span[@class='wh-rating rating_5']"))).build().perform();

		
		//Hovers at the actual rate by given parameter and checks if the selected item has attribute class 'hover' 
		WebElement actualRate = Browser.instance.findElement(By.xpath("//div[@class='wh-rating-choices-holder']//a[text()='"+ rate + "']"));
		action.moveToElement(actualRate).moveToElement(Browser.instance.findElement(By.xpath("//div[@class='wh-rating-choices']//a")))
		.moveToElement(actualRate)
		.build().perform();

		String attribute = actualRate.getAttribute("class");
		Assert.assertTrue(attribute.equals("hover"));
	
		
		//clicks at the given rate element and drives you to review page
		actualRate.click();
		return new WalletHubWriteReviewPage();
	}

}
