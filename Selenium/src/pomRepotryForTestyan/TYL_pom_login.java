package pomRepotryForTestyan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TYL_pom_login {

	public TYL_pom_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy (partialLinkText  = "Enter Email here") WebElement email;
	@FindBy (xpath="//input[aria-labelledby = 'vs1__combobox']") WebElement contryCode;
	@FindBy(linkText = "Enter number here") WebElement mobNumber;
	@FindBy(partialLinkText  = "Login") WebElement buttonLogin;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContryCode() {
		return contryCode;
	}
	public WebElement getMobNumber() {
		return mobNumber;
	}
	public WebElement getButtonLogin() {
		return buttonLogin;
	}
	
}
