package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_context {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mens Tshirt");
		Thread.sleep(2000);
		String tle = driver.getTitle();
		System.out.println(tle);
		WebElement find = driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(2000);
		find.click();
		driver.navigate().to("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
	}

}
