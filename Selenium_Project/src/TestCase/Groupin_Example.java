package TestCase;

import org.testng.annotations.Test;

public class Groupin_Example {
	@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("vivo testing");
	}

	@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("vivo testing");
	}

	@Test(groups= {"samsung"})
	public void samsung1() {
		System.out.println("samasung testing");
	}
	@Test(groups= {"samsung"})
	public void samsung2() {
		System.out.println("samsung testing");
	}
	@Test(groups= {"apple"})

	public void apple1() {
		System.out.println("apple testing");
	}
	@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("apple testing");
	}


	
}
