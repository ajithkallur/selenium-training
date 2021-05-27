

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	
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
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		
	List<WebElement> allPassengers = s.getOptions();
	System.out.println("allPassengers : " + allPassengers.size());
	
	for (int i = 0; i < allPassengers.size(); i++) {
		WebElement number=allPassengers.get(i);
		String alldata=allPassengers.get(i).getText();
		System.out.println("alldata : " + alldata);
		if (alldata.contains("5")) {
			number.click();
		}
	
	}		
		/*
		 * s.selectByValue("2"); 
		 * s.selectByIndex(2);
		 * s.selectByVisibleText("3");
		 */
		
		//driver.findElement(By.id("divpaxinfo")).click();
//
		   Thread.sleep(2000);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		//   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		//for(int i=1;i<5;i++)
//
		//{
//
	//	driver.findElement(By.id("hrefIncAdt")).click();

		}
	}

		//driver.findElement(By.id("btnclosepaxoption")).click();

	//	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
	
