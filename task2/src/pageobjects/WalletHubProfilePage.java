package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class WalletHubProfilePage {

	public static void Goto() {
		
		Actions action = new Actions(Browser.instance);
		
		//Hovers at the rating options to activate the rating 
		WebElement ratingbar = Browser.instance.findElement(By.xpath("//span[@data-menu='user']//img"));
		action.moveToElement(ratingbar).build().perform();
		
		Browser.instance.findElement(By.xpath("//a[text()='Profile']")).click();

	}

	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("Boris Stoyanov (@boris1) on Wallet Hub");
	}

	public void clickReviewsAndVerifyReview(String reviewText) {
		Browser.instance.findElement(By.xpath("//a[text()='Reviews']")).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='reviews']")));
		
		List<WebElement> list = Browser.instance.findElements(By.xpath("//*[contains(text(),'" + reviewText + "')]"));
		Assert.assertTrue("Text not found!", list.size() > 0);
		
	}

	public void clickActivityAndVerifyActivity() {
		Browser.instance.findElement(By.xpath("//a[text()='Activity']")).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='activity']")));	
				
		List<WebElement> list = Browser.instance.findElements(By.xpath("//*[contains(text(),'boris1 just submitted an Excellent rating f… Test Insurance Company ')]"));
		Assert.assertTrue("Text not found!", list.size() > 0);
	}

}
