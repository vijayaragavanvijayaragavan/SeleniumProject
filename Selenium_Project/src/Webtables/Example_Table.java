package Webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int totalcolumn = column.size();
		System.out.println("no. of column :"+totalcolumn);
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int totalsize = row.size();
		System.out.println("no. of row : "+totalsize);
		WebElement cent = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[3]/td[2]"));
		String text = cent.getText();
		System.out.println("pertcentage value :"+text);
		WebElement cent1 = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[4]/td[2]"));
		String text1 = cent1.getText();
		System.out.println("percentage value :"+text1);
		WebElement cent2 = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[5]/td[2]"));
		String text2 = cent2.getText();
		System.out.println("percentage value :"+ text2);
		WebElement least = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[6]/td[3]"));
		least.click();
		driver.quit();
		}
	}

            //DOM STRUCTURE//<<<<<to remember
////table[@cellspacing='0']/tbody/tr[6]/td[3]=======complete Xpath for the table
//table 
  // table body
      //<th>//<th/>---->>>>table header
      //<tr>//<tr/>----->>>table row
            //<td></td>---->>table data