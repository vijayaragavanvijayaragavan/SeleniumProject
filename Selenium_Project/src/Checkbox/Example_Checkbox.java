package Checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Checkbox {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
		button.click();
		WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
		home.click();
		WebElement docu = driver.findElement(By.xpath("//span[text()='Documents']"));
		docu.click();
		List<WebElement> office = driver.findElements(By.xpath("//span[text()='Office']"));
		int size = office.size();
		System.out.println("Total size :"+size );
	}
	

	
}
//*[@id="tree-node"]/ol/li/span/label/span[1]/svg/path