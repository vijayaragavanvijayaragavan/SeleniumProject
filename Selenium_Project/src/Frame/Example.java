package Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		List<WebElement> images=driver.findElements(By.xpath("//ul[@id='gallery']//following::li"));

		WebElement bin=	driver.findElement(By.id("trash"));
		for(WebElement img :images) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(img, bin).perform();
		}
		
		
		/*
		 * 
		 * driver.switchTo().frame(0);
		 * 
		 * WebElement drag = driver.findElement(By.xpath("//*[@id=\"gallery\"]//li[1]"));
		 * WebElement drop = driver.findElement(By.id("trash"));
		 * Actions ac = new Actions (driver);
		 * ac.dragAndDrop(drag, drop).perform;
		 */

	}

}
//*[@id="post-2669"]/div[2]/div/div/div[1]/p/iframe
//iframe[@class='demo-frame lazyloaded']
//*[@id="gallery"]