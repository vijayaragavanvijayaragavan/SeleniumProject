package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careers.mphasis.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement click = driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div[1]/div/div/div[2]/nav/a[1]"));
		click.click();
		TakesScreenshot screenshot = (TakesScreenshot) driver;	
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\\\Users\\\\vijay\\\\Desktop\\\\New folder.png");
		FileHandler.copy(source, destination);
		
		
	}

}
