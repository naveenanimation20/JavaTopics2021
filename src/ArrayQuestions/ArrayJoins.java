package ArrayQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class ArrayJoins {

	/**
	 * Join Two Arrays using Java 8 and Google Guava Library
	 * 
	 */

	public static void main(String[] args) {

		String[] batsmen = { "Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Shubhman" };

		String[] bowlers = { "Hardik", "Bhuvi", "Bumrah", "Chahal", "Jaddu" };

		// with Java 8:
		Stream<String> sBat = Arrays.stream(batsmen);
		Stream<String> sBow = Arrays.stream(bowlers);

		String fullTeam[] = Stream.concat(sBat, sBow).toArray(size -> new String[size]);

		for (String s : fullTeam) {
			System.out.println(s);
		}

		System.out.println("----------");
		
		// Google Guava:
		// for object arrays:
		String allTeam[] = ObjectArrays.concat(batsmen, bowlers, String.class);
		for (String s : allTeam) {
			System.out.println(s);
		}

		System.out.println("----------");

		// for primitive types arrays:

		int p1[] = { 1, 2, 3, 4, 5 };
		int p2[] = { 6, 7, 8, 9, 10 };

		int p3[] = Ints.concat(p1, p2);
		for (int i : p3) {
			System.out.println(i);
		}

	}

}
