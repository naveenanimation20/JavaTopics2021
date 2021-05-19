package StringQuestions;

import java.util.StringJoiner;

public class StringJoinerConcept {
	
	
	/**
	 * What is StringJoiner? -- in JDK 8
	 * @param args
	 */

	public static void main(String[] args) {

		//[Tom, Lisa, Naveen]
		StringJoiner joiner = new StringJoiner(";", "{", "}");
		
		joiner.add("Tom")
				.add("Lisa")
					.add("Naveen");
		
		System.out.println(joiner.toString());
		
		
	}

}
