package Images;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_Image {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/broken");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement image = driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));
	image.click();
	driver.navigate().back();
	WebElement click1 = driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']"));
	click1.click();
	driver.get("https://demoqa.com/broken");
	WebElement broken = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]"));
	if(broken.getAttribute("naturalWidth").equals("0")){
		System.out.println("image broken");
	}else {
		System.out.println("not broken");
	}
	
}
}