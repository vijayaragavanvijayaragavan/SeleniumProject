package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test(retryAnalyzer=MyRetry.class)
	private void usernamevalidate() {
	Assert.assertEquals('A', 'a');	
	}
	private void userpasswordvalidate() {
    Assert.assertEquals('B', 'b');
}
}