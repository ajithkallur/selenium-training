
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediffmail {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Find element by ID
		//driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("ajith.gitam@gmail.com");
		
		//driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("Sivaram@87");
		//driver.findElement(By.xpath("//input[@value = 'Go']")).click();
	
		
		//Practice code
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
	//	driver.findElement(By.cssSelector("input[@id= 'password']")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}
	}