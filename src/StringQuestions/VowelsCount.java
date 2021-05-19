package StringQuestions;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

import com.google.common.base.CharMatcher;
import com.google.common.collect.ObjectArrays;

public class VowelsCount {

	/**
	 * total number of vowels within a java String using : 
	 * java, java 8 and 
	 * Google
	 * guava lib.
	 * 
	 * aeiou
	 */

	// java:
	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

	public static void main(String[] args) {

		String str = "aeiouAEIOU";
		int vCount = 0;

		for (int x = 0; x < str.length(); x++) {
			if (isVowel(str.charAt(x))) {
				vCount++;
			}
		}

		System.out.println(vCount);

		// Java 8 Streams:
		System.out.println("using Java 8 Streams:");

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I'
						|| t == 'O' || t == 'U';
			}
		};

		String test = "aeiou";
		long count = test.chars().filter(vowel).count();
		System.out.println(count);

		// using Google Guava:
		String st = "Aa";
		int voCount = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		System.out.println(voCount);
		
		
		
	    
	}

}
