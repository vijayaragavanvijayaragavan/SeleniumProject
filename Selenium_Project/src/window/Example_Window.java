package window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String oldwindow = driver.getWindowHandle();
		WebElement  oldwindow1 = driver.findElement(By.id("tabButton"));
	    oldwindow1.click();
	    driver.switchTo().window(oldwindow);
	    WebElement newwindow = driver.findElement(By.id("windowButton"));
	    newwindow.click();
	    int totalwindow = driver.getWindowHandles().size();
	    System.out.println("No.of windows :"+totalwindow);
	    driver.switchTo().window(oldwindow);
	    WebElement messagewindow = driver.findElement(By.id("messageWindowButton"));
	    messagewindow.click();
	    driver.quit();
	    
	}

}
