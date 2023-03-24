package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Concepts {
	
	@Before
	public void browserLaunch()
	{
		System.out.println("Browser will be launched");
	}
	
	@After
	public void shutdown()
	{
		System.out.println("Application shutdown");
	}
	
	
	@Given("Load the mail application")
	public void load_the_mail_application() {
	    
	}

	@When("provide the valid username and valid password")
	public void provide_the_valid_username_and_valid_password() {
	    
	}

	@When("click the ok button")
	public void click_the_ok_button() {
	   
	}

	@Then("User able to login inside the mail")
	public void user_able_to_login_inside_the_mail() {
	   
	}

	@When("provide the Invalid username and valid password")
	public void provide_the_invalid_username_and_valid_password() {
	    
	}

	
	@When("provide the valid username and Invalid password")
	public void provide_the_valid_username_and_invalid_password() {
	    
	}

	@Then("User Unable to login inside the mail")
	public void user_unable_to_login_inside_the_mail() {
	    
	}

}
