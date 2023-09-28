package PopUp;

import org.testng.annotations.Test;

public class sample {
@Test
public void login() {
	System.out.println("Login page");
}
@Test
public void otp() {
	System.out.println("Sent OTP");
}
@Test(dependsOnMethods = "otp" ,invocationCount = 3)
public void msg() {
	System.out.println("Hello Good Mor");
}

}
