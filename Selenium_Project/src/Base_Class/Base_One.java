package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base_One {
	public static WebDriver driver;
	public static WebDriver getBrowser(String browsername) {
	try {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");

		 driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		} else {
			System.out.println("System Error");

		} 
	} catch (Exception e) {
		// TODO: handle exception
		
	}
	return driver;
}
	public static void geturl(String url) {
		driver.get(url);
	}
	
}