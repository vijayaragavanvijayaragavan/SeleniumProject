package Base_Class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser_Launch {
	public static WebDriver driver;

	public static void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	public static void internetexplorer() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
	}
	public static void url(String url,long seconds) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public static  WebElement byName(String name) {
		return driver.findElement(By.name(name));
	}
	public static WebElement id(String value) {
		return driver.findElement(By.id(value));
	}
	public static void text(WebElement element,String value) {
		element.sendKeys(value);	
	}
	public static String gettitle() {
		return driver.getTitle(); 
	}
	public static void byxpath(String xpathExpression,long seconds) {
		driver.findElement(By.xpath(xpathExpression)).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
    }
	public static void keys(WebElement element ,String value) {
		element.sendKeys(value);
	}
	public static void alert(WebDriver lt) {
		lt.switchTo().alert().accept();
	}
	public static void alert1(WebDriver lt1) {
		lt1.switchTo().alert().dismiss();
	}
	public static void alert2(WebDriver lt2,String keytosend) {
		lt2.switchTo().alert().sendKeys(keytosend);
	}
	public static List<WebElement> bypath(String xpathExpression ) {
		return driver.findElements(By.xpath(xpathExpression));
	}
	public static WebElement byypath(String xpathExpression){
	
		return driver.findElement(By.xpath(xpathExpression));	
	}
	public static <driver> void mouse(driver Actions ) {
	Actions ac = new Actions(driver);
	ac.doubleClick().perform();	
	}
	public static void drop(WebElement dd, String val ) {
		Select sc = new Select(dd);
		sc.selectByValue(val);
	}
	public static void value(WebElement dp, String val1) {
		Select sc = new Select(dp);
		sc.selectByVisibleText(val1);
	}
	public static void down(WebElement dw,int val2) {
		Select sc = new Select(dw);
		sc.selectByIndex(val2);
	}
	public static void frame(WebDriver frame1, int bal ) {
		frame1.switchTo().frame(bal);
	}
	public static void screen(String fileLocation) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File(fileLocation);
		FileHandler.copy(source, destination);
	}
	
	

} //Actions ac = new Actions(driver);
//WebElement dclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
//ac.doubleClick(dclick).perform();
	
		
		

	
	
	
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(long Seconds))
			//	wait.until(ExpectedConditions.alertIsPresent());   
		
	
   

