package tdd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Step 1
@RunWith(Parameterized.class)
public class HelloDataTest { 
	
	// Step 2
	@Parameters(name = "{index}: sayHi({0})={1}")
	public static Collection<Object[]> xxxxx() {
		return Arrays.asList(new Object[][] {
			
			{"somkiat", "Hello Somkiat"},
			{"soMkiat", "Hello Somkiat"},
			{"SOMKIAT", "Hello Somkiat"},
				{ null, "Hello Guest"},
			
		});
	}
	
	// Step 3
	private String name;
	private String expectedResult;

	public HelloDataTest(String name, String expectedResult) {
		this.name = name;
		this.expectedResult = expectedResult;
	}


    // Step 4
	@Test
	public void sayHi() {
		// Arrange
		Hello hello = new Hello(); 
		// Act
		String message = hello.sayHi(this.name);
		// Assert
		assertEquals(this.expectedResult, message);
	}
	
	

}
