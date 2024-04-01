package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class GreensTest {

	WebDriver driver; 
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
	}
	
	
	@Test(groups="smoke")
	public void openZfacebook() {
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test(groups="sanity")
	public void openAmazon() {
		driver.get("https://www.amazon.in/ref=nav_logo");
	}
	
	@Test(groups="smoke")
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
}
