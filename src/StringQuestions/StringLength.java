package StringQuestions;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * how to find length of string in java without using length method?
 * 
 * @author naveenautomationlabs
 *
 */

public class StringLength {

	public static void main(String[] args) {
		String str = "testing";

		System.out.println(str.toCharArray().length);

		System.out.println(str.lastIndexOf(""));

		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);

		System.out.println(str.split("").length);

		int l = new StringBuilder(str).length();
		System.out.println(l);

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

		System.out.println(getLength("naveen selenium"));
		
		
		int l1=0;
		String st = "123testing";
		try {
			l1 = st.getBytes("UTF-16BE").length/2;
		}
		catch(Exception e) {
			
		}
		
		System.out.println(l1);
		System.out.println(getStringLenght("testing"));

		StringJoiner joiner = new StringJoiner("," , "[", "]");
		joiner.add("Red")
		  .add("Green")
		  .add("Blue");

		System.out.println(joiner.toString());
		
		
		
	}

	public static int getLength(String str) {
		int i = 0;
		try {
			
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}
		

	}
	
	public static int getStringLenght(String str) {
		
		String st[] = str.split("");
		
		int count = 0;
		
		for(String s : st) {
			count += s.toCharArray().length;
		}
		
		return count;
		
		
	}
	
	
	
	
	

}
