package Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Frames {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();


		driver.get("https://jqueryui.com/droppable/");
		
		
		
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	
		//Switch to frame using index
	driver.switchTo().frame(0);
		// switch to frame using webelement 
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Actions dragDrop= new Actions(driver);
		//drag and drop
		dragDrop.dragAndDrop(source, target).perform();
		//come back to default window
		driver.switchTo().defaultContent();
		
	}
	}