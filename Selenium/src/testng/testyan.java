package testng;

import org.testng.annotations.Test;

import pomRepotryForTestyan.TYL_pom_login;

public class testyan extends baseClass
{
	@Test
	public void TC_TYL_001()
	{
		driver.get("https://online.qspiders.com/student");
		TYL_pom_login login=new TYL_pom_login(driver);
		login.getEmail().sendKeys("ksiankaran@yahoo.co.uk");
		login.getContryCode().sendKeys("44");
		login.getMobNumber().sendKeys("7808237799");
		login.getButtonLogin().click();
	}
}
