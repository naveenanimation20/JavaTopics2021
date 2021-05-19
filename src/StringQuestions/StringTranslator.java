package StringQuestions;

import java.lang.reflect.Field;

public class StringTranslator {

	/**
	 * Create a String Language Translator using reflection api in java
	 * Auto Bots
	 * 
	 * @param args
	 */

	static {

		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Naveen", value.get("Hola naveen"));
			value.set("Good Morning Naveen", value.get("Buenos dias naveen"));
			value.set("How are you?", value.get("¿Cómo estás?"));
			value.set("I need help in Java", value.get("Please refer naveen automationlabs"));

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		System.out.println("Hello Naveen");
		System.out.println("Good Morning Naveen");
		System.out.println("How are you?");
		System.out.println("I need help in Java");


	}

}
