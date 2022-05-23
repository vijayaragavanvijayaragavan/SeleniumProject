package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_DoubleClick {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    click.click();
	   Actions ac = new Actions(driver);
	   WebElement dclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	   ac.doubleClick(dclick).perform();
	   WebElement click1 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	   ac.contextClick(click1).perform();
	    
	    
}

}
