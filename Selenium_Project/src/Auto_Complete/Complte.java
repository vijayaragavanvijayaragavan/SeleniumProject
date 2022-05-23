package Auto_Complete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complte {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.id("tags"));
		box.sendKeys("e");
		Thread.sleep(2000);
		List<WebElement> cl = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		int size = cl.size();
		System.out.println(size);
		
		for (WebElement webElement : cl) {
			if(webElement.getText().equals("Cucumber")) {
				webElement.click();
				break;
			}
		}
		

	}

}
