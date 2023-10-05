/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ksain
 *
 */
public class TC_001_Test {
@Test
public void Login()
{
	WebDriverManager.chromedriver().setup();
System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://maven.apache.org/download.cgi");
}
}
