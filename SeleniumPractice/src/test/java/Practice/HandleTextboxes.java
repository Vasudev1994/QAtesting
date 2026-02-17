package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextboxes {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		
		WebElement fnameTxt= driver.findElement(By.id("firstName"));
		if(fnameTxt.isDisplayed()) {
			if(fnameTxt.isEnabled()) {
				fnameTxt.sendKeys("Surya");
				Thread.sleep(2000);
				fnameTxt.clear();
			}
			else {
				System.err.println("Firstname textbox is not enabled");
			}
			
		}
		else {
			
			System.err.println("Firstname textbox is not displayed");
		}
		
	}

}
