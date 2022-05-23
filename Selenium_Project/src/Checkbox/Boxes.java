package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boxes {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		WebElement sql = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		
		sql.click();
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean selemium = selenium.isSelected();
		System.out.println(selenium);
		WebElement first = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(first.isSelected()) {
			first.click();
		}
		WebElement second = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(second.isSelected()) {
			second.click();
		}
		
	}

}
