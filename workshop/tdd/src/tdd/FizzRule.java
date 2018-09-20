package tdd;

public class FizzRule implements MyRule {

	public boolean isValid(int input) {
		return input%3 == 0;
	}

	public String say() {
		return "Fizz";
	}

}
