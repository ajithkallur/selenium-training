package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		
		
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		String checkbox = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		s.selectByVisibleText(checkbox);
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains(checkbox));
		
		
	}
	}

