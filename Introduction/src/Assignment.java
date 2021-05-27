import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */

/**
 * @author Ajith.KumarReddy
 *
 */
public class Assignment {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.xpath("//input[@data-selectionhandler = 'originAirlineSelectionHandler']")).clear();
		driver.findElement(By.xpath("//input[@data-selectionhandler = 'destinationAirlineSelectionHandler']")).clear();
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("3");
		Select childern = new Select(driver.findElement(By.id("Childrens")));
		childern.selectByValue("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select classOfFlight = new Select(driver.findElement(By.id("Class")));
		classOfFlight.selectByIndex(2);
		driver.findElement(By.id("SearchBtn")).click();
		System.out.print(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
		

	}

}
