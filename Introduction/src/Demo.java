import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // if page landed in expeceted URL
		System.out.println(driver.getPageSource());
		
		driver.get("https://www.yahoo.com/");
		// Navigate back to previous page
		driver.navigate().back(); 
		driver.navigate().forward(); 
		//close the current browser
		driver.close();
		//close all windows
		driver.quit();
		
	}
}
