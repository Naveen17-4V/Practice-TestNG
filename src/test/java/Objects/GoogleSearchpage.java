package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	WebDriver driver;	

	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.xpath("//textarea[@name='q']");
	By searchbtn = By.xpath("(//input[@name='btnK'])[1]");
	By Facebook_link = By.xpath("//h3[text()='Facebook - log in or sign up']");
	
	public void searchgoogle(String Searchinput) {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			driver.findElement(searchbtn).click();
		} catch (Exception e) {
			System.out.println("Exception caught :" + e.getMessage());
		}		
	}
	
	public void clickFacebook() {
		try {
			driver.findElement(Facebook_link).click();
		}
		catch (Exception e){
			System.out.println("Exeception caught :" + e.getMessage());
		}
		System.out.println("navi");
	}
	

}
