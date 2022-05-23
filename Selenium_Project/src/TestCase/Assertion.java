package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	String actual = "yash";
	String expected="YASH";
	
	/*
	 * @Test private void hardassert() { System.out.println("start the execution");
	 * Assert.assertEquals(actual, expected);
	 * System.out.println("end of the execution"); }
	 */
	//hard assert will stop execution any error came on the spot itself and it is unit testcase
	//so it is not advanced so we will execute in soft assertion
         




	  @Test
	  private void softassert() {
	  SoftAssert sa = new SoftAssert();
      System.out.println("start the execution");
	  sa.assertEquals(actual, expected);
	  System.out.println("end of the execution"); 
	  sa.assertAll();
	  }

//by using asserall we will identify the error 







}
