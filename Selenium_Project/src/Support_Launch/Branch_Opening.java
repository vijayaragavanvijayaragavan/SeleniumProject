package Support_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Branch_Opening {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\'"
				+ "txtUsername\']"));
		username.sendKeys("79456");
		
		WebElement forgotpswd = driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));
		forgotpswd.click();
		
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\'divPassword\']/span"));
		pswd.sendKeys("hdfcorg");
		WebElement reset = driver.findElement(By.linkText("/webres_6269ab9a630104.26436116/themes/default/images/login/logo.png"));
		reset.click();
		WebElement element = driver.findElement(By.partialLinkText("webres_6269ab9a630104.26436116"));
         element.click();
		
	}

}
