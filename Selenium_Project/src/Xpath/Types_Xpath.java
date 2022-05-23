package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vijayragavan27@gmail.com");
		WebElement pswd = driver.findElement(By.id("pass"));
		pswd.sendKeys("123456");
		WebElement fulltext = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
		System.out.println(fulltext.getText());
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		WebElement google = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/div/a"));
	    google.click();
		//div[@id='globalContainer']
		//*[@class='fb_logo _8ilh img']
		//a[contains(@href,'https://www.facebook.]com/')][1]
		//h2[starts-with(text(),'Facebook helps ')]
		
		
	}

}
