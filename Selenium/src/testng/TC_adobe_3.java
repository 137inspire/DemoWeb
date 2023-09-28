package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_adobe_3 extends baseClass {

	WebDriver driver;

	
	@Test
	public void adobeLoading() {
		
		Reporter.log("adobe web page is Opened", true);
		Reporter.log("adobe web page is Opened");
		driver.quit();
	}

}
