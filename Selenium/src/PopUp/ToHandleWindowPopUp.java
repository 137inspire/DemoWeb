package PopUp;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleWindowPopUp {

	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		 LocalDateTime date = LocalDateTime.now().plusMonths(2).plusDays(11);
		 String month = date.getMonth().toString();
		 month=month.charAt(0)+month.substring(1, 3).toLowerCase();
		 int year = date.getYear();
		 int day = date.getDayOfMonth();
		 System.out.println(day+"  "+month+"  "+year);

	ChromeOptions setting=new ChromeOptions();
	setting.addArguments("disable-notifications");
	ChromeDriver driver= new ChromeDriver(setting);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://in.via.com/");
	
	driver.findElement(By.xpath("//input[@name='return']")).click();
	driver.findElement(By.id("departure")).click();
	
	for(;;){
		try{
		driver.findElement(By.xpath("//span[contains(text(),'"+month+"')]/../..//span[text()=' "+year+"']/../..//div[text()='"+day+"']")).click();
		break;
	}catch(Exception e) {
		driver.findElement(By.xpath("//span[contains(@class,'js-next-month')]")).click();
	}
	}
//	driver.findElement(By.name("source")).sendKeys("heathdraw");
//	driver.findElement(By.name("source")).sendKeys("\t");
//	System.out.println(day+"  "+month+"  "+year);

	
	System.out.println(day+"  "+month+"  "+year);

	}

}
