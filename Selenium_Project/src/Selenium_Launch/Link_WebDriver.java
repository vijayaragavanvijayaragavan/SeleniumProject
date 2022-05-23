package Selenium_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_WebDriver {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("http://www.leafground.com/pages/Edit.html");
		
		driver1.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver1.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("text");
		driver1.findElement(By.name("username")).getAttribute("TestLeaf");
		driver1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
		driver1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		

	}

}
