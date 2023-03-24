package FacebookLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookLock {

	public static WebElement Email(WebDriver driver) {

		return driver.findElement(By.id("email"));

	}

	public static WebElement password(WebDriver driver) {

		return driver.findElement(By.id("pass"));
	}

	public static WebElement login(WebDriver driver) {

		return driver.findElement(By.id("loginbutton"));

	}

}
