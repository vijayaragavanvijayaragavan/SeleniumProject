package Support_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ups_Downs {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=17311750230740935735&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=EAIaIQobChMIjPO-4ZzD9wIVwg5yCh3KCwuEEAAYASAAEgKFGPD_BwE");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", down);
		Thread.sleep(2000);
		WebElement ups = driver.findElement(By.id("nav-logo-sprites"));
		je.executeScript("arguments[0].scrollIntoView", ups);
		je.executeScript("window.scrollby(0,2000)");
		je.executeScript("window.scrollby(0,-1000)");
		
		
		
	}

}
