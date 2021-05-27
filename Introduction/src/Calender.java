
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert; //Used for assertions

public class Calender {

	
	public static void main(String[] args) throws InterruptedException {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		// select current date
		
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		//Thread.sleep(2000);
		//using css selector to select current date
	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//using xpath selector to select current date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']
		
		
		
		
	}
	}