package Section9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddMultipleItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith.kumarreddy\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
		// List<WebElement> products = driver.;
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String name = driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText();
			String[] arrSplit = name.split("- ");
			if (Arrays.asList(itemsNeeded).contains(arrSplit[0].trim())) {
				// Thread.sleep(2000);
				// product-action
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();

				// we should not use Text to identify button because as soon as it clicks text
				// changes to added
				// driver.findElements(By.xpath("//button[text() = 'ADD TO
				// CART']")).get(i).click();
				// Thread.sleep(2000);
				if (j == itemsNeeded.length-1)
					break;
				j++;

			}

		}

	}
}
