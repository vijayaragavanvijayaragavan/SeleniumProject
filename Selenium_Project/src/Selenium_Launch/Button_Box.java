package Selenium_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Box {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("http://www.leafground.com/pages/Button.html");
		WebElement getpositionButton=driver1.findElement(By.id("position"));
		
		Point xypoint=getpositionButton.getLocation();
		int x = xypoint.getX(); 
		int y = xypoint.getY();
		System.out.println("");
		
		WebElement colorButton =driver1.findElement(By.id("color"));
		
	String color=colorButton.getCssValue("background-color");
	System.out.println("Button color is :"+ color);
	WebElement Buttonsize = driver1.findElement(By.id("size"));
	int height =Buttonsize.getSize().getHeight();
	int width = Buttonsize.getSize().getWidth();
	
	System.out.println("height is : "+height);
	System.out.println("width is :"+width);
	
	WebElement homeButton = driver1.findElement(By.id("home"));
	homeButton.click();
	
	
	
		
		
		
	}
}

