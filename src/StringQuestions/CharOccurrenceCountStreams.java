package StringQuestions;

import java.util.function.IntPredicate;


public class CharOccurrenceCountStreams {

	/**
	 * Count the Number of Occurrences of a Given Character in a String using Java 8
	 * Streams?
	 * 
	 */

	public static void main(String[] args) {

		String str = "Testing solutions via naveen automaTion labs";

//		long count = str
//						.chars()
//							.filter(e -> (char)e == 's' || (char) e == 'i')
//								.count();
//		
//		System.out.println(count);

		System.out.println(getCharCount(str, 'T'));
		
		
		

	}

	public static long getCharCount(String str, char c) {

		return str.chars().filter(e -> (char) e == c).count();

	}

	public static long getCharCount(String str, char c1, char c2) {

		return str.chars().filter(e -> (char) e == c1 || (char) e == c2).count();

	}

}
