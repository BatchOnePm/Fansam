package FacebookLocater;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class op {
@FindBy(name="username")
	public static WebElement username;
@FindBy(name = "password")
	public static WebElement password;
@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Login;

}
