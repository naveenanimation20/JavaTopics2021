package StringQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringQuotes {

	public static void main(String[] args) {

		String test = "I love java and testing";
		
		String finalResult = Stream.of(test.split("")) 
                .sorted((s1, s2) -> -1) 
                .collect(Collectors.joining()); 
		
		System.out.println(finalResult);
		
		
		
		
		
		String testing[] = test.split(" ");

		for (String e : testing) {
			System.out.print(rev(e) + " ");
		}
		
//		Arrays.asList(testing)
//			.stream()
//				.map(e -> StringQuotes.rev(e))
//					.collect(Collectors.toList())
//						.forEach(e -> System.out.print(e + " "));

	}

	private static String rev(String input) {
		if (0 == input.length()) {
			return "";
		}
		return input.charAt(input.length() - 1) + rev(input.substring(0, input.length() - 1));
	}

}
