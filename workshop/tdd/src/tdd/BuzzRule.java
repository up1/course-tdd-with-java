package tdd;

public class BuzzRule implements MyRule {

	public boolean isValid(int input) {
		return input%5 == 0;
	}

	public String say() {
		return "Buzz";
	}

}
