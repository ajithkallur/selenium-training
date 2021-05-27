package Section14;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TableColumnSorting {


	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("useAutomationExtension", false);
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	List<WebElement> fruits = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr/td[2]"));
	Iterator it = fruits.iterator();
	List<String> SortedList = new ArrayList<String>();
	List<String> OriginalList = new ArrayList<String>();
	while(it.hasNext()) {
		
		SortedList.add(((WebElement) it.next()).getText());	
		OriginalList.add(((WebElement) it.next()).getText());
	}
	// Sort List
	
	Collections.sort(SortedList);
	// Reverse Sorted List in descending order
	Collections.reverse(SortedList);
	
	Assert.assertTrue(SortedList.equals(OriginalList));
	
	}
	
}

