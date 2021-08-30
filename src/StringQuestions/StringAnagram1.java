package StringQuestions;

import java.util.Arrays;

/**
 * Write Java Program To Check Whether Two Strings Are Anagram Or Not?
 * 
 * @author naveenautomationlabs
 *
 */
public class StringAnagram1 {

	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);

		}

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("Listen", "Silen t"));
		System.out.println(isAnagram("Lives", "ELVIS"));
		System.out.println(isAnagram("CAT", "act"));
		System.out.println(isAnagram("Toss", "shot"));
		System.out.println(isAnagram("joy", "enjoy"));
		System.out.println(isAnagram("Listen", "Silent "));
		System.out.println(isAnagram("Li    ste   n", "Si   l     e    nt "));
		System.out.println(isAnagram("T", "T"));

	}

}
