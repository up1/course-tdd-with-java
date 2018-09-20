package tdd;

public class BossUpRule implements MyRule {

	public boolean isValid(int input) {
		return input%7 == 0;
	}

	public String say() {
		return "BossUp";
	}

}
