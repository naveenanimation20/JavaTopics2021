package StringQuestions;

import java.util.Arrays;

/**
 * Why password should be stored in char array char[] instead of string?
 * 
 * @author naveenautomationlabs
 *
 */
public class PasswordStore {

	public static void main(String[] args) {

		String pwd = "Naveen123";
		System.out.println("pwd is: " + pwd);
		
		char c[] = new char[]{'N','a','v','e','e','n','1','2','3'};
		System.out.println("pwd is : " + c);
		
		Arrays.fill(c, '*');
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		
		
	}

}
