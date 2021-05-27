package Section13;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class AssignmentTable {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
driver.get("http://www.qaclickacademy.com/practice.php");
// 1st table xpath
WebElement table1= driver.findElement(By.id("product"));
//1st row->3rd child
//int count = table1.findElements(By.xpath("//div[@class ='cb-col cb-col-100 cb-scrd-itms']")).size();

int rowcount=table1.findElements(By.tagName("tr")).size();
int colcount = table1.findElements(By.cssSelector("tbody tr:nth-child(1) th")).size();
int colcount1 = table1.findElements(By.xpath("tbody/tr[1]/th")).size();
WebElement row3 =  table1.findElement(By.xpath("tbody/tr[3]"));

for(int i =0; i< colcount;i++) {
	System.out.println(row3.findElements(By.xpath("td")).get(i).getText());
	
}

System.out.println(rowcount);
System.out.println(colcount1);

}
}