package Drop_Down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Example_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dd = driver.findElement(By.id("fruits"));
	    Select Select = new Select (dd);
	    dd.click();
	    Select.selectByIndex(2);
	    Select.selectByValue("4");
	    Select.selectByVisibleText("Pine Apple");
	    
	    WebElement multiple = driver.findElement(By.id("superheros"));
	    Select select1=new Select(multiple);
	    select1.selectByIndex(0);
	    select1.selectByIndex(4);
	    select1.selectByIndex(3);
	    WebElement lang = driver.findElement(By.id("lang"));
	    Select select3= new Select(lang);
	    select3.selectByIndex(4);
	    System.out.println(lang.getText());
	    WebElement down = driver.findElement(By.id("country"));
	    Select select2 = new Select (down);
	    select2.selectByIndex(6);
	    System.out.println("the country name is :"+select2.getFirstSelectedOption().getText());
	    select2.deselectAll();
		
		
		
	}

}
