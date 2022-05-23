package TextBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("VIJAYARAGAVAN R");
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("vijayragavan27@gmail.com");
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("velmurugan nagar,"
				           + " gandhipuram,"
				           + " cuddalore");
		WebElement permanent = driver.findElement(By.id("permanentAddress"));
		permanent.sendKeys("Same As Above");
		WebElement click = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(click));
		click.click();
		driver.quit();
		
		
	}

}
