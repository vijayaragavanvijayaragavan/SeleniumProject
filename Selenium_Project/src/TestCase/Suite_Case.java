package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite_Case {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void launchbrowser() {	
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
	
		
	}
	@Test
	public void goole() {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void yahoo() {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.quit();
	}
	@Test
	public void bing() {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
	}
	private long startTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime();
		System.out.println("total time : "+totalTime);
}
}