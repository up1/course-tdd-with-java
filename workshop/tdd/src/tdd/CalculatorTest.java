package tdd;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_return_5() {
		MyRandom random = new StubRandom();
		Calculator calculator = new Calculator();
		calculator.setRandom(random);
		int result = calculator.add();
		assertEquals(5, result);
	}

}

class StubRandom implements MyRandom {
	private int i;

	public int nextInt(int bound) {
		if(i==0) {
			i++;
			return 2;
		}
		return 3;
	}
}
