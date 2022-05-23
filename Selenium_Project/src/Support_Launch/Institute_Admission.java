package Support_Launch;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Institute_Admission {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rajalakshmi.org/");
		driver.manage().window().maximize();
		
		WebElement adms = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span/ul/li[2]/a"));
		adms.click();
		WebElement pg = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span/ul/li[2]/ul/li[2]/a"));
		pg.click();
		WebElement data = driver.findElement(By.xpath("//a[text()='  Apply Now']"));
		Actions ac = new Actions(driver);
		ac.contextClick(data).perform();
	

	}

}
