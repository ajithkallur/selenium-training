import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/"); 
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		//URL in the browser
		//driver.findElement(By.xpath("//input[@placeholder='From']"));
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
		
		
		//source.clear();
		//source.sendKeys("MUM");
		//Thread.sleep(2000);
		//source.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		//input[@placeholder='To']
		Thread.sleep(2000);
		//URL in the browser
		//driver.findElement(By.xpath("//input[@placeholder='From']"));
		driver.findElement(By.xpath("(//p[contains(text(),'Delhi')])")).click();
		
		
		//WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
		//destination.clear();
		//destination.sendKeys("DEL");
		//Thread.sleep(2000);
		//destination.sendKeys(Keys.ARROW_DOWN);
		//destination.sendKeys(Keys.ENTER);

	}

}
