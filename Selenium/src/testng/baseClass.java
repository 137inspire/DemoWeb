package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class baseClass {
	WebDriver driver;
	@Parameters({ "URL", "BrowserName" })
	@BeforeTest
	public void configBrowser(@Optional("http://www.google.com/") String url, @Optional("chrome") String Bname) 
	{
			if (Bname.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (Bname.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (Bname.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} else
				System.out.println("no Browser is selected");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
	}
}
