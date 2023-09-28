package PointOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelTest {

//	private static String a;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();
		Thread.sleep(5000);
		String b="Google";
		String a = driver.getTitle();
		System.out.println(a);
		if(a.equals("google"))
		{
			System.out.println("its not exactlty equals");
		}
		else if (a.equals(b)) {
		System.out.println("its exactlty equals");
		}
		else 
		System.out.println("false");
		
		driver.quit();
		
	
	
	}

}
