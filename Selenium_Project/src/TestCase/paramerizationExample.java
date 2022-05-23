package TestCase;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramerizationExample {
	
	@Parameters({"username","password"})
	@Test
	public void printname(@Optional ("kumar") String username, String password) {
		System.out.println("login details");
		System.out.println("username :"+username);
		System.out.println("password :"+password);
	}

}
