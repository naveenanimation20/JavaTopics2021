package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewDemo {

	public static void main(String[] args) {


		String str = "231Java123Selenium456Testing ";
		
	      String regex = "\\d+";
	      //Creating a pattern object
	      Pattern pattern = Pattern.compile(regex);
	      //Creating a Matcher object
	      Matcher matcher = pattern.matcher(str);
	      System.out.println("Digits in the given string are: ");
	      while(matcher.find()) {
	         System.out.println(matcher.group()+" ");
	         String a = matcher.group();
	         str = str.replaceAll(a, reverse(a)).trim();
	      }
	      System.out.println(str);
		
	}
	
	private static String reverse(String newStr) {
		if(newStr.length() == 1) {
			return newStr;
		}
		String rev = "";
		for(int i=newStr.length()-1; i>=0; i--) {
			rev = rev + newStr.charAt(i);
		}
		return rev;
	}

}
