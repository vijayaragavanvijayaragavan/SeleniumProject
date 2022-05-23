package Webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		System.out.println("==========no.of rows=======" );
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr"));
		for (WebElement data : rows) {
			System.out.println(data.getText());
		}
		System.out.println("=========total datas====");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/td"));
		for (WebElement data1 : alldata) {
			System.out.println(data1.getText());
		}
		System.out.println("=====total columns====");
		List<WebElement> columns = driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr/th"));
		for (WebElement data2 : columns) {
			System.out.println(data2.getText());
		}
	}

}
