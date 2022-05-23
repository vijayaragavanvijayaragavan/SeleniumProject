package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_One {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
	    WebElement home = driver.findElement(By.id("home"));
	    home.click();
	    driver.navigate().back();
	    WebElement size = driver.findElement(By.id("size"));
	    int height = size.getSize().getHeight();
	    int width = size.getSize().getWidth();
	    System.out.println("find the size : "+height);
	    System.out.println("find the size : "+width);
	    WebElement color = driver.findElement(By.id("color"));
	    String value = color.getCssValue("color");
	    System.out.println("what color:"+value);
	    WebElement position = driver.findElement(By.id("position"));
	    Point location = position.getLocation();
	    int x = location.getX();
	    int y = location.getY();
	    System.out.println("x value is :"+x);
	    System.out.println("y value is : "+y);
		
		
		
		
		
		
		
		
		
		
	}

}
