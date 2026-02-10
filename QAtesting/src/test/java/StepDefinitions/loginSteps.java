package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.loginpage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
	
	WebDriver driver;
	loginpage lp;
	
	@Given("user should access application url as {string}")
	public void user_should_access_application_url_as(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new loginpage(driver);
		driver.get(url);		
	    
	}

	@When("user should enter username as {string} and password as {string}")
	public void user_should_enter_username_as_and_password_as(String uname, String upasswrd) {
		lp.Username(uname);
		lp.Password(upasswrd);
	    
	}

	@Then("user should click on login button")
	public void user_should_click_on_login_button() {
		lp.login();
	    
	}

	@And("user should verify homepage title as {string}")
	public void user_should_verify_homepage_title_as(String title) {
		
		if(driver.getPageSource().contains(title)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

}
