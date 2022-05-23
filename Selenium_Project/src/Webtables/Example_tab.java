package Webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_tab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		List<WebElement> Tabledata = driver.findElements(By.xpath("//div[@class='rt-td']"));
		for (WebElement data : Tabledata) {
			System.out.println(data.getText());
			List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-tr-group']['rt-tr -odd']['rt-td']"));
			int totalsize = rows.size(); {
				System.out.println("size : "+totalsize);
				WebElement tab = driver.findElement(By.xpath("//div[@class='rt-td'][5]"));
				String value = tab.getText();
				System.out.println("The text is :"+value  );
				WebElement tab1 = driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[@class='rt-td'][2]"));
				String value1 = tab1.getText();
				System.out.println("the text is :"+value1);
				
				
				
				WebElement delete = driver.findElement(By.xpath("//span[@id='delete-record-1']"));
				delete.click();
				
			}
			
		}
	}
	
}

//div[@class='rt-table']---whole table
//div[@class='rt-tr']---table row
//div[@class='rt-td']---table datas
//div[@class='rt-tr-group']['rt-tr -odd']['rt-td']