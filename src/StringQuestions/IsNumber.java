package StringQuestions;

//Check given number is valid or not

//Check given phone number is valid -- 10 digits
//Check given CC number is valid -- 16 digits

public class IsNumber {
	
	public static boolean isCorrectPhonerNumber(String number) {
		 //return number.matches("[0-9]{10}");
		 return number.matches("\\d{10}");
	}
	
	public static boolean isCorrectNumber(String number) {
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
	}
	
	public static boolean isCorrectPhNumber(String number) {
		if (number.length() == 10 && isCorrectNumber(number)) {
			System.out.println("valid ph number: " + number);
			return true;
		}
		System.out.println("not a valid ph number: " + number);
		return false;

	}

	public static boolean isNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("this is a valid number: " + number);

		} catch (NumberFormatException e) {
			System.out.println("not a valid number: " + number);
			return false;
		}
		return true;

	}

	public static boolean isValidPhonerNumber(String number) {
		if (number.length() == 10 && isNumber(number)) {
			System.out.println("valid ph number: " + number);
			return true;
		}
		System.out.println("not a valid ph number: " + number);
		return false;

	}

	public static boolean isValidCCNumber(String number) {
		if (number.length() == 16 && isNumber(number)) {
			System.out.println("valid CC number: " + number);
			return true;
		}
		System.out.println("not a valid CC number: " + number);
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isNumber("123a"));
		System.out.println(isValidPhonerNumber("8989876789"));
		System.out.println(isValidPhonerNumber("90909"));
		System.out.println(isValidPhonerNumber("89898767891"));
		System.out.println(isValidCCNumber("8989876789909898"));
		System.out.println(isCorrectPhonerNumber("987654567890"));
		System.out.println(isCorrectPhonerNumber("9999878987"));
		
		System.out.println(isCorrectNumber("100"));
		System.out.println(isCorrectNumber("100.12"));
		System.out.println(isCorrectNumber("-100.12"));
		System.out.println(isCorrectNumber("-120"));
		System.out.println(isCorrectNumber("120A"));
		System.out.println(isCorrectNumber("-120AA"));
		System.out.println(isCorrectNumber("9999878987"));

		System.out.println(isCorrectPhNumber("-9898789878"));



	}

}
