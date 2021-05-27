
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class DynamicDropDown {

	
	public static void main(String[] args) throws InterruptedException {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		//WebDriverWait wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_Adult")));
		//driver.manage().timeouts().implicitly wait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Bengaluru (BLR)')])[2]")).click();
		
	}
}


