import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert; //Used for assertions

public class CheckboxAssignment {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	//	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	//	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		// returns bool
		//Assertions
	//	Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		Assert.assertEquals(3, driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}
	}