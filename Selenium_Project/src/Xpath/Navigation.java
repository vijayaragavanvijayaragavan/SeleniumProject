package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("vijayragavan27@gmail.com");
    WebElement pswd = driver.findElement(By.id("pass"));
    pswd.sendKeys("123456");
    WebElement login = driver.findElement(By.name("login"));
    login.click();
    driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUxNzM0ODkxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
    driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
    
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("vijay27");
    WebElement pswd1 = driver.findElement(By.name("password"));
    pswd1.sendKeys("abcdef");
    WebElement login1 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
    login1.click();
    driver.quit();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

}
}