package Hyper_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Hyp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		link1.click();
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img"));
	    link2.click();

	    WebElement link3 = driver.findElement(By.partialLinkText("Find where am"));
	    String where = link3.getAttribute("href");
	    System.out.println("Where is the link "+where);
	    WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
	    broken.click();
	    String title = driver.getTitle();
	    if(title.contains("404")) {
	    	System.out.println("link is broken");
	    }
	    driver.navigate().back();
	    WebElement link4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		link4.click();
		driver.navigate().back();
		List<WebElement> howmany = driver.findElements(By.tagName("a"));
	    int listoftagname = howmany.size();
	    System.out.println("howmany :"+listoftagname );
		driver.quit();   
	    
	}

}
//WebElement broken = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
//if (broken.getAttribute("naturalWidth").contentEquals("0")) {
	//System.out.println("is broken ");
//}else {
	//System.out.println("not broken");
//}

