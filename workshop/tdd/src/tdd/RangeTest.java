package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void endWithIncludeAnd5_expected_5() {
		MyRange range = new MyRange();
		int result = range.getEnd("[1,5]");
		assertEquals(5, result); 
	}
	
	@Test
	public void endWithExcludeAnd5_expected_4() {
		MyRange range = new MyRange();
		int result = range.getEnd("[1,5)");
		assertEquals(4, result); 
	}
	
	@Test
	public void startWithIncludeAnd1_expected_1() {
		MyRange range = new MyRange();
		int result = range.getStart("[1,5]");
		assertEquals(1, result); 
	}
	
	@Test
	public void startWithExcludeAnd1_expected_2() {
		MyRange range = new MyRange();
		int result = range.getStart("(1,5]");
		assertEquals(2, result);
	}
	

	@Test
	public void xxxxx() {
		MyRange range = new MyRange();
		assertEquals("1,2,3,4,5", range.of("[1,5]"));
		assertEquals("1,2,3,4", range.of("[1,5)"));
		assertEquals("2,3,4,5", range.of("(1,5]"));
		assertEquals("2,3,4", range.of("(1,5)"));
	}

}
