package ArrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void getCharCount(String name) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for (char c : strArray) {
			//if (!String.valueOf(c).isBlank()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}
			//}
		}
		System.out.println(name + " : " + charMap);

	}

	public static void main(String[] args) {

		getCharCount("test");
		getCharCount("t");
		getCharCount("tt");
		getCharCount("testing java test");
		getCharCount("t ");
		getCharCount(" ");
		getCharCount("  ");
		getCharCount("sel sel sel");
		getCharCount(" sel sel sel ");

		// test --> t=2, e =1, s =1
		// t --> t=1
		// test auto -->
		// HashMap --> <k,V> --> <Character, Integer>

	}

}
