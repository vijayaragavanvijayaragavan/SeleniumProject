package TestCase;

import org.testng.annotations.Test;

public class Depends_Methods {
	@Test
	public void highSchool() {
		System.out.println("high school");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher sec school");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("college");
	}

}
