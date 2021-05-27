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


public class AssignmentFrames {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();


		driver.get("https://the-internet.herokuapp.com/");
		
		
		
	driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
	
		
	driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	System.out.println(driver.findElement(By.id("content")).getText());	
	
		
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
	}
	}