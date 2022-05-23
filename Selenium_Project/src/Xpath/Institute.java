package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Institute {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rajalakshmi.org/");
	driver.manage().window().maximize();
	WebElement adms = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span/ul/li[2]/a"));
	adms.click();
	WebElement pg = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span/ul/li[2]/ul/li[2]/a"));
	pg.click();
	
	
	//frames concept
	//WebElement datascience = driver.findElement(By.
	//datascience.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
