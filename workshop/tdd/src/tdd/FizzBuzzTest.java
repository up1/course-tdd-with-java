package tdd;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void noFizzNoBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));
		assertEquals("4", fb.say(4));
//		assertEquals("7", fb.say(7));
		assertEquals("8", fb.say(8));
	}
	
	@Test
	public void newReq() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "BossUp";
		assertEquals(expected, fb.say(7));
	}
	
	@Test
	public void fizz() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "Fizz";
		assertEquals(expected, fb.say(3));
		assertEquals(expected, fb.say(6));
		assertEquals(expected, fb.say(9));
	}
	
	@Test
	public void buzz() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "Buzz";
		assertEquals(expected, fb.say(5));
		assertEquals(expected, fb.say(10));
	}
	
	@Test
	public void fizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "FizzBuzz";
		assertEquals(expected, fb.say(15));
		assertEquals(expected, fb.say(30));
	}
	
}
