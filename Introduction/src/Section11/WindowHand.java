package Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class WindowHand {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();


		driver.get("https://accounts.google.com/signup");
		//a[contains(text(),'Help')]
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//System.out.println(driver.getTitle());
		
		// get all window ids in set
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> it = windowId.iterator();
		//get parent window id
		String parentId = it.next();
		//Get child window id
		String childId = it.next();
		//switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		//Swith to Parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		//Actions builder = new Actions(driver);
	//hold shift type hello and select hello string
	//	builder.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//Right click on element
		//builder.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
	
	}
	}