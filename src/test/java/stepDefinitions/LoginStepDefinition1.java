package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginpage;

public class LoginStepDefinition1 extends TestBase {
	
	
	loginpage lp=new loginpage(driver);
	
	@Given("Navigate to URL")
	
	public void navigate_to_URL() throws IOException {
		
		lp.getURL();
	 }
	
	@When("Enter username and password and click on login button")
	
	public void Enter_username_and_password_and_click_on_login_button() {
		
		lp.username();
		lp.password();
		lp.loginbutton();
		
	} 
	@Then("User should land on homepage")
	
	public void User_should_land_on_homepage() {
		
		String actual=lp.getTitle();
		assertEquals(actual,"Log in - W3Schools");
		
	}
	
	@When("Enter wrong username and password and click on login button")
	
	public void Enter_wrong_username_and_password_and_click_on_login_button() {
		
		lp.wrongCredentials();
		
	}
	
	@Then("User should land on homepage and verify URL")
	
	public void User_should_land_on_homepage_and_verify_URL() {
		
		String actual2=lp.getURLString();
		assertEquals(actual2,"https://profile.w3schools.com/log-in");
		
		
	}
	
}


