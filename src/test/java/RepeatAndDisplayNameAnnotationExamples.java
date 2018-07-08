import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatAndDisplayNameAnnotationExamples {
	 	
	 	
	 	 @BeforeEach
	     public void initEach(RepetitionInfo info){
	         int currentRepetition = info.getCurrentRepetition();
	         int totalRepetitions = info.getTotalRepetitions();
	         //Use information as needed
	     }
	  
	     @Test
	     @DisplayName("Add operation test")
	     @RepeatedTest(value = 5, name="{displayName} :: repetition {currentRepetition} of {totalRepetitions}")
	     void addNumber(TestInfo testInfo) {
	         Calculator calculator = new Calculator();
	         Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	     }
	      
	     @AfterEach
	     public void cleanUpEach(RepetitionInfo info){
	         int currentRepetition = info.getCurrentRepetition();
	         int totalRepetitions = info.getTotalRepetitions();
	         //Use information as needed
	     }
}
