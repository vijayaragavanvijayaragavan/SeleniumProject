package Support_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class univ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.srmist.edu.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement admission = driver.findElement(By.xpath("//a[text()='Admission']"));
		admission.click();
		WebElement apply = driver.findElement(By.xpath("//a[text()='Apply Now']"));
		apply.click();
		WebElement adms = driver.findElement(By.xpath("//a[@href=\"https://webstor.srmist.edu.in/web_assets/downloads/2022/srmjeel-law-ug-phase-one-instructions.pdf\"]"));
		adms.click();
		
		
	}

}
