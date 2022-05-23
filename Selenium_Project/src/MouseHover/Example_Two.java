package MouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebElement search = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		Actions ac = new Actions(driver);
		search.click();
		WebElement box = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		ac.moveToElement(search).moveToElement(box).click();
	
	}

}
