package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class InvalidLogin {
	WebDriver driver;
	
	@Given("lanch the google cjrome")
	public void lanch_the_google_cjrome() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Given("lode the OrangeHrm URL")
	public void lode_the_orange_hrm_url() throws InterruptedException {
		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);

	   
	}

	@When("providing invalid Login Detalis")
	public void providing_invalid_login_detalis() throws InterruptedException {
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Aaiweriyo");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin12asdgj");

	   Thread.sleep(2000);
	}

	@When("Cick the login button")
	public void cick_the_login_button() throws InterruptedException {
		WebElement butt=driver.findElement(By.xpath("//button[@type='submit']"));
		butt.click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		if(text.equals("Invalid credentials")) {
			System.out.println("It is invalid successfull");
		}
		else {
			System.out.println("not valid");
		}
		
	
	
		driver.quit();
		
	   
	}

}
