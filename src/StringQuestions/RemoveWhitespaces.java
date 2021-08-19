package StringQuestions;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhitespaces {

	/**
	 * Remove all whitespaces from a String
	 * @param args
	 */
	
	public static void main(String[] args) {

		String newString = "      Naveen Automation Labs   \n   "
				+ " testing      "
				+ " python "
				+ "  \n javascript \t";
		System.out.println(newString);
//		
//		String newArr[] = newString.split("\\s");
//		StringBuffer remString = new StringBuffer();
//		for(String e : newArr) {
//			remString.append(e);
//		}
//		
//		System.out.println(remString);
		
		String noWhiteSpaceString = "";
		for(int i=0; i<newString.length(); i++) {
			
			if((newString.charAt(i)!=' ') && (newString.charAt(i)!='\t')) {
				noWhiteSpaceString = noWhiteSpaceString + newString.charAt(i);
			}
			
		}
		
		System.out.println(noWhiteSpaceString);
		
		//System.out.println(newString.trim());
		
		System.out.println(newString.trim().replaceAll("\\s+", ""));
		
//		String remString = StringUtils.deleteWhitespace(newString);
//		System.out.println(remString);
		
		
		
	}

}
