package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work_Calendar {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		driver.manage().window().maximize();
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		WebElement date = driver.findElement(By.xpath("//a[text()='10']"));
		date.click();
		driver.quit();
		
		
		
		
	}

}
