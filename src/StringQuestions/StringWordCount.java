package StringQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Get the Count of total words in a given Capitalized String
 * @author naveenautomationlabs
 *
 */
public class StringWordCount {
	
	

	public static void main(String[] args) {		
		
		String input = "rrrffagggg";
		List<String> charList = new ArrayList<>();
        for (char ch : input.toCharArray()) {
        	charList.add(String.valueOf(ch));
        }
        System.out.println(charList);
        Map<Character, Long> charFrequency = charList.stream() 
		        .flatMap(a -> a.chars().mapToObj(c -> (char) c)) 
		        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		charFrequency.forEach((k,v) -> System.out.print(v+""+k));
		
		
		System.out.println();
		//
		String s = "rrrffagggg";//3r2ff1a4gg
		Map<Character, Integer> charSeq = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			charSeq.merge(c,1,Integer::sum);      
		}
		charSeq.forEach((k,v) -> System.out.print(v+""+k));
		System.out.println();
	   
		
//		
//	      
//		System.out.println();
//		
//		String str = " thisNaveenAutomationLabsYoutubeTestingJavapop";
//		
//		//if small char word string is at the beginning:
//		
//		int c=0;
//		if(Character.isLowerCase(str.trim().charAt(0))) {
//			c++;
//		}
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
//				c++;
//			}
//		}
//		
//		System.out.println(c);
//		
//		
//		//1. 
//		int count = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		
//		//2.
//		int count1 = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) >= 65 && str.charAt(i)<=90) {
//				count1++;
//			}
//		}
//		
//		System.out.println(count1);
//		
//		//3. 
//		int count2 = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(Character.isUpperCase(str.charAt(i))) {
//				count2++;
//			}
//		}
//		System.out.println(count2);
//		
//		//4. streams:
//		long count4 = str.chars().filter(e -> e>=65 && e<=90).count();
//		System.out.println(count4);
//		
//		//5.
//		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
//		System.out.println(count5);
//		
//		//6. reg exp:
//		String reg = "[A-Z]+";
//		Pattern pattern = Pattern.compile(reg);
//		Matcher matcher = pattern.matcher(str);
//		int count6 = 0;
//		while(matcher.find()) {
//			count6+=matcher.group(0).length();
//		}
//		System.out.println(count6);
//	}

}
	
}

