package com.bdd.facebookTest;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDefs {
	protected WebDriver driver;
    
    @Before
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "lib\\selenium\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @Given("the user is on Facebook LoginPage")
    public void The_user_is_on_login_page() {
    	driver.get("http://facebook.com");
    }

    @When("he enters \"([^\"]*)\" as username")
    public void He_enters_username(String username) {
    	driver.findElement(By.id("email")).sendKeys(username);
    }
    
    @And("he enters \"([^\"]*)\" as password")
    public void He_enters_pass(String password) {
    	driver.findElement(By.id("pass")).sendKeys(password);
    }
    
    @And("he clicks login")
    public void He_clicks_login() {
    	driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    
    @And("he enters \"([^\"]*)\" as post")
    public void He_enters_a_post(String post) {
    	driver.get("http://facebook.com");
    	driver.findElement(By.xpath("//textarea[@title=\"What's on your mind?\"]")).sendKeys(post);

    	driver.findElement(By.xpath("//button[text()='Post']")).click();
    }
    
    @Then("ensure the post \"([^\"]*)\" is posted")
    public void Ensure_the_post_is_posed(String post) {
    	assertTrue(driver.findElement(By.xpath("//div[@aria-label='Story']//p[text()='" + post + "']")).isDisplayed());
    }
    
    @After
    public void tearDown() {
    	driver.close();
    }
}
