package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Purchase {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.in/");
		WebElement search = driver1.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("tshirts");
		
		

		
	}

}
