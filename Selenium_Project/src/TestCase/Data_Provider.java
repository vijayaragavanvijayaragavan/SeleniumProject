package TestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Provider {
	

	@Test (dataProvider= "logindata")
	public void logindata( String username, String password) {
		System.out.println("login details");
		System.out.println("username :"+username);
		System.out.println("password :"+password);
	}
	
	
	@DataProvider
	private Object[][] logindata() {
		return new Object[][]{
				{"aaa","111"},{"bbb","222"},  {"ccc","333"}
		};
		

}


}
