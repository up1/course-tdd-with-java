package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest { 
	
	@Test
	public void sayHi_with_Null_expected_Hello_Guest() {
		// Arrange
		Hello hello = new Hello(); 
		// Act
		String message = hello.sayHi(null);
		// Assert
		assertEquals("Hello Guest", message);
	}
	
	@Test
	public void sayHi_with_SUNDAY_expected_Hello_Sunday() {
		// Arrange
		Hello hello = new Hello();
		// Act
		String message = hello.sayHi("SUNDAY");
		// Assert
		assertEquals("Hello Sunday", message);
	}
	
	@Test
	public void sayHi_with_SuNday_expected_Hello_Sunday() {
		// Arrange
		Hello hello = new Hello();
		// Act
		String message = hello.sayHi("SuNday");
		// Assert
		assertEquals("Hello Sunday", message);
	}
	
	@Test
	public void sayHi_with_Sunday_expected_Hello_Sunday() {
		// Arrange
		Hello hello = new Hello();
		// Act
		String message = hello.sayHi("Sunday");
		// Assert
		assertEquals("Hello Sunday", message);
	}

	@Test
	public void sayHi_with_somkiat_expected_Hello_Somkiat() {
		// Arrange
		Hello hello = new Hello();
		// Act
		String message = hello.sayHi("somkiat");
		// Assert
		assertEquals("Hello Somkiat", message);
	}
	
	

}
