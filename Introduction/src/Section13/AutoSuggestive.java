package Section13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver();
    driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    
    driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
    // Selenium cannot extract hidden text
    System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
    
    // java script executer dom is used to extract the hidden elements
    
    JavascriptExecutor js = (JavascriptExecutor)driver;
    String txt = "return docuyment.getElementById()";
    
	
	
	}
}
