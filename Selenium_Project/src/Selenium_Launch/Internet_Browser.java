package Selenium_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://edu.google.com/");
	}

}
