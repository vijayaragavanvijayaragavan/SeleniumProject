package Selenium_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.redbus.in/");
		
		//WebElement email = driver1.findElement(By.id("email"));
		//email.sendKeys("vijayragavan27@gmail.com");
		
	  //driver1.findElement(By.name("pass")).sendKeys("123456");
	  // driver1.findElement(By.name("login")).click();
	   
	  // driver1.findElement(By.name("q")).sendKeys("chennai"+Keys.ENTER);
	   //driver1.findElement(By.)
		
	//findElement(By.xpath("/html/body/div[3]/div/div[3]/ul/li[2]/a")).click();
	
		WebElement from = driver1.findElement(By.id("src"));
				from.sendKeys("chennai");
		WebElement to = driver1.findElement(By.id("dest"));
		         to.sendKeys("cuddalore");
		
	
		
	}

}
