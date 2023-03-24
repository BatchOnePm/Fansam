package Facebooklogin;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import FacebookLocater.facebookLock;

public class LoginPage {
	@Test
	public void LoginPageloc() {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		facebookLock.Email(driver).sendKeys("Fansamv1998@gmail.com");
		facebookLock.password(driver).sendKeys("Fansamv1998@");
		facebookLock.login(driver).click();

	}

}
