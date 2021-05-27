
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Parentchildxpath {

	
	public static void main(String[] args) {
		//Create a driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class = 'RNNXgb']/div/div[2]/input[@class = 'gLFyf gsfi']")).sendKeys("Sivaram@87");


	}
	}



//div[@class = 'RNNXgb']/div/div[2]/input[@class = 'gLFyf gsfi']