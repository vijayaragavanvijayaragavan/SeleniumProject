package Seelectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		 List<WebElement> Selectab = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int list = Selectab.size();
		System.out.println(list);
		
		Actions ac = new Actions (driver);
		ac.clickAndHold(Selectab.get(0));
		ac.clickAndHold(Selectab.get(1));
		ac.clickAndHold(Selectab.get(2)).perform();
	
		
		
		
		 
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
