import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertionandAssumationExamples {

	@Test
	public void TestAsseration()
	{
		//Test will pass
	    Assertions.assertEquals(4, 3);
	      
	    //Test will fail
	    Assertions.assertEquals(3, 2, "Calculator.add(2, 2) test failed");
	      
	    //Test will fail
	    Supplier<String> messageSupplier  = ()-> "Calculator.add(2, 2) test failed";
	    Assertions.assertEquals(3, 1, messageSupplier);

	    //test fail forcefully
	    Assertions.fail("not found good reason to pass");
	    
	    System.setProperty("ENV", "DEV");
	    Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	    System.setProperty("ENV", "PROD");
	    Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
}
