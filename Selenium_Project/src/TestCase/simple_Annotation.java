package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeMethod;

public class simple_Annotation {
	@BeforeSuite
	public void setup() {
		System.out.println("new setup");
	}
	@BeforeTest
	public void browserLaunch() {
		System.out.println("chrome browser");
	}
	@BeforeClass
	public void enterURL() {
		System.out.println("url");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@Test
	public void laptop1() {
		System.out.println("laptop1");
	}
	@Test
	public void laptop2() {
		System.out.println("laptop2");
	}
	@AfterMethod
	public void verifyHomePage() {
		System.out.println("homepage");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	@AfterSuite
	public void deletecookies() {
		System.out.println("delete the cookies");
	}
}
