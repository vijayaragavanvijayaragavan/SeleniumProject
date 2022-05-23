package MouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_One {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drage2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
		WebElement location1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement location2 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement location3 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement location4 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag1, location1).perform();
		ac.dragAndDrop(drage2, location2).perform();
		ac.dragAndDrop(drop1, location3).perform();
		ac.dragAndDrop(drop2, location4).perform();
	}

}
