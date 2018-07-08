import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatAndDisplayNameAnnotationExamples {
	 	@Test
	    @DisplayName("Add operation test")
	    @RepeatedTest(5)
	    void addNumber(TestInfo testInfo) {
	 		System.out.println(testInfo.getDisplayName());   
	 		   
	    }
}
