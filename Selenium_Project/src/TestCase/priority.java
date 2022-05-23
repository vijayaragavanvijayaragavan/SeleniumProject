
package TestCase;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("first gear");
	}

	@Test(priority=1)
	public void firstGear() {
		System.out.println("40kph");
	}

	@Test(priority=4)
	public void thirdGear() {
		System.out.println("70kph");
	}

	@Test(priority=2)
	public void secondGear() {
		System.out.println("50kph");
	}

	@Test(priority=3)
	public void fourthGear() {
		System.out.println("100kph");
	}

}
