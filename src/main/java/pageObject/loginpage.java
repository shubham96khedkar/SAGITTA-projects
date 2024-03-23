package pageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FrameworkPractice.action.ActionClass;

public class loginpage {
	
	public static WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
    @FindBy(xpath="//input[@id='modalusername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement loginbutton;
	
	public void getURL() {
		
		driver.get("https://profile.w3schools.com/log-in");
	}
	
	public void username() {
		
		username.sendKeys("bddcucumber03@gamil.com");
		
	}
	public void password() {
		
		password.sendKeys("BDDcucumber@123");
		
	}
	public void loginbutton() {
		
		loginbutton.click();
		
	}
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	public void wrongCredentials() {
		
		username.sendKeys("abc");
		password.sendKeys("xyz");
		loginbutton.click();
		
	}
	public String getURLString() {
		
		return driver.getCurrentUrl();
		
	}
}
