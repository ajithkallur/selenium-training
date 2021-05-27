package Section14;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWinAndDeleteCook {


	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookieNamed("sessionKey");
	
	// Now click on any link and verify it is redirected to login page becasue we have deleted session cookies
	driver.get("https://google.com/");
	

	//Take screenshots

	File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\ajith.kumarreddy\\screenshot.png"));
	
	
	
	}


}
