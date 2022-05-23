package Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("SingleFrame");
		
		
		WebElement textbox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	    textbox.sendKeys("smith");
	    Thread.sleep(2000);
	    
	    driver.switchTo().defaultContent();
	    
	    WebElement clickbox = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
	    clickbox.click();
	    WebElement outer = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	    driver.switchTo().frame(outer);
	    System.out.println("outer");
	    Thread.sleep(2000);
	    WebElement inner = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	    driver.switchTo().frame(inner);
	    System.out.println("inner");
	    Thread.sleep(2000);
	    
	    WebElement target = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	   target.sendKeys("Dhoni");
	   driver.switchTo().defaultContent();
	 
	   List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	   int size = frames.size();
	   System.out.println(size);
	
	   driver.quit();
	   
	   
	    
	
    
	
	}

}
