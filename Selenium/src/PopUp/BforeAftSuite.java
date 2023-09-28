package PopUp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BforeAftSuite {
	int i=1;
	
	@Test(invocationCount = 6)
	public void MainClass() {
		System.out.println("\t\s\sDisplaying MainClass invocationCount = "+i);
		i+=1;
	}
	@BeforeClass
	public void login() {
		System.out.println("\s\sBefore Class one is Running.....");
		System.out.println("\s\sDisplaying Login");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite is Running.....");
		System.out.println("DataBase Connection Has terminated");
	}
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite is Running.....");
	System.out.println("DataBase Connection Has Made");
	}
	@BeforeClass
	public void xbeforeClass() {
		System.out.println("\s\sBefore Class two is Running.....");
		}
	@BeforeMethod
	public void beforeMethod() {
			System.out.println("\n\tBeforeMethod is Running.....");
			}
	@AfterMethod
	public void afterMethod() {
				System.out.println("\tafterMethod is Running.....\n");
				}
	@BeforeTest
	public void beforeTest() {
			System.out.println("\n*******BeforeTest is Running*******\n");
			}
	@AfterTest
	public void afterTest() {
			System.out.println("\n******AfterTest is Running*******\n");
			}
	@AfterClass
	public void afterClass() {
		System.out.println("\s\sAfter Class is Running.....");
//		System.out.println("DataBase Connection Has Made");
		}
}
