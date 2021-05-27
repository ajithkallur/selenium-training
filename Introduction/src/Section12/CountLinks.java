package Section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class CountLinks {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
		//total number of links in web page
	
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	
	//limit the scope of driver
	WebElement footer = driver.findElement(By.id("gf-BIG"));
	
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	
	WebElement footerColumn = driver.findElement(By.xpath("//td[1]//ul[1]"));
	
	System.out.println(footerColumn.findElements(By.tagName("a")).size());
	
	//Click on each link and check if it is working or now
	
	//open links in new tab by pressing control
	
	for (int i = 1; i < footerColumn.findElements(By.tagName("a")).size(); i++) {
		//used for hitting multiple keys
		String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
		footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		Thread.sleep(5000L);
		
	}
	// Get title of each tab
	Set<String> windowId = driver.getWindowHandles();
	Iterator<String> itr = windowId.iterator();
	//get parent window id
	
	//Get child window ids
	while(itr.hasNext()){
		driver.switchTo().window(itr.next());
		System.out.println(driver.getTitle());
		}
	
	
	}
	
}
