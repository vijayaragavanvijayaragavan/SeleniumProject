
package Drop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("http://www.leafground.com/pages/Dropdown.html");
    
    WebElement dd = driver.findElement(By.id("dropdown1"));
    Select Select = new Select (dd);
    Thread.sleep(2000);
    Select.selectByIndex(2);
    Thread.sleep(2000);
    Select.selectByValue("1");
    Thread.sleep(2000);
    Select.selectByVisibleText("Loadrunner");
    
    List<WebElement> ListElements = Select.getOptions();
    int size = ListElements.size();
    System.out.println("number of elements : "+size);
    
    dd.sendKeys("UFT/QTP");
 WebElement multiselectbox =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
    
    Select multiselectbox1 = new Select(multiselectbox);
    multiselectbox1.selectByIndex(2);
    multiselectbox1.selectByIndex(3);
    multiselectbox1.selectByIndex(0);
    
   
	}

}
