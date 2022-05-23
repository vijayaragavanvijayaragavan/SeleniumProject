package TestCase;

import org.testng.annotations.Test;

public class dependsOnMethod {
	
	@Test
	public void startTheCar() {
		System.out.println("first gear");
	}

	@Test(dependsOnMethods = "startTheCar")
	public void firstGear() {
		System.out.println("40kph");
	}

	@Test(dependsOnMethods = "firstGear")
	public void thirdGear() {
		System.out.println("70kph");
	}

	@Test(enabled = false)
	public void secondGear() {
		System.out.println("50kph");
	}

	@Test(dependsOnMethods = "thirdGear")
	public void fourthGear() {
		System.out.println("100kph");
	}

}
