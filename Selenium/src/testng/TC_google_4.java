package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_google_4 {
	WebDriver driver;

	@Test
	public void googleLoading() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bata.com/");
		Reporter.log(".google web page is Opened", true);
		Thread.sleep(8000);
		driver.quit();
	}

}
