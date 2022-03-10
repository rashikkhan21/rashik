package failedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
	
	
	@Test(retryAnalyzer = MyRetry.class)
	private void userNameValidation() {
		Assert.assertEquals("Rs", "as");
		
	}

}
