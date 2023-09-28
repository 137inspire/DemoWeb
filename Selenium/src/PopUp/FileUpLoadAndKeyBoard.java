package PopUp;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author ksain
 *
 */
public class FileUpLoadAndKeyBoard 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.airbnb.co.uk/");
	driver.findElement(By.xpath("//button[@data-testid='cypress-headernav-profile']")).click();
	

	
	
	
	
	
	
	
	
	
	
	}
}
