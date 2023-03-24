package Facebooklogin;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FacebookLocater.op;

public class OpLogin {
	@Test
	public void oran() throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		PageFactory.initElements(driver, op.class);

		op.username.sendKeys("Admin");
		op.password.sendKeys("admin123");
		op.Login.click();
	}
}