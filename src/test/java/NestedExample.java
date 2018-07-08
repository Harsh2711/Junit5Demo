import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedExample {

	@Nested
	    @DisplayName("when new")
	    class WhenNew {
		@BeforeEach
        void createNewStack() {
           System.out.println("WhenNew Class BeforeEach");
        }

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            System.out.println("Test");
        }

	 }
	
	@Nested
    @DisplayName("when new")
    class WhenNew1 {
	@BeforeEach
    void createNewStack() {
       System.out.println("WhenNew1 Class BeforeEach");
    }

    @Test
    @DisplayName("is empty")
    void isEmpty() {
        System.out.println("Test");
    }

 }
	 
}
