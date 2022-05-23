package Webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schools {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> list = driver.findElements
(By.xpath("//table[@class='ws-table-all']//td[.='Ernst Handel']//following::td"));
		for (WebElement data : list) {
		System.out.println(data.getText());
	    if(data.getText().equals("Italy")) {
	    break;
			}
			
		}	
			
			
			
		
	
		
		
		}
	}

//for (File file : totalfiles) {
//if(file.getName().equals("download.jpeg")) {
	//System.out.println("file is downloaded");
	//break;
		
		
		/*
		 * List<WebElement> header =
		 * driver.findElements(By.xpath("//table[@class='ws-table-all']//th"));
		 * System.out.println("no.of headers:"+header); List<WebElement> rows =
		 * driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
		 * System.out.println("no.of rows:"+rows); List<WebElement> datas =
		 * driver.findElements(By.xpath("//table[@class='ws-table-all']//td"));
		 * System.out.println("no.of datas:"+datas);
		 */
	


