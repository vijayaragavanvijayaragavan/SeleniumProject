package TestCase;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut = 1000)
	public void vivo2() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("vivo testing");
	}

	@Test(timeOut=500)
	public void samsung1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("samasung testing");
	}

}
