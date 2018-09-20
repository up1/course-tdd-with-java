package tdd;

public class MyRange {

	public String of(String input) {
		
		if(input == null) {
			throw new RangeInputNullException("XXX");
		}
		
		int start = getStart(input);
		int end = getEnd(input);
		String result = "";
		for(int i=start; i<=end; i++) {
			result += i + ",";
		}
		return result.substring(0, result.length()-1); 
	}

	public int getStart(String input) {
		if(input.startsWith("[")) {
			return input.charAt(1) - 48;
		}
		return input.charAt(1) - 47;
	}

	public int getEnd(String input) {
		if(input.endsWith("]")) {
			return input.charAt(3) - 48;
		}
		return input.charAt(3) - 49;
	}

}
