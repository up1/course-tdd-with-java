package tdd;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RangeFailTest {

	@Test(expected = RangeInputNullException.class)
	public void test1() {
		MyRange range = new MyRange();
		range.of(null);
	}

	@Test
	public void test2() {
		MyRange range = new MyRange();
		try {
			range.of(null);
			fail("Not have exception");
		} catch (RangeInputNullException e) {
		}
	}
	
	@Rule
	public ExpectedException thrown 
	                = ExpectedException.none();
	
	@Test
	public void test3() {
		MyRange range = new MyRange();
		
		thrown.expect(RangeInputNullException.class);
		thrown.expectMessage("XXX");
		range.of(null);
	}

}
