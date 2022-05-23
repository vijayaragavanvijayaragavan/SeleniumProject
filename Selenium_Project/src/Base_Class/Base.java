package Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public static WebDriver getBrowser(String Browsername){ 
		try {
			if (Browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");

              driver = new ChromeDriver();
			} else if (Browsername.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\IEDriverServer.exe");

				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Browser");
			} 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return driver;
	}
		public static void geturl(String url) {
		driver.get(url);
	}

}
