package Base_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser extends Base{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
				
		  //      WebDriver driver1 = new ChromeDriver();
				
				//driver.get("https://www.facebook.com/");
		
				WebDriver browser = getBrowser("chrome");
				geturl("https://www.facebook.com/");
				WebElement username = driver.findElement(By.xpath(""));
				
	}

}
