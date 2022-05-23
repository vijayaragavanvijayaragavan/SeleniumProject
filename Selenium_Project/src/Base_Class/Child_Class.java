package Base_Class;

import java.io.IOException;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Child_Class extends browser_Launch {
	
	
public static void main(String[] args) throws IOException {
		
		chromeBrowser();
		url("https://www.google.co.in/", 20);
		WebElement name = byName("q");
		text(name, "mphasis \n");
		String gettitle = gettitle();
		System.out.println(gettitle);
		url("http://www.leafground.com/pages/Alert.html", 20);
		byxpath("//button[@onclick='normalAlert()']", 30);
		alert(driver);
		byxpath("//button[@onclick='confirmAlert()']", 30);
		alert1(driver);
		byxpath("//button[@onclick='confirmPrompt()']", 30);
		driver.switchTo().alert().dismiss();
		url("http://www.leafground.com/pages/autoComplete.html", 20);
		id("tags").sendKeys("e");
		int size = bypath("//*[@id='ui-id-1']/li").size();
		System.out.println(size);
		url("https://demoqa.com/buttons", 20);
	    byypath("//button[text()='Click Me']").click();
	    WebElement element = byypath("//button[text()='Double Click Me']");
	    url("https://letcode.in/dropdowns", 20);
	    WebElement down = id("fruits");
	    down(down, 3);
	    WebElement down1 = id("superheros");
	    down(down1, 2);
	    down(down1, 0);
	    down(down1,4);
	    WebElement down2 = id("country");
	    drop(down2, "India");
	    url("http://www.leafground.com/pages/frame.html", 30);
	    frame(driver, 0);
	    id("Click").click();
	    screen("./shots.png");
	    
	    
	    
	    
	  

	    
	    
	    
	    
	   // WebElement click1 = byypath("//button[text()='Double Click Me']");
	    
	    
	    
	    
	    
		
	    
	   
	    
		
		
		
		
		
	}

}
