package tdd;

public class Hello {

	public String sayHi(String firstName) {
		if(firstName == null) {
			return "Hello Guest"; 
		}
		if(firstName.equals("xxx")) { 
			return "Urgent!!!";
		}
		String firstChar = firstName.substring(0, 1)
				            .toUpperCase();
		String remainChar 
		   = firstName.substring(1).toLowerCase();
		return String.format("Hello %s%s", firstChar, remainChar);
	}

}
