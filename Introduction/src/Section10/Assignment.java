package Section10;

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
//Implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 20);


		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		//a[contains(text(),'Click to load get data via Ajax!')]
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.print(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		
	}
	}