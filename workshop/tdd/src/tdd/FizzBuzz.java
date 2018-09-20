package tdd;

public class FizzBuzz {

	public String say(int input) {
		
		MyRule[] allRules = new MyRule[] {
				new FizzBuzzRule(),
				new FizzRule(),
				new BuzzRule(),
				new BossUpRule()
		};
		
		for (MyRule myRule : allRules) {
			if(myRule.isValid(input)) {
				return myRule.say();
			}
		}
		
		return String.valueOf(input);
	}

}
