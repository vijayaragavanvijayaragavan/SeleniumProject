package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation_Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement simple = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		simple.click();
		WebElement simple1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		simple1.click();
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirm.click();
		Actions ac = new Actions(driver);
		WebElement confirm1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		ac.click(confirm1).perform();
		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		prompt.click();
		WebElement prompt1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		ac.click(prompt1).perform();
		Alert prompt2 = driver.switchTo().alert();
		prompt2.getText().replaceAll("Automation Testing user", "vijay");
		prompt2.accept();
		
		
		
		
		
		
		
		
		
	}

}
