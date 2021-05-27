import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	// from city
	driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
	Thread.sleep(1000);
	//to city
	driver.findElement(By.xpath("(//a[contains(text(),'Bengaluru (BLR)')])[2]")).click();
	
	// dep date
	//driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
	
	Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
	
	// select 5 adults
	driver.findElement(By.id("divpaxinfo")).click();
	
	
	
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	
List<WebElement> allPassengers = s.getOptions();


for (int i = 0; i < allPassengers.size(); i++) {
	WebElement number=allPassengers.get(i);
	String alldata=allPassengers.get(i).getText();
	if (alldata.contains("5")) {
		number.click();
	}

}	

//click on family and friends check box

driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


	}
	
}



