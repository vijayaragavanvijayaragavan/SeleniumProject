package TestCase;

import org.testng.annotations.Test;

public class PriorityCase_One {
	@Test(priority=0)
	public void firstTestCase() {
		System.out.println("first");
	}

	@Test(priority=1)
	public void secondTestCase() {
		System.out.println("second");
	}

	@Test(priority=2)
	public void thirdTestCase() {
		System.out.println("third");
	}

	@Test(priority=3)
	public void fourthTestCase() {
		System.out.println("fourth");
	}

}