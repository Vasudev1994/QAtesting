package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(id="user-name")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login-button")
	WebElement btn;
	
	
	public void Username(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void Password(String passwrd) {
		txtpassword.sendKeys(passwrd);
	}
	
	public void login() {
		btn.click();
	}

}
