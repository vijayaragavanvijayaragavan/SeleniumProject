package Sortable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Sortable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement from = elements.get(6);
		WebElement to = elements.get(0);
		WebElement from1 = elements.get(5);
		WebElement to1 = elements.get(1);
		WebElement from2= elements.get(4);
		WebElement to2= elements.get(2);
	
		Actions ac = new Actions(driver);
		ac.clickAndHold(from);
		ac.moveToElement(to);
		ac.perform();
		ac.clickAndHold(from1);
		ac.moveToElement(to1);
		ac.perform();
		ac.clickAndHold(from2);
		ac.moveToElement(to2);
		ac.perform();
		driver.quit();

	


	}

}
