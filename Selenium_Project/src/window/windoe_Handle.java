package window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoe_Handle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String oldwindow = driver.getWindowHandle();
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		edit.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		WebElement multiple = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		multiple.click();
		int totalwindow = driver.getWindowHandles().size();
		System.out.println("no.of windows :"+totalwindow);
		WebElement color = driver.findElement(By.id("color"));
		color.click();
		Set<String> newhandle = driver.getWindowHandles();
		for (String allwindow : newhandle) {
			if(!allwindow.equals(oldwindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}
			
		}
		driver.quit();
		
	}

}
