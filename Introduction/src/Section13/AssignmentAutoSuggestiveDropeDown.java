package Section13;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
// Enter the letters BENG
// Verify if Airport option is displayed in the suggestive box
public class AssignmentAutoSuggestiveDropeDown {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver();

driver.get("http://www.qaclickacademy.com/practice.php");
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");


JavascriptExecutor js= (JavascriptExecutor)driver;

String script = "return document.getElementById(\"autocomplete\").value;";
String text=(String) js.executeScript(script);

int i =0;
//BENGALURU INTERNATION AIPORT
while(!text.equals("India"))
{
i++;
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);

text=(String) js.executeScript(script);
//System.out.println(text);
if (i ==10) break;
}
Assert.assertEquals("India", text );

}





}