package StringQuestions;

import java.text.DecimalFormat;

/**
 * Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special
 * Characters In String
 * 
 * @author naveenautomationlabs
 * 
 *         In 'Naveen AutomationLabs 123 %#' : Uppercase letters are 10.71%
 *         Lowercase letters are 60.71% Digits Are 10.71% Other Characters Are
 *         17.86%
 *
 */
public class ElementPercentage {

	public static void getCharPercentage(String str) {

		int len = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digits = 0;
		int specChars = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specChars++;
			}

		}

		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitsPercentage = (digits * 100.0) / len;
		double specCharsPercentage = (specChars * 100.0) / len;

		System.out.println("In the given String: " + str);
		DecimalFormat formatter = new DecimalFormat("##.##");

		System.out.println("upper case % ---> " + formatter.format(upperCasePercentage));
		System.out.println("lower case % ---> " + formatter.format(lowerCasePercentage));
		System.out.println("digits % ---> " + formatter.format(digitsPercentage));
		System.out.println("special char % ---> " + formatter.format(specCharsPercentage));
		
		System.out.println(upperCasePercentage+lowerCasePercentage+digitsPercentage+specCharsPercentage);
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		getCharPercentage("Naveen");
		getCharPercentage("Naveen AutomationLabs");
		getCharPercentage("Naveen AutomationLabs 12345");
		getCharPercentage("Naveen AutomationLabs 12345 %$%%%&*");
		getCharPercentage("N");
		getCharPercentage("1");
		getCharPercentage("1$");
		getCharPercentage(" ");
		
	}

}
