package pomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	@FindBy(id="txtUsername")
	public static WebElement username;
	@FindBy(id="txtPassword")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	public static WebElement submit;
	

}
