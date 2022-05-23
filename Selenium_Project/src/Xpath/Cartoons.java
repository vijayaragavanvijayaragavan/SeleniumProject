package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartoons {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tvguide.com/tvshows/tom-and-jerry/tv-listings/1030235406/");
		driver.manage().window().maximize();
		WebElement overview = driver.findElement(By.xpath("//*[@id=\"1030235406\"]/div/div[1]/div/div/ul/li[1]"));
		overview.click();
		Thread.sleep(2000);
		WebElement seasons = driver.findElement(By.xpath("//*[@id=\"1030235406\"]/div/div[1]/div/div/ul/li[1]"));
		seasons.click();
		driver.quit();
	}

}
