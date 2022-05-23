package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement totalframes = driver.findElement(By.xpath("//iframe"));
		Dimension i = totalframes.getSize();
		System.out.println(i);
		driver.switchTo().frame(1);
		WebElement name = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
		name.sendKeys("vijayragavan");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement lastname = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
		lastname.sendKeys("R");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div"));
	    System.out.println("inner");
	    driver.switchTo().frame(1);
		WebElement mail = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
		mail.sendKeys("vijayragavan27@gmail.com");
		driver.quit();
	}

}






///html/body/app-root/app-frame-content/div/div/form/div[1]/div/input
///html/body/app-root/app-frame-content/div/div/form/div[2]/div/input
///html/body/app-root/app-innerframe/div/div/div/div/div/input
//iframe[@src='innerFrame']