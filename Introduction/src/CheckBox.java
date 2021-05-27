

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert; //Used for assertions

public class CheckBox {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		// returns bool
		//Assertions
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected()); 
	// You can use Assert Equal
		//System.out.print(v);
		
		//count number of check boxes
		
		System.out.print( driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}
	}
