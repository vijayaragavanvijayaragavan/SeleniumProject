package Support_Launch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		String oldwindow = driver.getWindowHandle();
		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
			
		driver.switchTo().window(newwindow);
		}
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));
	   edit.click();
	   Thread.sleep(2000);
	   driver.close();
	   driver.switchTo().window(oldwindow);
	   
	   WebElement multibox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	  multibox.click();
	  int size = driver.getWindowHandles().size();
	  System.out.println("NO. OF WINDOWS OPENED : "+size);
	  
	  WebElement dontclose = driver.findElement(By.id("color"));
	  dontclose.click();
	  Set<String> handles2 = driver.getWindowHandles();
	  for (String allwindows : handles2) {
		 if(!allwindows.equals(oldwindow)) {
			 driver.switchTo().window(allwindows);
			 driver.close();
			 
		 }
		
	}
	  
		
		
	}

}
