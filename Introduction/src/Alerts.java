import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		String text="Rahul";
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
// click on alert ok
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());


// click on alert cancel
		driver.switchTo().alert().dismiss();
}
	}
