package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		
		WebElement Course=driver.findElement(By.id("course"));
		Select Coursedropdown = new Select(Course);
		Coursedropdown.selectByValue("java");
		Thread.sleep(3000);
		WebElement ide=driver.findElement(By.id("ide"));
		Select idedropdown = new Select(ide);
		idedropdown.selectByValue("nb");
		
		
		
		
	}

}
