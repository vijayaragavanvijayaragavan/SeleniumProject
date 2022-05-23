package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		WebElement email = driver1.findElement(By.id("email"));
		email.sendKeys("vijayragavan27@gmail.com");
		WebElement Pswd = driver1.findElement(By.name("pass"));
		Pswd.sendKeys("Vijaycool");
		WebElement click = driver1.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		click.click();
		

	}

}
