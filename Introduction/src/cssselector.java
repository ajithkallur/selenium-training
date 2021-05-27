//it better to use css


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssselector {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("Ajith");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("pass");
		driver.findElement(By.cssSelector(".button r4 wide primary")).click();
		
		//button r4 wide primary
		//driver.findElement(By.cssSelector("#Login")).click(); // U can use # for id (#idname)
		//driver.findElement(By.cssSelector(".classname")).click(); // U can use # for classname (#idname)
		
}
	}


