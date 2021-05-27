import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Find element by ID
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("ajith.gitam@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("Sivaram@87");
		// Find element by Name
		
		//driver.findElement(By.name("pass")).sendKeys("Sivaram@87");
		
		// Find element by Link Text with anchor a
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//Error-> Compound name are not allowed
		//driver.findElement(By.name("pass 123")).sendKeys("ajith.gitam@gmail.com");
		
		//Error-> Compound classname are not allowed
	//	driver.findElement(By.className("pass 123")).sendKeys("ajith.gitam@gmail.com");
		
		//Selenium scans from top left when multiple items have same attribute name 
		//driver.findElement(By.className("inputtext")).sendKeys("ajith.gitam@gmail.com");
		
		// Find element by Xpath
		//driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		
		//css selector
		
		driver.findElement(By.cssSelector("input[value = 'Log In']")).click();
		
		
		//Regular expression
		
		
		//close the current browser
		//driver.close();
		//close all windows
		//driver.quit();
		
	}
}