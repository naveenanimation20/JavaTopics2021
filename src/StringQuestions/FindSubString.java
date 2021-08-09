package StringQuestions;

/**
 * Check substring is present in a given String
 * 
 * @author naveenautomationlabs
 *
 */

public class FindSubString {

	public static boolean isSubstring(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");
	}
	
	public static boolean isSubstring1(String main, String sub) {
		return main.contains(sub);
	}
	
	public static boolean isSubstring2(String main, String sub) {
		return main.indexOf(sub)!=-1;
	}

	public static void main(String[] args) {
		
		System.out.println(isSubstring1("naveen automation labs", "labs"));
		System.out.println(isSubstring2("naveen automation labs", "labs"));
		System.out.println(isSubstring("naveen automation labs", "labs"));
		
		
		System.out.println(isSubstring("naveen automation labs", "naveen"));
		System.out.println(isSubstring("naveen automation labs", "testing"));
		System.out.println(isSubstring("naveen automation labs $$ special", "$$"));

		System.out.println(isSubstring("automation", "auto"));

		System.out.println(isSubstring("automation", "test"));
		System.out.println(isSubstring("automation", "ti"));
		System.out.println(isSubstring("automation", "a"));
		System.out.println(isSubstring("automation11", "11"));
		System.out.println(isSubstring("automation11", "1"));

		System.out.println(isSubstring("automation", null));
		System.out.println(isSubstring("automation labs", " "));
		System.out.println(isSubstring("automation labs", "  "));

	}

}
