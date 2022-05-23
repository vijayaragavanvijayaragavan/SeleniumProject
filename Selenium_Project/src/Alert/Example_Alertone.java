package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_Alertone {
	
	public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement click1 = driver.findElement(By.id("alertButton"));
	click1.click();
	driver.switchTo().alert().accept();
	
	WebElement confirm = driver.findElement(By.id("confirmButton"));
	confirm.click();
	driver.switchTo().alert().dismiss();
	WebElement prompt = driver.findElement(By.id("promtButton"));
	prompt.click();
	Alert prompt1 = driver.switchTo().alert();
	prompt1.sendKeys("vijay");
	prompt1.accept();
	WebElement timealert = driver.findElement(By.id("timerAlertButton"));
	timealert.click();
	
	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.alertIsPresent());
	//Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(Exception.class);
	

	
	driver.switchTo().alert().accept();
	
	
	
	driver.quit();
	


}
}