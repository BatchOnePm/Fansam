package Stepdef;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver;

	@Given("lanch  the google chrome")
	public void lanch_the_google_chrome() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Given("load the orangeHrm URL")
	public void load_the_orange_hrm_url() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);

	}

	@When("Provide the log in ditels")
	public void provide_the_log_in_ditels() {
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");

	}

	@When("Clic the log button")
	public void clic_the_log_button() throws InterruptedException {
		WebElement butt=driver.findElement(By.xpath("//button[@type='submit']"));
		butt.click();
		Thread.sleep(2000);
		

	}

	@Then("Verify the result")
	public void verify_the_result() {
		
		String title=driver.getTitle();
		if(title.equals("OrangeHRM")) {
			System.out.println("successfull login ");
		}
		else {
			System.out.println("not successfull");
		}
		
		

	}
	@When("closs the browser")
	public void closs_the_browser() {
	   driver.close();
	}

}
