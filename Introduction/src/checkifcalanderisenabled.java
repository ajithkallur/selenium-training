
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert; //Used for assertions

public class checkifcalanderisenabled {

	
	public static void main(String[] args) throws InterruptedException {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		// select current date
		//click on round trip button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//check if return date section is enabled or not
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			
			System.out.print("RoundTrip is Enabled");
		}
		else
		{
			System.out.print("RoundTrip is Enabled");
		}
		//Thread.sleep(2000);
		//using css selector to select current date
	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//using xpath selector to select current date
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']
		
		
		
		
	}
	}