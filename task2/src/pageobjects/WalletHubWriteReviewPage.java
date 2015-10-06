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

	private void expandReviewBox() throws Exception {
		Thread.sleep(2000);
		Browser.instance.findElement(By.xpath("//a[text()='Write a full review and get 10X more Wallet Points!']"))
				.click();

	}

	public String writeFullReviewAndSubmit() throws Exception {
		expandReviewBox();
		for (int i = 0; i < 10; i++){
			Browser.instance.findElement(By.id("review-content")).sendKeys("testing_whtesting_wh");

		}

		String review = Browser.instance.findElement(By.id("review-content")).getText();

		Browser.instance.findElement(By.id("publishfb")).click();
		Browser.instance.findElement(By.xpath("//input[@value='Submit']")).click();
		return review;
	}

	public String writeFullReviewAndSubmit(String text) throws Exception {
		expandReviewBox();

		Browser.instance.findElement(By.id("review-content")).sendKeys(text);

		String review = Browser.instance.findElement(By.id("review-content")).getText();

		Browser.instance.findElement(By.id("publishfb")).click();
		Browser.instance.findElement(By.xpath("//input[@value='Submit']")).click();
		return review;
	}

}
