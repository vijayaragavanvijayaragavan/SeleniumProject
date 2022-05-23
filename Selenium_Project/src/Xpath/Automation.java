package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("vijayragavan27@gmail.com");
        WebElement click = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        click.click();
        WebElement gender = driver.findElement(By.id("id_gender1"));
        gender.click();
	
	}

}
