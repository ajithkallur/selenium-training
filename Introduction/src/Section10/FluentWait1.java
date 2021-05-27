package Section10;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait1 {

	

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
//Implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//WebDriverWait w = new WebDriverWait(driver, 20);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				if(driver.findElement(By.xpath("//div[@id='finish']")).isDisplayed()) {
					return driver.findElement(By.xpath("//div[@id='finish']"));
				}
				else
				return null;
			}
		});
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']")).getText());
		
	}
	}