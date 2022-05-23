package extend_Report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reported_Type {
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReporter; 
	ExtentTest testCase;
	
	@BeforeSuite
	public void launchbrowser() {	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		extentReport=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");

	
		
	}
	@Test
	public void goole() {
		testCase = extentReport.createTest("verify google Title");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if(title.equals("Google")) {
			testCase.log(Status.PASS, "Actual title and expected title are equal");
			System.out.println("passed");
		}else {
			testCase.log(Status.PASS, "Actual title and expected title are not equal");

			System.out.println("failed");
		}
		driver.quit();
		
	}
	@Test
	public void yahoo() {
		testCase = extentReport.createTest("verify yahoo Title");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		String title = driver.getTitle();
		if(title.equals("yahoo")) {
			testCase.log(Status.PASS, "Actual title and expected title are equal");

			System.out.println("passed");
		}else {
			testCase.log(Status.PASS, "Actual title and expected title are not equal");

			System.out.println("failed");
		}
		driver.quit();
	}
	@Test
	public void bing() {
		testCase = extentReport.createTest("verify bing Title");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		if(title.equals("bing")) {
			testCase.log(Status.PASS, "Actual title and expected title are equal");

			System.out.println("passed");
		}else {
			testCase.log(Status.PASS, "Actual title and expected title are not equal");

			System.out.println("failed");
		}
		driver.quit();
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();

}
}

