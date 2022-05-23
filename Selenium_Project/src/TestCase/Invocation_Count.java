package TestCase;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test (invocationCount = 5)
	public void vivo2() {
		System.out.println("vivo testing");
	}

	@Test (invocationCount = 10)
	public void samsung1() {
		System.out.println("samasung testing");
	}

}
