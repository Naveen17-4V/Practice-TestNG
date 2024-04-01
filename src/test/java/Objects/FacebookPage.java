package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {

	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//*[@name='pass']");
	By Login_btn = By.xpath("//button[@name='login']");
	
	
	public void enterUserAndPass() throws InterruptedException {
		driver.findElement(username).sendKeys("Testuser");
		driver.findElement(password).sendKeys("TestUser123");
	}
	
	public void verifyLogin() {
		driver.findElement(Login_btn).click();
		String title = driver.getTitle();
		assertEquals(title, "Log in to Facebook");
	}
}
