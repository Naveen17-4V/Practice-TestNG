package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	WebDriver driver;
	GoogleSearchpage objectrepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = -1)
	public void searchOperation() {
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.searchgoogle("facebook");
	}
	
	@Test (priority = 0)
	public void verifyAndAccessFacebook() {
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.clickFacebook();
	}

	@Test(priority = 1)
	public void VerifyLogin() throws InterruptedException {
		FacebookPage page = new FacebookPage(driver);
		page.enterUserAndPass();
		page.verifyLogin();
	}
	
	@AfterTest
	public void aftertest(){
		driver.quit();
		}
}
