package tdd;

public class FizzBuzzRule implements MyRule {

	public boolean isValid(int input) {
		return input%15 == 0;
	}

	public String say() {
		return "FizzBuzz";
	}

}
