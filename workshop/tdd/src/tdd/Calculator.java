package tdd;

import java.util.Random;

public class Calculator {
	MyRandom random;
	
	public void setRandom(MyRandom random) {
		this.random = random;
	}

	public int add() {
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		return a+b;
	}

}
