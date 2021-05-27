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


public class Tables {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22582/aus-vs-nz-2nd-test-new-zealand-tour-of-australia-2019-20");
// 1st table xpath
WebElement table1= driver.findElement(By.xpath("//div[@class ='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));
//1st row->3rd child
//int count = table1.findElements(By.xpath("//div[@class ='cb-col cb-col-100 cb-scrd-itms']")).size();

int count=table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
//java.util.List<WebElement> Scores = table1.findElements(By.xpath("//div[@class ='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]/div[@class ='cb-col cb-col-8 text-right text-bold']"));
int total =0;
for(int i =0; i<count; i++ ) {
	String value=table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();	
total = total + Integer.parseInt(table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());	

}
//xpath using sibling
//total = total + Integer.parseInt(table1.findElement(By.xpath("//div[text()= 'Extras']/following-sibling::div")).getText());

//Assert.assertEquals( Integer.parseInt(table1.findElement(By.xpath("//div[text()= 'Total']/following-sibling::div")).getText()), total);
	String tex = table1.findElement(By.xpath("//div[text()= 'Total']/following-sibling::div")).getText();
	

System.out.println(total);
	
	
	}
	

}