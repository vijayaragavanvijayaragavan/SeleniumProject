package Download;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Download_Type {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement download = driver.findElement(By.id("downloadButton"));
		//download.click();
		//File filelocation = new File("\\\"C:\\\\Users\\\\vijay\\\\Desktop\\\\sampleFile (1).jpeg\\\"");
		//File[] totalfiles = filelocation.listFiles();
		//for (File file : totalfiles) {
			//if(file.getName().equals("download.jpeg")) {
				//System.out.println("file is downloaded");
				//break;
			//}
			
		//}
		WebElement upload = driver.findElement(By.id("uploadFile"));
		Actions ac = new Actions(driver);
		ac.moveToElement(upload).click().perform();
		StringSelection selection = new StringSelection("\"C:\\Users\\vijay\\Desktop\\sampleFile (1).jpeg\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
        driver.quit();
		
	}

}
