package StringQuestions;

import org.apache.commons.lang3.StringUtils;

public class CharacterOccurrence {

	/**
	 * count occurrences of a character in String
	 */

	String Name;
	double version = 0.0;

	public double CaseSwitch() {

		switch (Name) {
		case "Chrome":
			version = 1.0;
			System.out.println(version);
			return version;

		case "Opera":
			version = 2.0;
			System.out.println(version);
			return version;
		case "IE":
			version = 3.0;
			System.out.println(version);
			return version;
			
		default:
			System.out.println("Entered browers is not available" + Name);
			return 40.4;
		}
			
	}

	public static void main(String args[]) {
		CharacterOccurrence c = new CharacterOccurrence();
		c.Name = "Chrome";
		c.CaseSwitch();


		// o - 2
		// I - 1

		// CharArray -- for loops
		// str.len -- charAt(i)
		// Apache Common StringUtils
		// Streams
		String str = "I love coding and testing i am so happy";

//		getCharOccurrence(str, 'g');
//		getCharCount(str, 'i');
		// getCharCountUsingStreams(str, "g");

		int count = StringUtils.countMatches(str, "p");
		System.out.println(count);
	}

	public static void getCharCountUsingStreams(String str, String val) {
		long count = str.chars().mapToObj(e -> String.valueOf((char) e)).filter(e -> e.equals(val)).count();
		System.out.println(val + ":" + count);
	}

	public static void getCharCount(String str, char val) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}

	public static void getCharOccurrence(String str, char val) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == val) {
				count++;
			}
		}

		System.out.println(val + ":" + count);
	}

}
