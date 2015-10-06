package pageobjects;

import browser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WalletHubWriteReviewPage {

	
	public static boolean isAt() {
		return Browser.instance.getTitle().endsWith("| Write Review");
	}
	
	public void changePolicy(String value) {
		new Select(Browser.instance.findElement(By.id("review-product"))).selectByVisibleText(value);
		
	}

	private void expandReviewBox() {
		Browser.instance.findElement(By.xpath("//a[text()='Write a full review and get 10X more Wallet Points!']")).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("review-content")));
		
	}
	public String writeFullReviewAndSubmit() {
		expandReviewBox();
		
		do
			Browser.instance.findElement(By.id("review-content")).sendKeys("testing_wh");
		while(Integer.parseInt(Browser.instance.findElement(By.xpath("//span[@class='minchars'//span")).getText().toString()) <= 200);
		
		String review = Browser.instance.findElement(By.id("review-content")).getText();
		
		Browser.instance.findElement(By.id("publishfb")).click();
		Browser.instance.findElement(By.xpath("//input[@value='Submit']")).click();
		return review;
	}
	
	public String writeFullReviewAndSubmit(String text) {
		expandReviewBox();
		
		Browser.instance.findElement(By.id("review-content")).sendKeys(text);
		
		String review = Browser.instance.findElement(By.id("review-content")).getText();

		Browser.instance.findElement(By.id("publishfb")).click();
		Browser.instance.findElement(By.xpath("//input[@value='Submit']")).click();
		return review;
	}

}
