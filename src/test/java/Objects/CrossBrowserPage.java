package Objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserPage {

WebDriver driver; 
	
	@Parameters("browser")
	@Test(priority=-1)
	public void openBrowser(String browserName) {
		if (browserName.equals("chromeBrowser")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefoxBrowser")) {
			driver = new FirefoxDriver();
		}
		else{
			driver = new EdgeDriver();
		}
	}
		
	@Test(priority=0)
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
	}
//	@Test(priority=1)
//	public void takeScreenshot() throws IOException {
//			TakesScreenshot as = (TakesScreenshot)driver;
//			File img = as.getScreenshotAs(OutputType.FILE);
//			File f = new File("C:\\Users\\91812\\eclipse-workspace\\TestNG\\Testdata");
//			FileUtils.copyFile(img, f);
//		}

	@Test(priority=11)
	public void closeBroswer() {
		driver.close();
}
	}